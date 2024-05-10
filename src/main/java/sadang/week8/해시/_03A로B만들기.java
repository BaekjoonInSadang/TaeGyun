package sadang.week8.해시;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _03A로B만들기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String before = br.readLine();
        String after = br.readLine();
        int result = solution(before, after);

        System.out.println(result);
    }

    public static int solution(String before, String after) {
        int answer = 0;

        char[] bArr = before.toCharArray();
        char[] aArr = after.toCharArray();

        Arrays.sort(bArr);
        Arrays.sort(aArr);

        if (String.valueOf(bArr).equals(String.valueOf(aArr))) {
            answer = 1;
        }

        return answer;
    }

}