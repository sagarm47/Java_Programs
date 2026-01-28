package string;

public class Palindrome {
    public static void main(String[] args) {
        String s = "sdods", t = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            t = t + s.charAt(i);

        }
        System.out.print(t);
        if (s.equals(t)) {
            System.out.print(" :-String is palindrome");
        } else {
            System.out.print(" :-String is not palindrome");
        }

    }

}
