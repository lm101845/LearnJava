package team.domain;

import team.service.Status;

/**
 * @Author liming
 * @Date 2022/6/28 12:41
 **/
public class Programmer extends Employee{
    private int memberId;   //开发团队中的id
    private Status status = Status.FREE;  //状态默认为free,不写在构造器里面
    private Equipment equipment;  //从程序员开始就可以有设备了

    public Programmer() {
        super();
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    protected String getMemberDetails() {
        return getMemberId() + "/" + getDetails();
    }

    public String getDetailsForTeam() {
        return getMemberDetails() + "\t程序员";
    }

    @Override
    public String toString() {
//        return super.toString() + "\t程序员\t" + status + "\t\t\t" + equipment.getDescription();
        return getDetails() + "\t程序员\t" + status + "\t\t\t" + equipment.getDescription();
    }
}
