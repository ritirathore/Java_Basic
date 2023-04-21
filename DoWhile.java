import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("enter number between 1 and 10=");
            num = sc.nextInt();

        } while (num > 10 || num < 1);
        sc.close();

        System.out.println("number entered=" + num);

    }
}
