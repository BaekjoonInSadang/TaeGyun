package sadang.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _04베스트셀러 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> rank = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String book = br.readLine();
            rank.put(book, rank.getOrDefault(book, 0) + 1);
        }

        int max = Collections.max(rank.values());

        List<String> list = new ArrayList<>();
        rank.forEach((key, value) -> {
            if (value == max) {
                list.add(key);
            }
        });

        Collections.sort(list);
        System.out.print(list.get(0));
    }

}