package sadang.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class _03주식가격 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int countTokens = st.countTokens();
        int[] prices = new int[countTokens];

        for (int i = 0; i < countTokens; i++) {
            prices[i] = Integer.parseInt(st.nextToken());
        }

        int[] result = solution(prices);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> q = Arrays.stream(prices).boxed().collect(Collectors.toCollection(LinkedList::new));

        int idx = 0;
        while (!q.isEmpty()) {
            int currentPrice = q.poll();
            int prices_size = prices.length - q.size();
            for (int i = prices_size; i < prices.length; i++) {
                answer[idx]++;

                if (currentPrice > prices[i]) {
                    break;
                }
            }

            idx++;
        }
        return answer;
    }

}