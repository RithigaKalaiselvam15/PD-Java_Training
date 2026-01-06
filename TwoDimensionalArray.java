public class TwoDimensionalArray {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3},
                {3, 4, 5},
                {4, 5, 6}};
        System.out.println(a[2][2]);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int b[][] = {{1, 2}, {3, 4}, {5, 6}};
        for (int[] c : b) {
            for (int d : c) {
                System.out.print(d + " ");
            }
            System.out.println();
        }
        char x[][] = {{'a', 'b', 'x'}, {'c', 'd', 'y'}, {'e', 'f', 'z'}};
        for (char[] y : x) {
            for (char z : y) {
                System.out.print(z + " ");
            }
            System.out.println();
        }

    }
}
