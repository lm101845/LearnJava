package day09.demo14;

/**
 * @author ����
 * @date 2021��06��10�� 0:33
 */

public class User {
    private String name;  //����
    private int money;    //���

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    //��ʾһ�µ�ǰ�û��ж���Ǯ
    public void show(){
        System.out.println("�ҽУ�" + name +  "���ж���Ǯ" + money);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
}
