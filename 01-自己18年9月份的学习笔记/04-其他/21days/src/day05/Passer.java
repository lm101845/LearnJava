package day05;

/*
 * @���� ����
 * @���� 2018��10��30������4:10:06
 * 
 * ���Ӧ�ó������һ������Ӧ�ó��򣬲��Դ�д�ķ�ʽ��ʾ����
 * 
 * ��������ݻ�Ӱ���ض�����ķ�����Ӧ����Ϊʵ����������Щ�ṩͨ�ù��ܣ�����ֱ��Ӱ���ض�����ķ���Ӧ����Ϊ�෽��
 * 
 * ��ͬ��ʵ���������෽�����ܱ��̳У�����������в��ܸ��ǳ�����෽��
 */
class Passer {

    void toUpperCase(String[] text) {
        for (int i = 0; i < text.length; i++) {
            text[i] = text[i].toUpperCase();
        }
    }

    public static void main(String[] arguments) {
        Passer passer = new Passer();
        passer.toUpperCase(arguments);
        for (int i = 0; i < arguments.length; i++) {
            System.out.print(arguments[i] + " ");
        }
        System.out.println();
    }
}
