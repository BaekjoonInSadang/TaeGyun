/*
package sadang.week10.ex;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class 주차요금계산 {

    public static int DEFAULT_TIME = 0;
    public static int DEFAULT_FEE = 0;
    public static int UNIT_TIME = 0;
    public static int UNIT_FEE = 0;

    public static void main(String[] args) throws IOException {
        int[] fees = {180, 5000, 10, 600};
        String[] records = {
                "05:34 5961 IN",
                "06:00 0000 IN",
                "06:34 0000 OUT",
                "07:59 5961 OUT",
                "07:59 0148 IN",
                "18:59 0000 IN",
                "19:09 0148 OUT",
                "22:59 5961 IN",
                "23:00 5961 OUT"
        };

        int result = solution(fees, records);
        System.out.println(result);
    }

    public static int solution(int[] fees, String[] records) {
        DEFAULT_TIME = fees[0]; // 기본 시간
        DEFAULT_FEE = fees[1]; // 기본 요금
        UNIT_TIME = fees[2]; // 단위 시간
        UNIT_FEE = fees[3]; // 단위 요금
        int endTime = getUsedTime("23:59");

        Map<String, Integer> recordMap = new HashMap<>();

        for (String record : records) {
            int usedTime = getUsedTime(record.split(" ")[0]);
            String carNumber = record.split(" ")[1];
            String status = record.split(" ")[2];

            if (!recordMap.containsKey(carNumber)) {
                recordMap.put(carNumber, endTime);
            }

            if (status.equals("IN")) {
                recordMap.put(carNumber, usedTime);
            } else {
                int inTime = recordMap.remove(carNumber);
                int parkedTime = usedTime - inTime;
                recordMap.put(carNumber, recordMap.getOrDefault(carNumber, 0) + parkedTime);
            }
        }

        return 0;
    }

    public static int getUsedTime(String time) {
        String[] split = time.split(":");
        return Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
    }

    public class Record {
        String carNumber;
        int inTime;
        int outTime;
        int parkedTime;
    }

}*/
