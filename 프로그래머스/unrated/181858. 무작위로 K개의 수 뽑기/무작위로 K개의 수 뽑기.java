import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
       List<Integer> arrayList = new ArrayList<>();
        for(int a : arr){
            if (!arrayList.contains(a)){
                arrayList.add(a);        
            }
        }
        int idx = 0;
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        for (int i = 0;i < k && i < arrayList.size();i++)
            answer[i] = arrayList.get(i);
        return answer;
    }
}