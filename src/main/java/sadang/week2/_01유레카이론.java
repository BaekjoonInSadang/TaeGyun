package sadang.week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _01유레카이론 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] t = new int[45];
        for (int i = 1; i < 45; i++) {
            t[i] = i * (i + 1) / 2;
        }

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            int m = Integer.parseInt(br.readLine());
            sb.append(eureka(t, m) ? 1 : 0).append('\n');
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }

    private static boolean eureka(final int[] t, final int n) {
        for (int i = 1; i < 45; i++) {
            for (int j = i; j < 45; j++) {
                for (int k = j; k < 45; k++) {
                    if (t[i] + t[j] + t[k] == n) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

}