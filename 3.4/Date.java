public class Date {
    private int month;
    private int day;
    private int year;

    private static final int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    // Constructor
    public Date(int month, int day, int year) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        }
        if (day >= 1 && day <= daysInMonth[month - 1]) {
            this.day = day;
        }
        if (year > 0) {
            this.year = year;
        }
    }

    // Method to increment the day by one
    public void nextDay() {
        day++;
        if (day > daysInMonth[month - 1]) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }

    // Method to display date in MM/DD/YYYY format
    public String toString() {
        return String.format("%02d/%02d/%04d", month, day, year);
    }
}
