package sadang.week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _04두개의탑 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] towers = new int[n + 1];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            towers[i] = Integer.parseInt(br.readLine());
            sum += towers[i];
        }

        int start = 0;
        int last = 0;
        int max = Integer.MIN_VALUE;

        int now = towers[start];

        while (start <= last && last < n) {
            int min = Integer.min(now, sum - now);
            max = Integer.max(max, min);

            if (now == min) {
                last++;
                now += towers[last];
            } else {
                now -= towers[start];
                start++;
            }
        }

        System.out.println(max);
    }
}