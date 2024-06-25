package sadang.ex;

public class _02IntegerToRoman {

    public static void main(String[] args) {
        int num = 3749;

        String result = solution(num);
        System.out.println(result);
    }

    public static String solution(int num) {
        StringBuilder sb = new StringBuilder();

        toRoman(sb, num / 1000, "M", "", "");
        toRoman(sb, (num % 1000) / 100, "C", "D", "M");
        toRoman(sb, (num % 100) / 10, "X", "L", "C");
        toRoman(sb, num % 10, "I", "V", "X");

        return sb.toString();
    }

    public static String toRoman(
            StringBuilder ret,
            int number,
            String unit,
            String unitFive,
            String unitTen
    ) {
        if (number == 0) {
            return ret.toString();
        } else if (number < 4) {
            for (int i = 0; i < number; ++i) {
                ret.append(unit);
            }
        } else if (number == 4) {
            ret.append(unit).append(unitFive);
        } else if (number < 9) {
            ret.append(unitFive);
            for (int i = 5; i < number; ++i) {
                ret.append(unit);
            }
        } else {
            ret.append(unit).append(unitTen);
        }

        return ret.toString();
    }

}
