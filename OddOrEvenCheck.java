import java.util.Scanner;
    public class  OddOrEvenCheck{
        public static void main(String[] args) {
            byte b = 90;
            short s = 100;
            int e = 9;
            if (e%2==0){
                System.out.println("it is an even number");
            }
            else{
                System.out.println("it is an odd number");
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of a :");
            int a = sc.nextInt();
            System.out.println(a + "\n" +b + "\n" +s);
            sc.close();



        }
    }
