public class DateTime {
    private Date date;
    private Time2 time;

    // Constructor
    public DateTime(int month, int day, int year, int hour, int minute, int second) {
        date = new Date(month, day, year);
        time = new Time2(hour, minute, second);
    }

    // Method to increment the hour
    public void incrementHour() {
        time.incrementHour();
        if (time.toUniversalString().startsWith("00:00:00") && time.toUniversalString().endsWith("00")) {
            date.nextDay();
        }
    }

    // Method to display date and time in MM/DD/YYYY HH:MM:SS format
    public String toString() {
        return date.toString() + " " + time.toUniversalString();
    }
}
