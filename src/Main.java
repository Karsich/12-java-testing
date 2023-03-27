public class Main {
    public static void main(String[] args) {
        System.out.println(Integer.decode("055")); //45
        System.out.println(Integer.decode("#AB")); //171
        System.out.println(Integer.decode("0xAB")); //171
        System.out.println(Integer.decode("+123213")); //123213
        System.out.println(Integer.decode("-#BC")); //-188
    }
}