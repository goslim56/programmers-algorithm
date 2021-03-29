package lesson42891;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/42891
public class Solution {
    class Food {
        int index;
        int time;

        public Food(int index, int time) {
            this.index = index;
            this.time = time;
        }

    }
    public int solution(int[] food_times, long k) {

        int index = 1;
        List<Food> foodList = new ArrayList<>();
        for (int time : food_times) {
            foodList.add(new Food(index++,time));
        }

        foodList.sort(Comparator.comparingInt(a -> a.time));


        int priorTime = 0;

        int remainingFoodCount = food_times.length;
        for (int i = 0; i <foodList.size(); i++) {
            Food food = foodList.get(i);
            long diff = food.time - priorTime;
            long spendTime = diff * remainingFoodCount;
            if (k >=  spendTime) {
                k -= spendTime;
            } else {
                foodList = foodList.subList(i,foodList.size());
                break;
            }
            remainingFoodCount--;
            priorTime = food.time;
        }

        if (remainingFoodCount == 0) {
            return -1;
        } else {
            foodList.sort(Comparator.comparingInt(a -> a.index));
            k = k%foodList.size();
            return foodList.get((int)k).index;
        }
    }
}
