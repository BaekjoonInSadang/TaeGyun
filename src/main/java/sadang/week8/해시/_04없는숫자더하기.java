package sadang.week8.해시;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _04없는숫자더하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] numbers = new int[st.countTokens()];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int result = solution(numbers);
        System.out.println(result);
    }

    public static int solution(int[] numbers) {
        int sum = 45;

        for (int i : numbers) {
            sum -= i;
        }

        return sum;
    }

}