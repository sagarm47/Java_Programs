package string;

import java.io.StringWriter;

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

    // Second way
//        String str1 = "I Am Princess";
//        String[] parts = str1.split(" ");
//        for (int i = 0; i < parts.length; i++) {
//            String rev = "";
//            for (int j = parts[i].length() - 1; j >= 0; j--) {
//                rev = rev + parts[i].charAt(j);
//            }
//            System.out.print(rev + " ");
//        }

        String s = "I Am Sagar";
        String[] parts = s.split(" ");

        for(int i = 0; i< parts.length; i++){
            String rev = "";
            for(int j = parts[i].length()-1; j>=0; j--){
                rev = rev + parts[i].charAt(j);
            }
            System.out.print(rev + " ");
        }
    }



}
