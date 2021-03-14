package lesson42888;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

//https://programmers.co.kr/learn/courses/30/lessons/42888
class Solution {
    public String[] solution(String[] record) {
        ArrayList<String> answer = new ArrayList<>();
        Stream<String> strStream = Arrays.stream(record);
        Map<String, String> idAndName = new HashMap<>();

        strStream.forEach(str -> {
            String[] strArray = str.split(" ");
            if (strArray[0].equals("Enter") || strArray[0].equals("Change")) {
                idAndName.put(strArray[1],strArray[2]);
            }
        });

        strStream = Arrays.stream(record);

        strStream.forEach(str -> {
            String[] strArray = str.split(" ");
            if (strArray[0].equals("Enter")) {
                answer.add(idAndName.get(strArray[1])+"님이 들어왔습니다.");
            } else if (strArray[0].equals("Leave")){
                answer.add(idAndName.get(strArray[1])+"님이 나갔습니다.");
            }
        });
        return answer.toArray(new String[0]);
    }
}