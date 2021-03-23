package lesson42890;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/42890
public class Solution {
    public int solution(String[][] relation) {
        int colLength = relation[0].length;
        List<Integer> candidateKey = new ArrayList<>();

        for (int i = 1; i < 1 <<colLength; i++) {
            boolean minimality = true;
            for (int check :candidateKey) {
                if ((check& i) == check) {
                    minimality  =false;
                    continue;
                }
            }
                if (minimality  && isUnique(relation,i) == true) {
                    candidateKey.add(i);
                }
        }
        return candidateKey.size();
    }

    public boolean isUnique(String[][] relation, int subSet) {
        //유일성판단
        for (int i =0; i < relation.length -1; i++) {
            StringBuilder tupleBuilder = new StringBuilder();
            for (int j = 0; j< relation[0].length; j++) {  //현재 행의 부분 집합 구하기
                if ( (1 << j & subSet) != 0) {
                    tupleBuilder.append(relation[i][j]);
                }
            }
            String currentTuple = tupleBuilder.toString();
            tupleBuilder.setLength(0);
            for (int k = i +1; k < relation.length; k++) {
                for (int j = 0; j< relation[0].length; j++) {//비교 대상 행의 부분 집합 구하기
                    if ( (1 << j & subSet) != 0) {
                        tupleBuilder.append(relation[k][j]);
                    }
                }
                String targetTuple = tupleBuilder.toString();
                if (targetTuple.equals(currentTuple)) {
                    return false;
                }
                tupleBuilder.setLength(0);
            }
        }
        return true;
    }
}
