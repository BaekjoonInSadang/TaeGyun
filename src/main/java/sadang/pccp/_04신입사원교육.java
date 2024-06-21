package sadang.pccp;

import java.util.Objects;
import java.util.PriorityQueue;

public class _04신입사원교육 {

    public static void main(String[] args) {
        int[] ability = {10, 3, 7, 2};
        int number = 2;
        int result = solution(ability, number);

        System.out.println(result);
    }

    public static int solution(int[] ability, int number) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int ab : ability) {
            pq.add(ab);
        }

        for (int i = 0; i < number; i++) {
            int first = Objects.requireNonNull(pq.poll(), "큐에 충분한 요소가 없습니다.");
            int second = Objects.requireNonNull(pq.poll(), "큐에 충분한 요소가 없습니다.");

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