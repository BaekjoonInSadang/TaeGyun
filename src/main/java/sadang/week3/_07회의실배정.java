package sadang.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _07회의실배정 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] time = new int[n][2];

        for(int i = 0; i< n ; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int start_time = Integer.parseInt(st.nextToken());
            int end_time = Integer.parseInt(st.nextToken());

            time[i][0] = start_time;
            time[i][1] = end_time;
        }

        Arrays.sort(time, Comparator.comparingInt(a -> a[1]));

        List<int[]> resultList = new ArrayList<>();
        int endTime = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if (time[i][0] >= endTime) {
                resultList.add(time[i]);
                endTime = time[i][1];
            }
        }

        int[][] resultArray = resultList.toArray(new int[resultList.size()][]);

        Arrays.stream(resultArray).map(i -> i[0] + " " + i[1]).forEach(System.out::println);
    }

}