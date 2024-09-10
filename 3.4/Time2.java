public class Time2 {
    private int hour;
    private int minute;
    private int second;

    // Constructor
    public Time2(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        }
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        }
        if (second >= 0 && second < 60) {
            this.second = second;
        }
    }

    // Method to tick the time by one second
    public void tick() {
        second++;
        if (second >= 60) {
            second = 0;
            minute++;
            if (minute >= 60) {
                minute = 0;
                hour++;
                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
    }

    // Method to increment the minute by one
    public void incrementMinute() {
        minute++;
        if (minute >= 60) {
            minute = 0;
            hour++;
            if (hour >= 24) {
                hour = 0;
            }
        }
    }

    // Method to increment the hour by one
    public void incrementHour() {
        hour++;
        if (hour >= 24) {
            hour = 0;
        }
    }

    // Method to display time in HH:MM:SS format
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
