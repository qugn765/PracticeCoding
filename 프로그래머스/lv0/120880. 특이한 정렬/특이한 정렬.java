import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int idx = 0;
        while(idx < answer.length){
            int min = Integer.MAX_VALUE;
            int min_idx = 0;
            for(int i = 0; i < numlist.length; i++){
                if(Math.abs(numlist[i] - n) < min){
                    min = Math.abs(numlist[i] - n);
                    min_idx = i;
                } else if(Math.abs(numlist[i] - n) == min) {
                    if(numlist[i] > numlist[min_idx]){
                        min_idx = i;
                    }
                }
            }
            answer[idx] = numlist[min_idx];
            numlist[min_idx] = Integer.MAX_VALUE;
            idx++;
        }
        
        return answer;
    }
}