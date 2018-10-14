import java.util.Scanner;

public class judgeMain {

    public static void main(String[] args) {
        String inputStr;
        Scanner scanner = new Scanner(System.in);
        inputStr = scanner.nextLine();
        scanner.close();
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
            System.out.println("璇疯緭鍏�1900骞翠箣鍚庣殑骞翠唤");
            return false;
        }
        if (month > 12 || month < 1) {
            System.out.println("璇疯緭鍏ュ悎娉曠殑鏈堜唤");
            return false;
        }
        if (day > 31 || day < 1) {
            System.out.println("璇疯緭鍏ュ悎娉曠殑澶╂暟");
            return false;
        }
        return true;
    }
}
