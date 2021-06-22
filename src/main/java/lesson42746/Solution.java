package lesson42746;
//https://programmers.co.kr/learn/courses/30/lessons/42746

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String solution(int[] numbers) {

        List<String> intList = new ArrayList<>(numbers.length);
        for (int i : numbers) {
            intList.add(String.valueOf(i));
        }

        intList.sort((a, b) -> (b + a).compareTo(a + b));

        String num = String.join("", intList);

        return num.charAt(0) == '0' ? "0" : num;
    }
}
