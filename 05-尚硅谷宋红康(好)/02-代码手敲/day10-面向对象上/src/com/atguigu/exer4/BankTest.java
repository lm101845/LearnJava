package com.atguigu.exer4;

/**
 * @Author liming
 * @Date 2022/6/15 20:26
 **/
public class BankTest {
    public static void main(String[] args) {
        //先造一个银行
        Bank bank = new Bank();
        //添加客户——需要在调用addCustomer之前，把数组造出来，否则会报空指针异常
        //我去，感觉已经学了JavaSE很久了，但是发现基础还是不行啊！！
        bank.addCustomer("Jane","Smith");
        bank.getCustomer(0).setAccount(new Account(2000));
        bank.getCustomer(0).getAccount().withdraw(500);
        double balance = bank.getCustomer(0).getAccount().getBalance();
        System.out.println("客户：" + bank.getCustomer(0).getFirstName() + "的账户余额为：" + balance);

        System.out.println("***********************");
        bank.addCustomer("万里", "杨");

        System.out.println("银行客户的个数为：" + bank.getNumOfCustomers());
    }
}
