package team.service;

/**
 * @Author liming
 * @Date 2022/6/28 18:04
 **/

import team.domain.Architect;
import team.domain.Designer;
import team.domain.Employee;
import team.domain.Programmer;

/**
 * 关于开发团队成员的管理、添加、删除等
 */
public class TeamService {
    private static int counter = 1;    //给memberId赋值使用
    private final int MAX_MEMBER = 5;  //限制开发团队的人数
    private Programmer[] team = new Programmer[MAX_MEMBER];  //保存开发团队成员
    private int total;  //记录开发团队中实际的人数

    public TeamService() {
    }

    /**
     * 获取开发团队中的所有成员
     * @return
     */
    public Programmer[] getTeam(){
        //return team;   //team里面也许只有2个有内容，剩下3个都没内容
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < team.length; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    /**
     * 将指定的员工添加到开发团队中——添加员工有很多失败方式
     * @param e
     */
    public void addMember(Employee e) throws TeamException {
        //成员已满，无法添加
        if(total >= MAX_MEMBER){
            throw new TeamException("成员已满，无法添加");
        }
        //该成员不是开发成员，不能添加
        if(!(e instanceof Programmer)){
            throw new TeamException("该成员不是开发人员，无法添加");
        }
        //该员工已在开发团队中
        if(isExist(e)){
            throw new TeamException("该员工已在本团队中");
        }

        //该员工已是某团队成员(团队可以创建很多个，该员工可能在别的团队)
        Programmer p = (Programmer) e;  //一定不会出现类型转换异常，因为上面已经过滤了，不是Programmer会抛出异常
//        if(p.getStatus().getNAME().equals("BUSY")){
        if("BUSY".equals(p.getStatus().getNAME())){  //这种写法更好，减少空指针异常的风险
            throw new TeamException("该员工已是某团队成员");
        }else if("VOCATION".equalsIgnoreCase(p.getStatus().getNAME())){
            throw new TeamException("该员正在休假，无法添加");
        }

        //团队中至多只能有1名架构师，至多只能有2名设计师，至多只能有3名程序员
        //首先获取team中已有成员中架构师、设计师、程序员的人数
        int numOfArch = 0, numOfDsgn = 0, numOfPrg = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) numOfArch++;   //注意顺序！先判断架构师！！！！先判断范围小的！！！
            else if (team[i] instanceof Designer) numOfDsgn++;
            else if (team[i] instanceof Programmer) numOfPrg++;
        }

        if (p instanceof Architect) {
            if (numOfArch >= 1) throw new TeamException("团队中至多只能有一名架构师");
        } else if (p instanceof Designer) {
            if (numOfDsgn >= 2) throw new TeamException("团队中至多只能有两名设计师");
        } else if (p instanceof Programmer) {
            if (numOfPrg >= 3) throw new TeamException("团队中至多只能有三名程序员");
        }

        //将p(或e)添加到现有的team中
        //添加到数组
        p.setStatus(Status.BUSY);
        p.setMemberId(counter++);
        team[total++] = p;  //这个选后加加，我还是有点不太熟这个
    }

    /**
     * 判断指定的员工是否存在于现有的开发团队中
     * @param e
     * @return
     */
    private boolean isExist(Employee e) {
        for (int i = 0; i < total; i++) {
//            if(team[i].getId() == e.getId()){
//                return true;
//            }
            return team[i].getId() == e.getId();
        }
        return false;
    }

    /**
     * 从团队中删除成员
     * @param memberId
     */
    public void removeMember(int memberId) throws TeamException {
        //要想先删，就要先遍历现有团队成员
        //memberId改不改无所谓了，我们这里就不改了
        int i = 0;
        for (; i < total; i++) {
            if(team[i].getMemberId() == memberId){
                team[i].setStatus(Status.FREE);
                break;
            }
        }

        //未找到指定memberId的情况——循环条件不满足跳出来的
        if(i == total){
            throw new TeamException("找不到该成员，无法删除");
        }


//        写法1：后一个元素覆盖前一个元素，实现删除操作
        for(int j = i + 1; j < total;j++){
            team[j-1] = team[j];
        }

//        写法2：
//        for(int j = i + 1; j < total - 1;j++){
//            team[j] = team[j+1];
//        }

//        写法1：
//        team[total-1] = null;    //最后一个元素给它置空
//        total--;

//        写法2：
        team[--total] = null;
    }
}
