package sadang.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class _03회사에있는사람 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Set<String> employees = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            String name = input[0];
            String action = input[1];

            if (action.equals("enter")) {
                employees.add(name);
            } else {
                employees.remove(name);
            }
        }

        ArrayList<String> result = new ArrayList<>(employees);
        result.sort(Collections.reverseOrder());

        result.forEach(System.out::println);
    }

}