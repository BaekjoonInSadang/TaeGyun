package sadang.week12;

public class _03타겟넘버 {

    public static int ANSWER = 0;

    public static void main(String[] args) {
        int[] numbers = {
                1, 1, 1, 1, 1
        };
        int target = 3;

        int result = solution(numbers, target);
        System.out.println(result);
    }

    public static int solution(int[] numbers, int target) {
        dfs(0, numbers, target, 0);
        return ANSWER;
    }

    private static void dfs(int depth, int[] numbers, int target, int sum) {
        if (depth == numbers.length) {
            if (sum == target) {
                ANSWER++;
            }
            return;
        }

        dfs(depth + 1, numbers, target, sum + numbers[depth]);
        dfs(depth + 1, numbers, target, sum - numbers[depth]);
    }

}