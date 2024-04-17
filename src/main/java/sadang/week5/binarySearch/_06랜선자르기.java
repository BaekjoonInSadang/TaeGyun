package sadang.week5.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _06랜선자르기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] lan = new int[k];
        for (int i = 0; i < k; i++) {
            lan[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(lan);

        long max = lan[k - 1];
        long min = 1;
        long count;
        long half;

        while (min <= max) {
            count = 0;
            half = (min + max) / 2;

            for (int i = 0; i < k; i++) {
                count += lan[i] / half;
            }

            if (count < n) {
                max = half - 1;
            } else {
                min = half + 1;
            }
        }

        System.out.println(max);
    }

}