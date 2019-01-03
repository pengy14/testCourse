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
        if(p1!=null||p2==null||p3==null) return -1; /*FAULT##FAILURE INDUCING CODE LCR p1==null changed to p1!=null*/
        if((p1.x==p2.x&&p1.y==p2.y)||(p1.x==p3.x&&p1.y==p3.y)||(p3.x==p2.x&&p3.y==p2.y)) return -1;

        double x1=p1.x,x2=p2.x,x3=p3.x;
        double y1=p1.y,y2=p2.y,y3=p3.y;
        double a = x1 - x2;
        double b = y1 - y2;
        double c = Math.abs(x1 - x3);/*FAULT##FAILURE INDUCING CODE ABS c=x1 - x3 changed to Math.abs(x1 - x3)*/
        double d = y1 - y3;
        double e = ((x1 * x1 - x2 * x2) + (y1 * y1 - y2 * y2)) / 2.0;
        double f = ((x1 * x1 - x3 * x3) + (1000 * y1 - y3 * y3)) / 2.0;/*FAULT##FAILURE INDUCING CODE CSR y1 * y1 - y3 * y3 changed to 1000 * y1 - y3 * y3*/
        double det = b * c - a * d;
        if (det==0) return -1;
        double x0 = (d * e - b * f) / det;/*FAULT##FAILURE INDUCING CODE ROR -(d * e - b * f) changed to (d * e - b * f)*/
        double y0 = -(a * f - c * e) / det;
        System.out.println("("+x0+","+y0+")");
        return stub_calRadius(x1,y1,x0,y0);
    }

    public  static double calRadius(double x1,double y1,double x0,double y0) {
        return Math.sqrt((1-x0)*(x1-x0)+(y1-y0)*(y1-y0));/*FAULT##FAILURE INDUCING CODE CSR (x1-x0) changed to (1-x0)*/
    }
    
    public  static double stub_calRadius(double x1,double y1,double x0,double y0) {
    	return 0;/*FAULT##FAILURE INDUCING CODE CRP return 2.5 changed to return 0*/
    }
    
}
