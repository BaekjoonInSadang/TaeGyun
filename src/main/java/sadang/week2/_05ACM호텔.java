package sadang.week2;

import java.io.*;
import java.util.StringTokenizer;

public class _05ACM호텔 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int h = (N - 1) % H + 1;
            int w = (N - 1) / H + 1;
            sb.append(h * 100 + w).append('\n');
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }

}