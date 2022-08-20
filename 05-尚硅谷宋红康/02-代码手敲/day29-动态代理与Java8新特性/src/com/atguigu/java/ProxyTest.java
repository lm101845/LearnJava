package com.atguigu.java;

/**
 * @Author liming
 * @Date 2022/8/20 13:21
 **/

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 * 动态代理的举例
 */
//代理类(经纪人)
interface Human{
    String sing();
    void eat(String food);
}

//被代理类(明星-SuperMan)
class SuperMan implements Human{

    @Override
    public String sing() {
        return "明星今晚唱的歌：让我们荡起双桨";
    }

    @Override
    public void eat(String food) {
        System.out.println("明星喜欢吃" + food);
    }
}

class HumanUtil{
    public void method1(){
        System.out.println("==============================通用方法1===============================");
    }

    public void method2(){
        System.out.println("==============================通用方法2===============================");
    }
}
/**
要想实现动态代理，需要解决的问题？
问题一：如何根据加载到内存中的被代理类(歌星)，动态的创建一个代理类(经纪人)及其对象。
问题二：当通过代理类(经纪人)的对象调用方法a时，如何动态的去调用被代理类(歌星)中的同名方法a。
 */
class ProxyFactory{
    //调用此方法(参数是被代理类对象)，【返回一个代理类的对象】。解决问题一
    public static Object getProxyInstance(Object obj){  //obj:被代理类的对象——歌星-superMan
        MyInvocationHandler handler = new MyInvocationHandler();
        handler.bind(obj);   //obj是歌星
        //根据被代理类对象的不同，动态的给你创建一个代理类对象
        //你想要租房，我给你造一个租房中介给你代理
        //你想要打官司，我给你造一个律师给你代理
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),handler);
        //第2个参数：看被代理类(歌星)实现了哪些接口，那我创建的代理类(经纪人)就和你一样，也实现相同的接口
    }
}

class MyInvocationHandler implements InvocationHandler{
    private Object obj;   //这个属性obj是经纪人
    //需要使用被代理类的对象进行赋值
    public void bind(Object obj){
        this.obj = obj;
        //经纪人 = 歌星
    }
    //当我们通过代理类(经纪人)的对象，调用方法a时，就会自动的调用如下的方法：invoke()
    //将被代理类(歌星)要执行的方法a的功能就声明在invoke()中
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        HumanUtil humanUtil = new HumanUtil();
        humanUtil.method1();
        //第一个参数proxy,就是代理类(经纪人)的对象，就是getProxyInstance方法返回的对象
        //第二个参数method,就是代理类的对象调用的什么方法，我就是那个方法

        //method:即为代理类对象调用的方法，此方法也就作为了被代理类对象要调用的方法
        //obj:被代理类(歌星)的对象
        Object returnValue = method.invoke(obj,args);
        humanUtil.method2();

        //上述方法的返回值就作为当前类中的invoke()的返回值。
        return returnValue;
    }
}
public class ProxyTest {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();   //明星：superMan
        //proxyInstance:代理类的对象
        //根据明星，动态的给你造一个经纪人，这个方法返回的是经纪人对象
        Human proxyInstance = (Human) ProxyFactory.getProxyInstance(superMan);

        //当通过代理类对象调用方法时，会自动的调用被代理类中同名的方法
        String sing = proxyInstance.sing();
        System.out.println(sing);
        proxyInstance.eat("四川麻辣烫");

        System.out.println("======================================");

        NikeClothFactory nikeClothFactory = new NikeClothFactory();
        ClothFactory proxyInstance1 = (ClothFactory) ProxyFactory.getProxyInstance(nikeClothFactory);
        proxyInstance1.produceCloth();
    }
}
