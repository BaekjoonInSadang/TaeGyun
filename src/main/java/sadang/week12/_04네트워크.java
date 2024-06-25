package sadang.week12;

public class _04네트워크 {

    public static void main(String[] args) {
        int n = 3;
        int[][] network = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };

        solution(n, network);
    }

    public static int solution(int n, int[][] network) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for(int i = 0; i < network.length; i++){
            if(!visited[i]){
                answer++;
                dfs(i, visited, network);
            }
        }

        return answer;
    }

    public static void dfs(int computer, boolean[] visited, int[][] network){
        visited[computer] = true;

        for(int i = 0; i < network.length; i++){
            if(!visited[i] && network[computer][i] == 1){
                dfs(i, visited, network);
            }
        }
    }

}