public class DateTimeTest {
    public static void main(String[] args) {
        DateTime dateTime = new DateTime(12, 31, 2023, 23, 59, 59);

        System.out.println("Initial date and time: " + dateTime);
        dateTime.incrementHour();
        System.out.println("After incrementing hour: " + dateTime);
    }
}
