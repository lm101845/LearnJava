public class GenericDemo {
//    886
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("����ϼ");
        System.out.println(s.getName());

        Teacher t = new Teacher();
        t.setAge(30);
        //t.setAge("30");
        System.out.println(t.getAge());
        System.out.println("================");


        Generic<String> g1 = new Generic<>();
        g1.setT("����ϼ");
        System.out.println(g1.getT());

        Generic<Integer> g2 = new Generic<>();
        g2.setT(30);
        System.out.println(g2.getT());

        Generic<Boolean> g3 = new Generic<>();
        g3.setT(true);
        System.out.println(g3.getT());
    }
}