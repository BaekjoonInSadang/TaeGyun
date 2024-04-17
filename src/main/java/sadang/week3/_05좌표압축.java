package sadang.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _05좌표압축 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        int[] numbers = new int[n];
        for(int i = 0 ; i < str.length ; i ++) {
            numbers[i] = Integer.parseInt(str[i]);
        }

        int[] temp = numbers.clone();
        Arrays.sort(numbers);
        int count = 0;

        Map<Integer, Integer> coordinate = new HashMap<>();
        for (int number : numbers) {
            if (!coordinate.containsKey(number))
                coordinate.put(number, count++);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n ; i++) {
            sb.append(coordinate.get(temp[i])).append(" ");
        }

        System.out.println(sb.toString());
    }

}