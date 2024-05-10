package sadang.week8.해시;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _02중복된문자제거 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String result = solution(str);
        System.out.println(result);
    }

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();

        char[] chars = str.toCharArray();

        Set<Character> set = new HashSet<>();
        for (char c : chars) {
            if (set.contains(c)) {
                continue;
            }
            set.add(c);
            sb.append(c);
        }

        return sb.toString();
    }

}