package sadang.week7;

public class _01쿼드압축후개수세기 {

    public static void main(String[] args) {

    }

    public int[] solution(int[][] arr) {
        int[] answer = {};
        return answer;
    }

    private static class Count {
        public final int zero;
        public final int one;

        public Count(int zero, int one) {
            this.zero = zero;
            this.one = one;
        }

        public Count add(Count other) {
            return new Count(zero + other.zero, one + other.one);
        }
    }

}