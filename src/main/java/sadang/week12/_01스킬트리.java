package sadang.week12;

public class _01스킬트리 {

    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {
                "BACDE", "CBADF", "AECB", "BDA"
        };

        int result = solution(skill, skill_trees);
        System.out.println(result);
    }

    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String tree : skill_trees) {
            if (isValidSkillTree(skill, tree)) {
                answer++;
            }
        }

        return answer;
    }

    private static boolean isValidSkillTree(String skill, String tree) {
        int index = 0;
        char[] chars = tree.toCharArray();

        for (char c : chars) {
            if (skill.indexOf(c) == -1) {
                continue;
            }

            if (c == skill.charAt(index)) {
                index++;
            } else {
                return false;
            }
        }

        return true;
    }

}