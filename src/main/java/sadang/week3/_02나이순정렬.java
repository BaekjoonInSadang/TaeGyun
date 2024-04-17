package sadang.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _02나이순정렬 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Member> members = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] st = br.readLine().split(" ");
            int age = Integer.parseInt(st[0]);
            String name = st[1];
            members.add(new Member(age, name));
        }

        Collections.sort(members, (m1, m2) -> Integer.compare(m1.age, m2.age));

        for (Member member : members) {
            System.out.println(member.age + " " + member.name);
        }
    }

    private static class Member {
        int age;
        String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}
