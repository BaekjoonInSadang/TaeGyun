package sadang.week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _07준표의조약돌 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        char[] cobbleStone = br.readLine().toCharArray();

        int left = 0;
        int right = 0;
        int blackCount = 0;
        int whiteCount = 0;
        int maxWalks = 0;

        while (right < n) {
            if (cobbleStone[right] == 'B') {
                blackCount++;
            } else {
                whiteCount++;
            }

            while (blackCount > b) {
                if(cobbleStone[left] == 'B'){
                    blackCount--;
                } else {
                    whiteCount--;
                }
                left++;
            }

            if (whiteCount >= w) {
                maxWalks = Math.max(maxWalks, right - left + 1);
            }

            right++;
        }

        System.out.println(maxWalks);
    }

}