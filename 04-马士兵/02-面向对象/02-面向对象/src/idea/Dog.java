package idea;

/**
 * @author ����
 * @date 2021��11��14�� 22:54
 */
public class Dog {
    int furColor;
    float height;
    float weight;
    void catchMouse(Mouse m){
        //�������д����ôץ�����
        m.scream();
        //��ץ��������ͻ��
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        Mouse m = new Mouse();
        //��ץ���󣬾���Ҫץ������ֻ������Ҫ��newһ������
        d.catchMouse(m);
    }
}
