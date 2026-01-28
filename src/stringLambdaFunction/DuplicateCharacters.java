package stringLambdaFunction;

import java.util.stream.Collectors;

public class DuplicateCharacters {
    public static void main(String[] args) {

        String s1 = "asadedladdleoloi";
        System.out.println("Duplicate characters are: ");
        s1.replaceAll("\\s", "")
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .forEach((character, count) -> {
                    if (count > 1) System.out.print(character + " ");
                });
    }
}

