public class judgeDetail {
    int[] daysOfMonth={31,28,31,30,31,30,31,31,30,31,30,31};

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0)
            return true;
        else if ((year % 4 == 0) && (year % 100 != 0))
            return true;
        else
            return false;
    }

    public String judge(int year ,int month ,int day){
        int daysCount=0;
        if (isLeapYear(year)) daysOfMonth[1]=29;
        if (day>daysOfMonth[month-1]) {System.out.println("请输入该月合法的天数");return "";}
        for (int i=1900;i<year;++i){
            if (isLeapYear(i)){
                daysCount+=366;
            }else{
                daysCount+=365;
            }
        }

        for (int j=0;j<month-1;++j){
            daysCount+=daysOfMonth[j];
        }

        daysCount+=day;
        int week=daysCount%7;
        return convert(week);
    }

    public static String convert(int week) {
        String[] weekName = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        return weekName[week];
    }
}
