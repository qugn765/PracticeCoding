import java.util.*;
class Solution {
    public static Set<String> set1 = new HashSet<>();
        // 왜 하나도 안들어가는지 모르곘음
    
    public int solution(String word) {
        List<String> result2 = new ArrayList<>();
        MakeString("", 0);
        Iterator<String> iter = set1.iterator();
        System.out.println(set1.size());
        while(iter.hasNext()){
            String tmp = iter.next();
            //System.out.println(tmp);
            result2.add(tmp);
        }
        Collections.sort(result2);
        //System.out.println(result2);
        int answer = result2.indexOf(word);
        return answer;
    }
    
    
    public static void MakeString(String tmp, int cnt){
        if(cnt > 4){
            set1.add(tmp);
        } else {
            MakeString(tmp + "A", cnt + 1);
            MakeString(tmp + "E", cnt + 1);
            MakeString(tmp + "I", cnt + 1);
            MakeString(tmp + "O", cnt + 1);
            MakeString(tmp + "U", cnt + 1);
            MakeString(tmp + "", cnt + 1);
        }
    }
}