package lesson77884;
//https://programmers.co.kr/learn/courses/30/lessons/77884
public class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            if (isEvenAliquot(i)) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }

    //약수 개수가 짝수 인가
    public boolean isEvenAliquot(int num) {
        int count = 0;
        double sqrt = Math.sqrt(num);
        for (int i = 1; i <= sqrt; i++) {
            if (sqrt == i) {
                count ++;
            } else if (num % i == 0) {
                count += 2;
            }

        }
        return count % 2 == 0;
    }
}