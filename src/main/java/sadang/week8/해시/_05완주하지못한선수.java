package sadang.week8.해시;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _05완주하지못한선수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] participant = new String[st.countTokens()];
        int participant_len = participant.length;
        for (int i = 0; i < participant_len; i++) {
            participant[i] = st.nextToken();
        }

        st = new StringTokenizer(br.readLine());
        String[] completion = new String[st.countTokens()];
        int completion_length = completion.length;
        for (int i = 0; i < completion_length; i++) {
            completion[i] = st.nextToken();
        }

        String result = solution(participant, completion);
        System.out.println(result);
    }

    public static String solution(String[] participant, String[] completion) {
        HashMap<String, Long> map = new HashMap<>();
        for (String s : participant) {
            map.merge(s, 1L, Long::sum);
        }

        for (String name : completion) {
            long value = map.get(name) - 1L;
            if (value == 0L) {
                map.remove(name);
            } else {
                map.put(name, value);
            }
        }

        return map.keySet().iterator().next();
    }

}