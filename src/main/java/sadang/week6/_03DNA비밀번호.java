package sadang.week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _03DNA비밀번호 {

        public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st = new StringTokenizer(br.readLine());

                int s = Integer.parseInt(st.nextToken());
                int p = Integer.parseInt(st.nextToken());

                char[] dna = br.readLine().toCharArray();

                st = new StringTokenizer(br.readLine());
                int[] acgt = new int[4];
                for (int i = 0; i < 4; i++) {
                        acgt[i] = Integer.parseInt(st.nextToken());
                }

                int[] countACGT = new int[4];
                for (int j = 0; j < p; j++) {
                        if (dna[j] == 'A') {
                                countACGT[0]++;
                        } else if (dna[j] == 'C') {
                                countACGT[1]++;
                        } else if (dna[j] == 'G') {
                                countACGT[2]++;
                        } else if (dna[j] == 'T') {
                                countACGT[3]++;
                        }
                }

                int passwordCount = 0;

                for (int i = 0; i <= s - p; i++) {
                        boolean flag = false;

                        for (int j = 0; j < 4; j++) {
                                if (countACGT[j] < acgt[j]) {
                                        flag = true;
                                        break;
                                }
                        }

                        if (!flag) {
                                passwordCount++;
                        }

                        if (i == s - p) {
                                break;
                        }

                        countACGT[position(dna[i])]--;
                        countACGT[position(dna[i + p])]++;
                }

                System.out.println(passwordCount);
        }

        private static int position(char alph) {
                switch(alph) {
                        case 'A' : return 0;
                        case 'C' : return 1;
                        case 'G' : return 2;
                        case 'T' : return 3;
                }
                return -1;
        }
}