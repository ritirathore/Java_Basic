public class Casting {
    public static void main(String[] args) {
        // short to int
        short a = 10;
        int ch = a;
        System.out.println(ch);

        // double to int
        double d = 23.34d;
        int i = (int) d;
        System.out.println(i);

        // increment in character (ASCII value)
        char c = 'a';
        c++;
        System.out.println(c);

        // String to integer
        String str = "9";
        int it = Integer.parseInt(str);
        System.out.println(it);
    }
}
