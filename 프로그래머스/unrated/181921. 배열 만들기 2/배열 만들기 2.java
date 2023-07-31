import java.util.*;

class Solution {
    Set<Integer> set1 = new HashSet<>();
    public int[] solution(int l, int r) {
        List<Integer> list1 = new ArrayList<>();
        int len = String.valueOf(r).length();
        Make5("", len);
        Iterator<Integer> iter = set1.iterator();
        int idx = 0;
        while(iter.hasNext()){
            int tmp = iter.next();
            if(tmp <= r && l <= tmp){
                list1.add(tmp);
            }
        }
        int[] answer = {-1};
        if(list1.size() != 0) {
            answer = new int[list1.size()];
            Collections.sort(list1);
            for(int i = 0; i < answer.length; i++){
                answer[i] = list1.get(i);
            }
        }
        return answer;
    }
    
    public void Make5(String tmp, int len){
        if(len == 0) {
            set1.add(Integer.parseInt(tmp));
        } else {
            Make5(tmp+"5", len -1);
            Make5(tmp+"0", len -1);
        }
    }
}