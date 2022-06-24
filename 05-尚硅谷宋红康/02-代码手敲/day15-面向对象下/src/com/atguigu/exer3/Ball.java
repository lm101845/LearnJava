package com.atguigu.exer3;

/**
 * @Author liming
 * @Date 2022/6/23 18:25
 **/
interface Playable{
    void play();
}

interface Bounceable{
    void play();
}

interface Rollable extends Playable, Bounceable{
//    public static final Ball ball = new Ball("PingPang");
    Ball ball = new Ball("PingPang");
    //这个接口里面定义了一个“实例变量”,并且前面省略了public static final
    //接口里面都是常量！！！！！！！
}

class Ball implements Rollable{
    //我这个Ball实现了这个Rollable接口，自然也拿到了ball这个变量
    private String name;

    public String getName() {
        return name;
    }

    public Ball(String name){
        this.name = name;
    }


    public void play() {
         //ball = new Ball("Football");
        //因为ball是常量，你就不能再去new了
        System.out.println(ball.getName());
    }
}
