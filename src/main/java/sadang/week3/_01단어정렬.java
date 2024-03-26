package sadang.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

public class _01단어정렬 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] word = new String[n];
        for (int i = 0; i < n; i++) {
            word[i] = br.readLine();
        }

        sortByLengthAndDictionary(word);

        Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(word));
        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord);
        }
    }

    private static void sortByLengthAndDictionary(String[] word) {
        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if (a.length() == b.length()) {
                    return a.compareTo(b);
                }

                return Integer.compare(a.length(), b.length());
            }
        });
    }
}