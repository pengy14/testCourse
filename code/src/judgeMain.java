import java.util.Scanner;

public class judgeMain {

    public static void main(String[] args) {
        String inputStr;
        Scanner scanner = new Scanner(System.in);
        inputStr = scanner.nextLine();
        int[] date = inputParser(inputStr);
        judgeDetail judgedetail = new judgeDetail();
        System.out.println(judgedetail.judge(date[0], date[1], date[2]));
    }

    public static int[] inputParser(String inputStr) {
        int[] date = new int[3];
        String[] tempResult = inputStr.split(" ");
        date[0] = Integer.parseInt(tempResult[0]);
        date[1] = Integer.parseInt(tempResult[1]);
        date[2] = Integer.parseInt(tempResult[2]);
        boolean isValid = dateIsValid(date[0], date[1], date[2]);
        if (isValid) {
            return date;
        } else {
            date[0] = -1;
            return date;
        }
    }

    public static boolean dateIsValid(int year, int month, int day) {
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
