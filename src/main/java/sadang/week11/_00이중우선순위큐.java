package sadang.week11;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _00이중우선순위큐 {

    public static void main(String[] args) {
        String[] operations = {
                "I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"
        };

        int[] result = solution(operations);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] solution(String[] operations) {
        DoublePriorityQueue dpq = new DoublePriorityQueue();
        for (String operation : operations) {
            String[] parts = operation.split(" ");
            String status = parts[0];
            int number = Integer.parseInt(parts[1]);

            if (status.equals("I")) {
                dpq.insert(number);
            } else {
                if(dpq.maxQP.isEmpty() && dpq.minQP.isEmpty()) {
                    break;
                }

                if (number == 1) {
                    dpq.removeMax();
                } else if (number == -1) {
                    dpq.removeMin();
                }
            }
        }

        if (dpq.maxQP.isEmpty() && dpq.minQP.isEmpty()) {
            return new int[]{0, 0};
        }

        return new int[]{dpq.maxQP.poll(), dpq.minQP.poll()};
    }

    private static class DoublePriorityQueue {
        private final PriorityQueue<Integer> minQP = new PriorityQueue<>();
        private final PriorityQueue<Integer> maxQP = new PriorityQueue<>(Comparator.reverseOrder());

        public void insert(int num) {
            minQP.add(num);
            maxQP.add(num);
        }

        public void removeMax() {
            int max = maxQP.poll();
            minQP.remove(max);
        }

        public void removeMin() {
            int min = minQP.poll();
            maxQP.remove(min);
        }

    }

}