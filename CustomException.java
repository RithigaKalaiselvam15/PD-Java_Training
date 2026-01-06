import java.util.Scanner;

class NotvalidException extends Exception {
    public NotvalidException(String s) {
        super(s);
    }

}

public class CustomException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            int age = scan.nextInt();
            if (age < 18) {
                throw new NotvalidException("your age is not eligible to vote");//userdefined exception
            }
        } catch (NotvalidException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("exception demo");
        }
    }
}