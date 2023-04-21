
public class Conditional {
    public static void calc(int a, int b, int c, int d) {
        int total;
        total = a + b + c + d;
        double dis = 0.01;
        if (total >= 15000) {
            System.out.println("total cart value:" + total);
            double w = dis * total;
            System.out.println("discount applied:" + w);
            double tt = total - w;
            System.out.println("balance:" + tt);
        } else {
            System.out.println("not eligible for discount");
        }
    }

    public static void main(String[] args) {
        /*
         * int age = 21;
         * if (age >= 20)
         * System.out.println("eligible");
         * else
         * System.out.println("not eligible");
         */
        int age = 21;
        int result = age % 2 == 0 ? 10 : 20;
        System.out.println(result);

        int a = 5000;
        int b = 1000;
        int c = 4000;
        int d = 6000;
        calc(a, b, c, d);

    }
}
