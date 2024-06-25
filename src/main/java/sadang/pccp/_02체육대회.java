package sadang.pccp;

public class _02체육대회 {

    public static void main(String[] args) {
        int[][] ability = {
                {40, 10, 10},
                {20, 5, 0},
                {30, 30, 30},
                {70, 0, 70},
                {100, 100, 100}
        };

        int result = solution(ability);
        System.out.println(result);
    }

    public static int solution(int[][] ability) {
        int students = ability.length;
        int sports = ability[0].length;
        boolean[] visited = new boolean[students];
        int[] maxSum = {0};

        dfs(ability, visited, 0, 0, maxSum, sports);

        return maxSum[0];
    }

    private static void dfs(int[][] ability, boolean[] visited, int sum, int count, int[] maxSum, int sports) {
        if (count == sports) {
            maxSum[0] = Math.max(maxSum[0], sum);
            return;
        }
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(ability, visited, sum + ability[i][count], count + 1, maxSum, sports);
                visited[i] = false;
            }
        }
    }
}