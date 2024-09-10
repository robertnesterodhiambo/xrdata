public class Time2Test {
    public static void main(String[] args) {
        Time2 time = new Time2(23, 59, 59);

        // Test tick method
        System.out.println("Initial time: " + time.toUniversalString());
        time.tick();
        System.out.println("After tick: " + time.toUniversalString());

        // Test incrementMinute method
        time = new Time2(23, 59, 59);
        time.incrementMinute();
        System.out.println("After incrementing minute: " + time.toUniversalString());

        // Test incrementHour method
        time = new Time2(23, 59, 59);
        time.incrementHour();
        System.out.println("After incrementing hour: " + time.toUniversalString());
    }
}
