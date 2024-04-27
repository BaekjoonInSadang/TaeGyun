package sadang.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _03모음사전 {

    public final static char[] WORDS = {'A', 'E', 'I', 'O', 'U'};
    public final static int MAX_LENGTH = 5;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        int result = solution(word);

        System.out.println(result);
    }

    private static int solution(String word) {
        int answer = 0;
        // 모든 단어를 저장하는 alphabet 리스트
        List<String> alphabet = new ArrayList<>();

        // 각 모음을 시작으로 하는 단어를 생성하는 dfs 메서드 호출
        for (char c : WORDS) {
            dfs(alphabet, String.valueOf(c));
        }

        // 주어진 단어가 리스트에서 몇 번째에 위치하는지 확인
        int len = alphabet.size();
        for (int i = 0; i < len; i++) {
            if (alphabet.get(i).equals(word)) {
                // 리스트에서 인덱스는 0부터 시작하므로 1을 + 해서 반환
                answer = i + 1;
                break;
            }
        }

        return answer;
    }

    // dfs를 통해 가능한 모든 조합의 단어 생성
    private static void dfs(List<String> alphabet, String str) {
        // 최대 길이를 넘어가면 종료
        if (str.length() > MAX_LENGTH) {
            return;
        }

        // 리스트에 없는 단어 확인하고 추가
        if (!alphabet.contains(str)) {
            alphabet.add(str);
        }

        // 각 모음을 이어가며 단어를 계속해서 완성
        for (char word : WORDS) {
            dfs(alphabet, str + word);
        }
    }

}