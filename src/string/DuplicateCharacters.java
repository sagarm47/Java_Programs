package string;

public class DuplicateCharacters {
    public static void main(String[] args) {

        String s1 = "asadedladdleoloi";
//        s1 = s1.replaceAll("\\s", "");
        char[] strArr = s1.toCharArray();
        System.out.println("Duplicate characters are: ");

        for (int i = 0; i < strArr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i] == strArr[j]) {
                    count++;
                    strArr[j] = '0';
                }
            }
             if (count > 1 && strArr[i] != '0') {
                System.out.print(strArr[i] + " ");
            }
        }

    }
}