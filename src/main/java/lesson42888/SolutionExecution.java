package lesson42888;

import java.util.Arrays;

public class SolutionExecution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        System.out.println(Arrays.toString(solution.solution(record)));
    }
}