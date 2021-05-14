package lesson12899;

//https://programmers.co.kr/learn/courses/30/lessons/12899?language=java
public class Solution {
    public String solution(int n) {
        String[] arr = {"4", "1", "2"};
        String answer = "";

        while (n > 0) {
            int index = n%3;
            answer = arr[index] + answer;
            if (index ==0){
                n--;
            }
            n /= 3;
        }
        return answer;
    }
}
