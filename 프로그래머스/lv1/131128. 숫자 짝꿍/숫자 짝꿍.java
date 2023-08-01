import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        Map<String, Integer> map1 = new HashMap<>();
        List<String> result = new ArrayList<>();
        String[] arr_X = X.split("");
        String[] arr_Y = Y.split("");
        for(String s : arr_X){
            map1.put(s, map1.getOrDefault(s,0) + 1);
        }
        for(String s : arr_Y){
            int tmp = map1.getOrDefault(s, 0);
            if(tmp > 0) {
                map1.put(s,tmp -1);
                result.add(s);
            }
        }
        if(result.size() == 0){
            return "-1";
        } else if (result.get(0).equals("0")){
            return "0";
        }
        StringBuilder answer1 = new StringBuilder();
        Collections.sort(result, Collections.reverseOrder());
        for(int i = 0; i < result.size(); i++){
            answer1.append(result.get(i));
        }
        String answer = answer1.toString();
      
        return answer;
    }
}