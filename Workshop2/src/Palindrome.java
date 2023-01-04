
public class Palindrome {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Please Enter the Arguments");
        }
        else {
            for(String s : args) {
                boolean res = isPalindrome(s.toLowerCase());
                if(res) {
                    System.out.println(s + " is a Palindrome");
                }
                else {
                    System.out.println(s + " is not a Palindrome");
                }
            }
        }
    }

    static boolean isPalindrome(String str) {
        int len = str.length();
        Stack myStack = new Stack(len);

        for(int i = 0;i < len;++i) {
            myStack.pushChar(str.charAt(i));
        }
        for(int i = 0;i < len;++i) {
            if(str.charAt(i) != myStack.popChar())
                return false;
        }
        return true;
    }
}
