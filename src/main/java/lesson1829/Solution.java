package lesson1829;

import java.util.Arrays;
//https://programmers.co.kr/learn/courses/30/lessons/1829
public class Solution {
    int numberOfArea = 0;
    int maxSizeOfOneArea = 0;
    int tempSize = 0;
    int[][] TempPic = null;



    public int[] solution(int m, int n, int[][] picture) {
        TempPic = new int[m][n];
        for (int i = 0; i < m; i++) {
            TempPic[i] = Arrays.copyOf(picture[i], picture[i].length);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (TempPic[i][j] > 0) {
                    numberOfArea++;
                    tempSize = 0;
                    dfs(i, j, TempPic[i][j]);
                    maxSizeOfOneArea = Math.max(maxSizeOfOneArea, tempSize);
                }
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    public void dfs(int i, int j, int num) {
        if (TempPic[i][j] == num) {
            tempSize++;
            TempPic[i][j] = 0;
        }

        if (i < TempPic.length - 1 && num == TempPic[i + 1][j]) {
            dfs(i + 1, j, num);
        }
        if (j < TempPic[0].length - 1 && num == TempPic[i][j + 1]) {
            dfs(i, j + 1, num);
        }

        if (i > 0 && num == TempPic[i - 1][j]) {
            dfs(i - 1, j, num);
        }
        if (j > 0 && num == TempPic[i][j - 1]) {
            dfs(i, j - 1, num);
        }
    }
}
