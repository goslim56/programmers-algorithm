package lesson77484;

//https://programmers.co.kr/learn/courses/30/lessons/77484
public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {

        int zeroCount = 0;
        int correctCount = 0;

        for (int num : lottos) {
            if (num == 0) {
                zeroCount++;
            } else {
                for (int i = 0; i < win_nums.length; i++) {
                    if (win_nums[i] == num) {
                        correctCount++;
                        break;
                    }
                }
            }
        }
        int worst = Math.min(7 - correctCount, 6);
        int best = Math.min(7 - (correctCount + zeroCount), 6);

        return new int[]{best, worst};
    }
}
