import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q1 = new LinkedList<>();
        for(int i = 0; i < progresses.length; i++){
            int cnt = 0;
            while(progresses[i] < 100){
                progresses[i] += speeds[i];
                cnt++;
            }
            q1.offer(cnt);
        }
        System.out.println(q1);
        List<Integer> result = new ArrayList<>();
        int tmp = 1;
        int day = 0;
        while(!q1.isEmpty()){
            int count = 1;
            tmp = q1.poll();
            day = Math.max(day,tmp);
            while(!q1.isEmpty() && day >= q1.peek()){
                q1.poll();
                count++;
            }
            result.add(count);
        }
        int[] answer = result.stream().mapToInt(i->i).toArray();
        return answer;
    }
}