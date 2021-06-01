package lesson42626;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/42626
public class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int sco : scoville) {
            heap.add(sco);
        }

        while (heap.peek() < K) {
            if (heap.size() < 2)  return -1;
            int newSco = heap.poll() + heap.poll() *2;
            heap.add(newSco);
            answer ++;
        }

        return answer;

    }
}
