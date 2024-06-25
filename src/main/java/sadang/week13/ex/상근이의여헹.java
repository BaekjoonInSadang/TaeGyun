package sadang.week13.ex;

import java.util.Scanner;

public class 상근이의여헹 {

    static int[] parent;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int cnt = 1;

            int n = sc.nextInt();
            int m = sc.nextInt();

            parent = new int[n + 1];

            for(int j = 1; j < parent.length; j++) {
                parent[j] = j;
            }

            for (int j = 0; j < m; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                if (parent[a] != parent[b]) {
                    union(a, b);
                    cnt++;
                }

                if (cnt == n) {
                    System.out.println(cnt);
                    break;
                }
            }
        }

        sc.close();
    }

    static void union(int a, int b) {
        a = find(a);
        b = find(b);

        if (a < b) {
            parent[b] = a;
        } else {
            parent[a] = b;
        }
    }

    static int find(int k) {
        if (parent[k] == k) {
            return k;
        } else {
            return parent[k] = find(parent[k]);
        }
    }


}