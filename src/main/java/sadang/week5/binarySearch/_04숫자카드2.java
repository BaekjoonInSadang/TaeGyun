package sadang.week5.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _04숫자카드2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (map.get(num) == null) {
                map.put(num, 1);
            } else {
                int count = map.get(num);
                map.put(num, ++count);
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (map.get(num) == null) {
                sb.append(0 + " ");
            } else {
                sb.append(map.get(num)).append(" ");
            }
        }

        System.out.println(sb);
    }

}