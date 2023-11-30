import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            list1.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(list1);
        
        String[] answer = new String[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            answer[i] = list1.get(i).substring(1, list1.get(i).length());
        }
        return answer;
    }
}