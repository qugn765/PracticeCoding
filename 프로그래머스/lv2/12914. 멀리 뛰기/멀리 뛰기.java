import java.util.*;

class Solution {
    public long solution(int n) {
        long answer = Solution.Fibo(n + 1);
        return answer;
    }
    
    public static long Fibo(int n){
        long answer = 0;
        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(1);
        for(int i = 2; i <=n; i++){
            result.add((result.get(i - 2) + result.get(i - 1))% 1234567);
        }
        answer = result.get(n);
        
        return answer;
    }
}