package sadang.week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _02수고르기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int answer = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;

        while (right < n && left <= right) {
            int result = arr[right] - arr[left];

            if (result >= m) {
                left++;
                answer = Math.min(answer, result);
            } else {
                right++;
            }
        }

        System.out.println(answer);
    }

}