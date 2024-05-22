package sadang.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _02괄호회전하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int result = solution(s);
        System.out.println(result);
    }

    static int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            Stack<String> stack = new Stack<>();
            int cnt = i;

            for (int j = 0; j < s.length(); j++) {
                if (cnt >= s.length()) {
                    cnt = 0;
                }

                if (!stack.empty() && (s.charAt(cnt) == (')') || s.charAt(cnt) == ('}') || s.charAt(cnt) == (']'))) {
                    if (stack.peek().equals("(") && s.charAt(cnt) == (')')) {
                        stack.pop();
                    } else if (stack.peek().equals("{") && s.charAt(cnt) == ('}')) {
                        stack.pop();
                    } else if (stack.peek().equals("[") && s.charAt(cnt) == (']')) {
                        stack.pop();
                    }
                } else {
                    stack.add(String.valueOf(s.charAt(cnt)));
                }

                cnt++;
            }

            if (stack.empty()) {
                answer++;
            }
        }

        return answer;
    }

}