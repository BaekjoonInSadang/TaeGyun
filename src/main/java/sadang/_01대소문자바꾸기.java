package sadang;

import java.io.*;

public class _01대소문자바꾸기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();

        String result = caseByUpperOrLower(s);

        bw.write(result);
        bw.flush();
        bw.close();
    }

    private static String caseByUpperOrLower(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }

        return sb.toString();
    }

}