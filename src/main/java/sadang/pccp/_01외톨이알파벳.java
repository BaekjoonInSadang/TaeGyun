package sadang.pccp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _01외톨이알파벳 {

    public static void main(String[] args) {
        String input_string = "edeaaabbccd";

        String result = solution(input_string);

        System.out.println(result);
    }

    public static String solution(String input_string) {
        List<Character> input = new ArrayList<>();
        List<Character> result = new ArrayList<>();

        StringBuilder answer = new StringBuilder();
        char a = ' ';

        for (int i = 0; i < input_string.length(); i++) {
            if (input_string.charAt(i) != a) {
                if (input.contains(input_string.charAt(i)) && !result.contains(input_string.charAt(i))) {
                    result.add(input_string.charAt(i));
                } else {
                    input.add(input_string.charAt(i));
                }
            }

            a = input_string.charAt(i);
        }

        Collections.sort(result);

        for (Character character : result) {
            answer.append(character);
        }

        if (answer.toString().equals("")) {
            answer = new StringBuilder("N");
        }

        return answer.toString();
    }

}