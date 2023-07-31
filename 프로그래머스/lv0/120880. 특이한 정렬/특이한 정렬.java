import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        List<Integer> list1 = new ArrayList<>();

        for(int i = 0; i < numlist.length; i++) {
            list1.add(numlist[i]);
        }

        Collections.sort(list1, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(n-o2) == Math.abs(n-o1)){
                    return o2 - o1;
                } else {
                    return Math.abs(n-o1) - Math.abs(n-o2);                    
                }
            }
        });

        int[] answer = new int[list1.size()];
        for(int i = 0; i < list1.size(); i++) {
            answer[i] = list1.get(i);
        }

        return answer;
    }
}



















// import java.util.*;

// class Solution {
//     public int[] solution(int[] numlist, int n) {
//         int[] answer = new int[numlist.length];
//         int idx = 0;
//         while(idx < answer.length){
//             int min = Integer.MAX_VALUE;
//             int min_idx = 0;
//             for(int i = 0; i < numlist.length; i++){
//                 if(Math.abs(numlist[i] - n) < min){
//                     min = Math.abs(numlist[i] - n);
//                     min_idx = i;
//                 } else if(Math.abs(numlist[i] - n) == min) {
//                     if(numlist[i] > numlist[min_idx]){
//                         min_idx = i;
//                     }
//                 }
//             }
//             answer[idx] = numlist[min_idx];
//             numlist[min_idx] = Integer.MAX_VALUE;
//             idx++;
//         }
        
//         return answer;
//     }
// }