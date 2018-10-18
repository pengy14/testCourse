import java.util.Scanner;

public class ValidCircle {

    public static void main(String[] args) {
        Point point1=new Point();
        Point point2=new Point();
        Point point3=new Point();
        point1.x=1.0;
        point1.y=1.0;
        point2.x=1.0;
        point2.y=1.0;
        point3.x=1.0;
        point3.y=1.0;

    }

    public  boolean isValidInput(Point p1,Point p2,Point p3 ) {
        if(p1==null||p2==null||p3==null) return false;
        if(p1.x==p2.x&&p2.x==p3.x&&p1.y==p2.y&&p2.y==p3.y) return false;
        if
        return true;
    }

    public static boolean calRadius(int year, int month, int day) {
        if (year < 1900) {
            System.out.println("请输入1900年之后的年份");
            return false;
        }
        if (month > 12 || month < 1) {
            System.out.println("请输入合法的月份");
            return false;
        }
        if (day > 31 || day < 1) {
            System.out.println("请输入合法的天数");
            return false;
        }
        return true;
    }
}
