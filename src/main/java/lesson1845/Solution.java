package lesson1845;

import java.util.HashSet;
import java.util.Set;

//https://programmers.co.kr/learn/courses/30/lessons/1845
public class Solution {
    public int solution(int[] nums) {
        int result = nums.length/2;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        return Math.min(set.size(), result);
    }
}
