package sadang.pccp;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class _06신입사원교육 {

    public static void main(String[] args) {
        int[] ability = {10, 3, 7, 2};
        int number = 2;
        int result = solution(ability, number);

        System.out.println(result);
    }

    public static int solution(int[] ability, int number) {
        PriorityQueue<Integer> pq = Arrays.stream(ability)
                .boxed()
                .collect(Collectors.toCollection(PriorityQueue::new));

        for (int i = 0; i < number; i++) {
            int first = pq.poll();
            int second = pq.poll();

            int newAbility = first + second;

            pq.add(newAbility);
            pq.add(newAbility);
        }

        int sum = 0;
        while (!pq.isEmpty()) {
            sum += pq.poll();
        }

        return sum;
    }

}