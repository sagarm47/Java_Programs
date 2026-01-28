package string;

public class ReverseEachWord {
    public static void main(String[] args) {

        String str = "This is test string";

        String[] eachWords = str.split(" ");
        String revString = "";

        for (int i = 0; i < eachWords.length; i++) {
            String word = eachWords[i];
            String reverseWord = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }

            revString = revString +reverseWord + " ";
        }
        System.out.println(revString);
    }
}
