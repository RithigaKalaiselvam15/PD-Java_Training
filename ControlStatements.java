public class ControlStatements {
        public static void main(String[] args) {
            int age = 45;
            int mark = 91;
            int day = 4;
            int i;
            for(i=1;i<=4;i++){
                if(i==3)
                    continue;
                {
                    System.out.println(i);
                }
            }
            if(age >=18){
                System.out.println("eligible to vote ");
            }
            if(mark >=90){
                System.out.println("grade a ");
            } else if (mark>=80) {
                System.out.println("grade b");

            } else if (mark>=50){
                System.out.println("pass");
            }
            else{
                System.out.println("fail");
            }
            switch (day){
                case 1:
                    System.out.println("monday");
                    break;

                case 2:
                    System.out.println("tuesday");
                    break;
                case 3:
                    System.out.println("wednesday");
                    break;
                case 4:
                    System.out.println("thursday");
                    break;
                default:
                    System.out.println("invalid day");

            }

        }
    }

