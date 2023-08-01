import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        String answer = "";
        int cnt = 1;
        for(String a : completion) {
            map1.put(a, map1.getOrDefault(a, 0) + 1);
        }
        for(String tmp : participant) {
            int checka = map1.getOrDefault(tmp, 0);
            map1.put(tmp, checka -1);
            if(checka == 0) answer = tmp;
        }
        return answer;
    }
}