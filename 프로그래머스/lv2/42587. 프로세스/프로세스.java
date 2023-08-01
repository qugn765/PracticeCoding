import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> q1 = new LinkedList<>();
        List<Integer> pr = new ArrayList<>();
        for(int i = 0; i < priorities.length; i++){
            q1.offer(new int[] {i, priorities[i]});
            pr.add(priorities[i]);
        }
        Collections.sort(pr, Collections.reverseOrder());
        
        while(!q1.isEmpty()){
            // System.out.println(Arrays.toString(q1.poll()));
            int[] arr = q1.poll();
            if(arr[1] == pr.get(0)){
                pr.remove(0);
                answer++;
                if(arr[0] == location){
                    break;
                }
            } else {
                q1.offer(arr);
            }
            
        }
        return answer;
    }
}