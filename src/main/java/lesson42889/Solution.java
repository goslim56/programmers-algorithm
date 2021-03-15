package lesson42889;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/42889
public class Solution {
    class FailRateByStage {
        int stage;
        double failRate;

        public FailRateByStage(int stage, double failRate) {
            this.stage = stage;
            this.failRate = failRate;
        }
    }

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] challenge = new int[N];
        int[] fail = new int[N];
        List<FailRateByStage> list = new ArrayList<>();
        for (int stage :stages) {
            if (stage > N) {
                for (int i=0; i<N; i++) {
                    challenge[i]++;
                }
            } else {
                for (int i=0; i<stage; i++) {
                    if(i==stage-1) {
                        fail[i]++;
                    }
                    challenge[i]++;
                }
            }
        }

        for (int i=0; i<N; i++) {
            list.add(new FailRateByStage(i+1,(double) fail[i]/challenge[i]));
        }

        list.sort((a, b) -> {
            if (a.failRate < b.failRate)
                return 1;
            else if (a.failRate > b.failRate)
                return -1;
            else {
                if (a.stage < b.stage)
                    return -1;
                else
                    return 1;
            }
        });

        for (int i = 0; i< N; i++) {
            answer[i] = list.get(i).stage;
        }
        return answer;
    }
}
