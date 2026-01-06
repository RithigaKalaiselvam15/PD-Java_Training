import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;

        try {
            b = scan.nextInt();

            a = 10 / 0;

        } catch (InputMismatchException e) {
            System.out.println(e);
        } catch (ArithmeticException c) {
            System.out.println(c);
            ;
        } finally {
            System.out.println("finally block always execute the code ");
        }

    }
}
