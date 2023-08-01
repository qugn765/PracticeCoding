import java.util.*;

class Solution {
    public static List<Integer> list1 = new ArrayList<>();
    
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        boolean[] check = new boolean[dungeons.length];
        DFS(k, dungeons, 0, check.clone());
        Collections.sort(list1, Collections.reverseOrder());
        answer = list1.get(0);
        return answer;
    }
    
    public static void DFS(int k, int[][] dungeons, int cnt, boolean[] check){
        //System.out.println("k  : " + k + " ,   cnt :  " + cnt);
        for(int i = 0; i < dungeons.length; i++){
            if(k >= dungeons[i][0] && !check[i]){
                check[i] = true;
                DFS(k - dungeons[i][1], dungeons, cnt + 1, check);
                check[i] = false;
            } else {
                list1.add(cnt);
            }
        }
    }
}