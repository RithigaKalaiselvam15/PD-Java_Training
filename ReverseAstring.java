public class ReverseAstring {
    public static void main(String[] args) {
        String[] Name = {"Rithiga", "pradeepa", "viji"};
        for (String str : Name) {
            String rev = " ";

            for (int i = str.length() - 1; i >= 0; i--) {
                rev = rev + str.charAt(i);
            }
            System.out.println("reversed string : " + rev);
        }
    }
}