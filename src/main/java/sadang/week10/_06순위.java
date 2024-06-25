/*
package sadang.week13;

import java.util.Arrays;

public class 양궁대회 {

    */
/*
    양궁대회
    양궁대회가 열렸습니다. 지난번 결승장은 라이언이고 이번에도 결승에도 올라왔으며 상대방은 어피치다.
    라이언과 어피치는 양궁대회에서 참가자들이 양궁을 쏘아서 얻는 점수를 기록하고, 높은 점수를 받은 사람이 승리하는 대회입니다.
    그러나 대회에서는 연속으로 우승하는 것보단 다양한 사람들이 우승하는 것이 더 재미있기 때문에, 라이언과 어피치는 이번 대회에서는 다음과 같은 규칙을 추가하였습니다.
    양궁대회는 다음과 같은 규칙으로 진행됩니다.
    1. 참가자는 n발을 발사합니다.
    2. 각각의 참가자는 과녁에 양궁을 발사하며, 각 점수에 따라 점수를 얻습니다.
    3. 각 점수마다 더 많이 맞춘 참가자가 점수를 가져가며, 많이 맞춰도 점수는 k점수 그대로 가져갑니다.
    4. 그리고 각각의 참가자는 자신이 얻는 점수를 기록합니다.
    5. 라이언과 어피치는 참가자들이 얻는 점수를 비교해서 둘 중 누가 더 높은 점수를 얻었는지 확인합니다.
    6. 라이언이나 어피치 중 한 명이 더 높은 점수를 얻은 사람이 우승자가 됩니다.

    문제 풀이 알고리즘
    dfs를 이용하여 라이언과 어피치가 얻는 점수를 계산한다.
     *//*


    static int[] res = {-1};
    static int[] lion = new int[11];
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        int n = 5;
        int[] info = {2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0};

        int[] result = solution(n, info);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int n, int[] info) {
        dfs(info, 1, n);
        return res;
    }

    public static void dfs(int[] info, int cnt, int n) {
        if (cnt == n + 1) {
            int apeach_point = 0;
            int lion_point = 0;
            for (int i = 0; i <= 10; i++) {
                if (info[i] != 0 || lion[i] != 0) {
                    if (info[i] < lion[i])
                        lion_point += 10 - i;
                    else
                        apeach_point += 10 - i;
                }
            }
            if (lion_point > apeach_point) {
                if (lion_point - apeach_point >= max) {
                    res = lion.clone();
                    max = lion_point - apeach_point;
                }
            }
            return;
        }
        for (int j = 0; j <= 10 && lion[j] <= info[j]; j++) {
            lion[j]++;
            dfs(info, cnt + 1, n);
            lion[j]--;
        }
    }

}*/
