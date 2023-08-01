import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map1 = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            map1.put(array[i], map1.getOrDefault(array[i], 0) + 1);
        }
        int max = 0;
        int answer = 0;
        for(int key : map1.keySet()){
            if(max < map1.get(key)){
                max = map1.get(key);
                answer = key;
            } else if(max == map1.get(key)){
                answer = -1;
            }
        }
        return answer;
    }
}