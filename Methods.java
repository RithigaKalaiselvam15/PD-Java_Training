public class Methods {
        public static void main(String[] args) {
            multiply();
            sub(10 , 10);
            System.out.println(add(31,51));
            int res = divide();
            res = res * 20;
            System.out.println(res);
            //System.out.println(" f is printed");

        }
        // void (no return type) without parameterized function
        public static void multiply(){
            int a = 5;
            int b = 10;
            int c = a * b ;
            System.out.println(c);
        }
        public static void sub(int d, int e){  // void with parameterized function
            int f = d- e ;
            System.out.println(f);
        }
        public static int add(int x, int y){  // return with parameterized function
            int z = x + y ;
            return z;
        }
        public static int divide(){ // non void without parameterized function
            int l = 50;
            int m = 10;
            int n = l / m ;
            return n;
        }



    }

