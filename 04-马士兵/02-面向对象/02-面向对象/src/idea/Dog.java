package idea;

/**
 * @author 李明
 * @date 2021年11月14日 22:54
 */
public class Dog {
    int furColor;
    float height;
    float weight;
    void catchMouse(Mouse m){
        //里面具体写狗怎么抓老鼠的
        m.scream();
        //你抓老鼠，老鼠就会叫
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        Mouse m = new Mouse();
        //狗抓老鼠，具体要抓的是哪只老鼠，需要先new一个出来
        d.catchMouse(m);
    }
}
