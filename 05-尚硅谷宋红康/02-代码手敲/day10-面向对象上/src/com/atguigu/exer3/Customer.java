package com.atguigu.exer3;

/**
 * @Author liming
 * @Date 2022/6/15 16:50
 **/
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;
    //这是我们首次出现自定义类的属性

    public Customer(String f,String l){
        this.firstName = f;
        this.lastName = l;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
