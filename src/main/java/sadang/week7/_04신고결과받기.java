package sadang.week7;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.IntStream;

public class _04신고결과받기 {

    public static void main(String[] args) throws IOException {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;

        int[] result = solution(id_list, report, k); // [2, 1, 1, 0]

        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int id_len = id_list.length;
        int[] answer = new int[id_len];

        Map<String, HashSet<String>> reportResults = new HashMap<>();
        Map<String, Integer> reportCnt = new HashMap<>();

        IntStream.range(0, id_len).forEach(i -> {
            reportResults.put(id_list[i], new HashSet<>());
            reportCnt.put(id_list[i], 0);
        });

        Arrays.stream(report)
                .map(s -> s.split(" "))
                .forEach(str -> {
                    String from = str[0];
                    String to = str[1];
                    reportResults.get(to).add(from);
                    reportCnt.put(to, reportCnt.getOrDefault(to, 0) + 1);
                });


        for (int i = 0; i < id_len; i++) {
            HashSet<String> set = reportResults.get(id_list[i]);


        }

        return answer;
    }

}

