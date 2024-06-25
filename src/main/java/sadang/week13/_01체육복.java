package sadang.week13;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class _01체육복 {

    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        int result = solution(n, lost, reserve);
        System.out.println(result);
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        Set<Integer> lostSet = Arrays.stream(lost).boxed().collect(Collectors.toSet());
        Set<Integer> reserveSet = Arrays.stream(reserve).boxed().collect(Collectors.toSet());

        Arrays.stream(lost)
                .filter(reserveSet::contains)
                .forEach(j -> {
                    reserveSet.remove(j);
                    lostSet.remove(j);
                });

        for (Integer i : lostSet) {
            if (reserveSet.contains(i - 1)) {
                reserveSet.remove(i - 1);
            } else if (reserveSet.contains(i + 1)) {
                reserveSet.remove(i + 1);
            } else {
                n--;
            }
        }

        return n;
    }

}