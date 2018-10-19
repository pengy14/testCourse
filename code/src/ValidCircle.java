import java.util.Scanner;

public class ValidCircle {

    public static void main(String[] args) {
        Point point1=new Point();
        Point point2=new Point();
        Point point3=new Point();
        point1.x=0;
        point1.y=0;
        point2.x=0;
        point2.y=0;
        point3.x=0;
        point3.y=8;
        System.out.println(calculate(point1,point2,point3));
    }

    public static double calculate(Point p1,Point p2,Point p3 ) {

        double radius=-1;
        if(p1==null||p2==null||p3==null) return -1;
        if((p1.x==p2.x&&p1.y==p2.y)||(p1.x==p3.x&&p1.y==p3.y)||(p3.x==p2.x&&p3.y==p2.y)) return -1;
        double x1=p1.x,x2=p2.x,x3=p3.x;
        double y1=p1.y,y2=p2.y,y3=p3.y;
        double a = x1 - x2;
        double b = y1 - y2;
        double c = x1 - x3;
        double d = y1 - y3;
        double e = ((x1 * x1 - x2 * x2) + (y1 * y1 - y2 * y2)) / 2.0;
        double f = ((x1 * x1 - x3 * x3) + (y1 * y1 - y3 * y3)) / 2.0;
        double det = b * c - a * d;
        if (det==0) return -1;
        double x0 = -(d * e - b * f) / det;
        double y0 = -(a * f - c * e) / det;
        System.out.println("("+x0+","+y0+")");
        return calRadius(x1,y1,x0,y0);
    }

    public  static double calRadius(double x1,double y1,double x0,double y0) {
        return Math.sqrt((x1-x0)*(x1-x0)+(y1-y0)*(y1-y0));
    }
}
