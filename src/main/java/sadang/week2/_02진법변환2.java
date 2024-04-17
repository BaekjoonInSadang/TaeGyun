package sadang.week2;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _02진법변환2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        ArrayList<Character> list = convert(n, b);

        for (int i = list.size() - 1; i >= 0; i--) {
            bw.write(list.get(i));
        }

        bw.flush();
        bw.close();
    }

    private static ArrayList<Character> convert(int n, int b) {
        ArrayList<Character> list = new ArrayList<>();
        while (n > 0) {
            if (n % b < 10) {
                list.add((char) (n % b + '0'));
            } else {
                list.add((char) (n % b - 10 + 'A'));
            }

            n /= b;
        }

        return list;
    }

}