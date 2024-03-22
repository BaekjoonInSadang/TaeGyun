package sadang.week2;

import java.io.*;

public class _04사탕게임 {

    public static char[][] board;
    public static int num;
    public static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        num = Integer.parseInt(br.readLine());
        board = new char[num][num];

        String line = "";
        for(int i = 0; i < num; i++) {
            line = br.readLine();
            board[i] = line.toCharArray();
        }

        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num-1; j++) {
                char swap = board[i][j];
                board[i][j] = board[i][j+1];
                board[i][j+1] = swap;

                search();

                swap = board[i][j];
                board[i][j] = board[i][j+1];
                board[i][j+1] = swap;
            }
        }

        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num-1; j++) {
                char swap = board[j][i];
                board[j][i] = board[j+1][i];
                board[j+1][i] = swap;

                max = Math.max(search(), max);

                swap = board[j][i];
                board[j][i] = board[j+1][i];
                board[j+1][i] = swap;
            }
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }

    private static int search() {
        for(int i = 0; i < num; i++) {
            int cnt = 1;
            for(int j = 0; j < num-1; j++) {
                if(board[i][j] == board[i][j+1]) {
                    cnt++;
                } else {
                    cnt = 1;
                }
                max = Math.max(max, cnt);
            }
        }

        for(int i = 0; i < num; i++) {
            int cnt = 1;
            for(int j = 0; j < num-1; j++) {
                if(board[j][i] == board[j+1][i]) {
                    cnt++;
                } else {
                    cnt = 1;
                }
                max = Math.max(max, cnt);
            }
        }

        return max;
    }

}