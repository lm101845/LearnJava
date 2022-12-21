package com.atguigu.java1;

/**
 * @Author liming
 * @Date 2022/6/23 17:03
 **/

/**
 * 接口的应用：代理模式
 *
 */
public class NetWorkTest {
    public static void main(String[] args) {
        Server server = new Server();  //创建一个真实的服务器
        //server.browse();   //有些事情我不能直接做，需要找人帮我做
        System.out.println("=======================");

        ProxyServer proxyServer = new ProxyServer(server);
        proxyServer.browse();
    }
}

interface NetWork{
    public void browse();
}

//被代理类
//为什么要让代理类帮我browse,我自己不直接做呢？(因为我直接browse无法联网，还要先check,而这个方法我没有)
//因为代理类不光帮我brower,还帮我做其他的事情,check。
class Server implements NetWork{

    @Override
    public void browse() {
        System.out.println("真实的服务器访问网络");
    }
}

//代理类
class ProxyServer implements NetWork{
    private NetWork work;

    public ProxyServer(NetWork work){
        this.work = work;
    }

    //它帮我们联网的时候，需要先做一些校验的工作
    public void check(){
        System.out.println("联网之前的检查工作");
    }
    @Override
    public void browse() {
        check();
        work.browse();
    }
}