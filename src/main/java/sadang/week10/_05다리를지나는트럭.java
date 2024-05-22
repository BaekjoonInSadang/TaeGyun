package sadang.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _05다리를지나는트럭 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int bridge_length = Integer.parseInt(br.readLine());
        int weight = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int truck_count = st.countTokens();
        int[] truck_weights = new int[truck_count];

        for (int i = 0; i <truck_count; i++) {
            truck_weights[i] = Integer.parseInt(st.nextToken());
        }

        int result = solution(bridge_length, weight, truck_weights);
        System.out.println(result);
    }

    static int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int bridge_weight = 0;
        int time = 0;

        for (int current_truck : truck_weights) {
            while (true) {
                if (bridge.isEmpty()) {
                    bridge.add(current_truck);
                    bridge_weight += current_truck;
                    time++;
                    break;
                } else if (bridge.size() == bridge_length) {
                    bridge_weight -= bridge.poll();
                } else {
                    if (bridge_weight + current_truck <= weight) {
                        bridge.add(current_truck);
                        bridge_weight += current_truck;
                        time++;
                        break;
                    } else {
                        bridge.add(0);
                        time++;
                    }
                }
            }
        }

        return time + bridge_length;
    }

}