package sadang.week5.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _05나무자르기 {

    public static void main(String[] args) throws IOException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] tree = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, tree[i]);
        }

        int left = 0;
        int right = max;

        while (left < right) {
            int mid = (right + left) / 2;
            long length = Arrays.stream(tree)
                    .filter(t -> t - mid > 0)
                    .mapToLong(t -> t - mid)
                    .sum();

            if (length >= m) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        System.out.println(left - 1);
    }

}