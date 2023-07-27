import java.util.*;

class Solution {
    
    public static int[] dx = {0,1,0,-1};
    public static int[] dy = {1,0,-1,0};
    
    public int solution(int[][] maps) {
        Queue<int[]> q1 = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        maps[0][0] = 1;
        q1.offer(new int[] {0, 0, 1});
        while(!q1.isEmpty()){
            int[] tmp = q1.poll();
            if(tmp[0] == maps.length - 1 && tmp[1] == maps[0].length - 1){
                result.add(tmp[2]);
            }
            for(int k = 0; k < 4; k++){
                int x2 = tmp[0] + dx[k];
                int y2 = tmp[1] + dy[k];
                int cnt = tmp[2] + 1;
                if(0 <= x2 && x2 < maps.length && 0 <= y2 && y2 < maps[0].length 
                    && maps[x2][y2] == 1){
                    maps[x2][y2] = 0;
                    q1.offer(new int[] {x2,y2,cnt});
                }
            }
        }
        if(result.size() == 0) return -1;
        Collections.sort(result);
        int answer = result.get(0);
        return answer;
    }
}


// import java.util.*;

// class Solution {
    
//     public static List<Integer> result = new ArrayList<>();
//     public static int[] dx = {0,1,0,-1};
//     public static int[] dy = {1,0,-1,0};
    
//     public int solution(int[][] maps) {
        
//         int answer = 0;
//         boolean[][] check_bool = new boolean[maps.length][maps[0].length];
//         Solution a = new Solution();
//         check_bool[0][0] = true;
//         a.DFS(maps, check_bool, 0, 0, 1);
//         if(result.size() == 0){
//             answer = -1;
//         } else {
//             Collections.sort(result);
//             System.out.println(result.get(0));
//             answer = result.get(0);
//             System.out.println(result);
//         }

        
//         return answer;
//     }
    
    
//     public static void DFS(int[][] maps, boolean[][] check_bool, int x , int y, int cnt){
//         if(x == (maps.length - 1) && y == (maps[0].length - 1)){
//             result.add(cnt);
//         }
//         for(int i = 0; i < 4; i++){
//             int x2 = x + dx[i];
//             int y2 = y + dy[i];
//             if(0 <= x2 && x2 < maps.length && 0 <= y2 && y2 < maps[0].length 
//                 && maps[x2][y2] == 1 && !check_bool[x2][y2]){
//                 //System.out.println("x : " + x2 + " , y2 : " + y2);
//                 check_bool[x2][y2] = true;
//                 DFS(maps, check_bool, x2, y2, ++cnt);
//                 check_bool[x2][y2] = false;
//                 //System.out.println();
//             }
//         }
//     }
// }