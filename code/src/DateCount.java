import java.util.Scanner;

public class DateCount {

	int[] daysOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static boolean isLeapYear(int year) {
		if (year % 400 == 0)
			return true;
		else if ((year % 4 == 0) && (year % 100 != 0))
			return true;
		else
			return false;
	}

	public boolean dateIsValid(int year, int month, int day) {
		if (year < 1900 || year > 2100) {
			System.out.println("please enter valid year");
			return false;
		}
		if (month > 12 || month < 1) {
			System.out.println("please enter valid month");
			return false;
		}
		if (isLeapYear(year))
			daysOfMonth[1] = 29;
		if (day < 1 || day > daysOfMonth[month - 1]) {
			System.out.println("please enter valid day");
			return false;
		}
		return true;
	}

	public int calculate(int year, int month, int day) {
		if (stub_dateIsValid(year, month, day)) {
			int daysCount = 0;
			for (int j = 0; j < month - 1; ++j) {
				daysCount += daysOfMonth[j];
			}

			daysCount += day;

			return daysCount;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		DateCount validDate = new DateCount();
		String inputStr;
		Scanner scanner = new Scanner(System.in);
		inputStr = scanner.nextLine();
		scanner.close();
		int[] date = new int[3];
		String[] tempResult = inputStr.split(" ");
		date[0] = Integer.parseInt(tempResult[0]);
		date[1] = Integer.parseInt(tempResult[1]);
		date[2] = Integer.parseInt(tempResult[2]);
		System.out.println(validDate.calculate(date[0], date[1], date[2]));
	}

	public static boolean stub_dateIsValid(int year, int month, int day) {
		if (year == 1800)
			return false;
		return true;
	}
}
