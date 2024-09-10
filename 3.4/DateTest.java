public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(12, 31, 2023);

        System.out.println("Initial date: " + date);
        for (int i = 0; i < 5; i++) {
            date.nextDay();
            System.out.println("Next day: " + date);
        }
    }
}
