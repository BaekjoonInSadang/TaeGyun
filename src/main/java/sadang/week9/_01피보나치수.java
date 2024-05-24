package sadang.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _01피보나치수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var n = Integer.parseInt(br.readLine());
        var result = solution(n);

        System.out.println(result);
    }

    private static int solution(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int fibo1 = 0;
        int fibo2 = 1;
        int currentFibo = 0;

        for (int i = 2; i <= n; i++) {
            currentFibo = (fibo1 + fibo2) % 1234567;
            fibo1 = fibo2;
            fibo2 = currentFibo;
        }

        return currentFibo;
    }

}
