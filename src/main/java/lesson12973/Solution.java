package lesson12973;

import java.util.Stack;

//https://programmers.co.kr/learn/courses/30/lessons/12973
public class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else {
                if (stack.peek() == s.charAt(i)) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
