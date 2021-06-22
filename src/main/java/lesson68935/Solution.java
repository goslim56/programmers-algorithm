package lesson68935;

//https://programmers.co.kr/learn/courses/30/lessons/68935
public class Solution {
    public int solution(int n) {
        StringBuffer sb = new StringBuffer();
        while (n > 0) {
            sb.append(n%3);
            n /= 3;
        }
        return Integer.parseInt(sb.toString(), 3);
    }
}
