package Index.Dates;

public class Date {

    private int day;
    private int month;
    private int year;

    public int getYear() {

        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        if (year <= 2100 & year >= 1970) {
            this.year = year;
        }
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    
    public static int year_now = 2024;
    public static int month_now = 12;
    public static int day_now = 30;

    public static void calculateDate(Date date) {
        int yearDis = date.year_now - date.year;
        int monthDis = date.month_now - date.month;
        int dayDis = date.day_now - date.day;
        System.out.println("Year: " + yearDis + ", Month: " + monthDis + ", Day: " + dayDis);

    }
}
