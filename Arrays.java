import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        String[] Name = new String[4];
        Name[0] = "rithi";
        Name[1] = "hema";
        Name[2] = "gomathy";
        Name[3] = "iniya";
        System.out.println(Name[0]);

        String[] Song = {"song1", "song2"};
        System.out.println(Song[1]);

        int[] b = new int[2];
        b[0] = 20;
        b[1] = 22;
        System.out.println(b[0] - b[1]);

        int[] a = new int[3];
        Scanner scan = new Scanner(System.in);
        a[0] = scan.nextInt();
        a[1] = scan.nextInt();
        a[2] = scan.nextInt();
        System.out.println("enter value :" + a[0] + a[1] + a[2]);


    }
}