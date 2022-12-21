package team.service;

/**
 * @Author liming
 * @Date 2022/6/28 17:15
 **/

/**
 * 自定义异常类
 */
public class TeamException extends Exception{
    //继承Exception，则编译时就要处理了
    //继承RunTimeException,则运行时才需要处理
    static final long serialVersionUID = -33875169124229948L;

    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}
