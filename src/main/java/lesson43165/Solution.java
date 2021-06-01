package lesson43165;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/43165
public class Solution {
    int[] temp = null;
    int answer = 0;
    int tempTarget = 0;

    public int solution(int[] numbers, int target) {
        temp = numbers;
        tempTarget = target;
        dfs(0,0);
        return answer;
    }

    public void dfs(int idx, int num) {
        if (idx < temp.length) {
            dfs(idx+1, num + temp[idx]);
            dfs(idx+1, num - temp[idx]);
        } else if (idx == temp.length) {
            if (tempTarget == num) {
                answer++;
            }
        }
    }
}
