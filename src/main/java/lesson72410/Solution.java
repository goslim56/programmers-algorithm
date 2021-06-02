package lesson72410;

import java.util.ArrayList;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/72410
public class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();
        int size = new_id.length();
        List<Character> list = new ArrayList<>();
        System.out.println("new_id = " + new_id);
        for (int i = 0; i < size; i++) {
            char temp = new_id.charAt(i);
            boolean isAlp = (temp >= 'a' && temp <= 'z');
            boolean isNum = (temp >= '0' && temp <= '9');
            boolean isBar = temp == '-';
            boolean isUnderBar = temp == '_';
            boolean isDat = temp == '.';
            if (isAlp || isNum || isBar || isUnderBar || isDat) {
                if (isDat) {
                    if (list.size() > 0 && list.get(list.size() - 1) == temp) {
                        continue;
                    }
                }
                list.add(temp);
            }
        }

        if (list.get(0) == '.') {
            list.remove(0);
        }

        if (list.size() > 0 && list.get(list.size() - 1) == '.') {
            list.remove(list.size() - 1);
        }

        if (list.size() == 0) {
            list.add('a');
        }

        if (list.size() > 15) {
            list = list.subList(0, 15);
            if (list.get(list.size() - 1) == '.') {
                list.remove(list.size() - 1);
            }
        }

        while (list.size() <= 2) {
            list.add(list.get(list.size() - 1));
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (char item : list) {
            stringBuilder.append(item);
        }

        return stringBuilder.toString();
    }
}
