package sadang.pccp;

public class _03실습용로봇 {

    public static void main(String[] args) {
        String commands = "GRGLGRG";
        int[] result = solution(commands);

        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] solution(String commands) {
        int[] answer = new int[2];
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int[] directions = {0, 1, 2, 3};

        int x = 0;
        int y = 0;
        int dir = 0;

        for (int i = 0; i < commands.length(); i++) {
            char command = commands.charAt(i);

            if (command == 'G') {
                x += dx[dir];
                y += dy[dir];
            } else if (command == 'L') {
                dir = directions[(dir + 3) % 4];
            } else if (command == 'R') {
                dir = directions[(dir + 1) % 4];
            }
        }

        answer[0] = x;
        answer[1] = y;

        return answer;
    }

}