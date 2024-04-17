package sadang.week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _01부분합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int[] numbers = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;

        while (true) {
            if (sum >= s) {
                sum -= numbers[left];
                min = Math.min(min, right - left);
                left++;
            } else if (right == n) {
                break;
            } else {
                sum += numbers[right++];
            }
        }

        if (min == Integer.MAX_VALUE)
            System.out.println(0);
        else
            System.out.println(min);
    }

}