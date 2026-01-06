class ExceptionHandling {
    public void divide() throws Exception {
        int a = 10 / 0;
    }
}

public class ThrowsDemo {
    public static void main(String[] args) {
        ExceptionHandling d = new ExceptionHandling();
        try {
            d.divide();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("always execute the code");
        }


    }
}