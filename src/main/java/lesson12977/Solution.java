package lesson12977;

//https://programmers.co.kr/learn/courses/30/lessons/12977
public class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int size = nums.length;
        for (int i = 0; i < size - 2; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                for (int k = j + 1; k < size; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    boolean isPrime = true;
                    for (int l = 2; l <= Math.sqrt(sum); l++) {
                        if (sum % l == 0) {
                            isPrime = false;
                            break;
                        }
                    }

                    if (isPrime) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
