package sadang.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _04기능개발 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int progresses_countTokens = st.countTokens();
        int[] progresses = new int[progresses_countTokens];
        for (int i = 0; i < progresses_countTokens; i++) {
            progresses[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int speeds_countTokens = st.countTokens();
        int[] speeds = new int[speeds_countTokens];
        for (int i = 0; i < speeds_countTokens; i++) {
            speeds[i] = Integer.parseInt(st.nextToken());
        }

        int[] result = solution(progresses, speeds);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < speeds.length; i++) {
            int date = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);

            if (!q.isEmpty() && q.peek() < date) {
                arr.add(q.size());
                q.clear();
            }

            q.offer(date);
        }

        arr.add(q.size());

        int[] answer = new int[arr.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }

}