package sadang.week8.해시;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class _01평행 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] dots = new int[4][2];

        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());

            dots[i][0] = Integer.parseInt(st.nextToken());
            dots[i][1] = Integer.parseInt(st.nextToken());
        }

        int result = solution(dots);
        System.out.println(result);
    }

    public static int solution(int[][] dots) {
        Set<Double> slopes = new HashSet<>();

        int len = dots.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                double slope = getSlope(dots[i][0], dots[i][1], dots[j][0], dots[j][1]);

                if (slopes.contains(slope)) {
                    return 1;
                }

                slopes.add(slope);
            }
        }

        return 0;
    }

    public static double getSlope(int x1, int y1, int x2, int y2) {
        return (double) (y2 - y1) / (x2 - x1);
    }

}