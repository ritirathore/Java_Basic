public class Enumex {
    public enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        // to access single value
        Days dd = Days.MONDAY;
        System.out.println(dd);

        // to access all the values
        for (Days d : Days.values()) {
            System.out.println(d);
        }
        // length of enum
        int n = Days.values().length;
        System.out.println(n);
    }
}
