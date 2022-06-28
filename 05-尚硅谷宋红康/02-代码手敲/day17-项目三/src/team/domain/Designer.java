package team.domain;

/**
 * @Author liming
 * @Date 2022/6/28 12:51
 **/
public class Designer extends Programmer{
    private double bonus;   //奖金

    public Designer() {
        super();
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
//        return super.super.toString();
//        super.super这种写法想调爷爷的toString方法是不可以的！！没这种写法
        return getDetails() + "\t设计师\t" + getStatus() + "\t" +
                getBonus() +"\t\t" + getEquipment().getDescription();
    }
}
