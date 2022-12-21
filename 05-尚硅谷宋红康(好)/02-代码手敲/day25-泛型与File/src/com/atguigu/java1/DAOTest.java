package com.atguigu.java1;

import org.junit.Test;

/**
 * @Author liming
 * @Date 2022/8/6 20:43
 **/
public class DAOTest {
    @Test
    public void test1(){
        CustomerDAO dao1 = new CustomerDAO();
        dao1.add(new Customer());

        StudentDAO dao2 = new StudentDAO();
        dao2.add(new Student());
    }
}
