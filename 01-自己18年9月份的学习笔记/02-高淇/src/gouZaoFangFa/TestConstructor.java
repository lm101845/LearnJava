package gouZaoFangFa;

class Point {
    double x;
    double y;
    
    //���췽�����ƺ��������뱣��һ��
    public Point(double x, double y) {
        this.x = x;
        this.y = y;  
    }
    
    Point(){
    }
    
    public double getDistance(Point  p) {
        return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
    }
    
}


public class TestConstructor {
    public static void main(String[] args) {
        Point p = new Point(3.0, 4.0);
        Point origin = new Point(0.0, 0.0);
        Point  p2 = new Point();
        
        
        System.out.println(p.getDistance(origin));
    }
}