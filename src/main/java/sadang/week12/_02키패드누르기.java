package sadang.week12;

public class _02키패드누르기 {

    public static void main(String[] args) {
        int[] numbers = {
                1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5
        };
        String hand = "right";

        String result = solution(numbers, hand);
        System.out.println(result);
    }

    public static String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int left = 10;
        int right = 12;

        for (int n : numbers) {
            if (n == 1 || n == 4 || n == 7) {
                sb.append("L");
                left = n;

            } else if (n == 3 || n == 6 || n == 9) {
                sb.append("R");
                right = n;

            } else {
                if (n == 0) {
                    n += 11;
                }
                int ld = Math.abs(n - left) / 3 + (Math.abs(n - left)) % 3;
                int rd = Math.abs(n - right) / 3 + (Math.abs(n - right)) % 3;
                if (ld == rd) {
                    if (hand.equals("right")) {
                        sb.append("R");
                        right = n;
                    } else {
                        sb.append("L");
                        left = n;
                    }
                } else if (ld > rd) {
                    sb.append("R");
                    right = n;
                } else {
                    sb.append("L");
                    left = n;
                }
            }
        }
        return sb.toString();
    }

}