import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        for(int i = 0; i < picture.length; i++){
            String[] arr = picture[i].split("");
            String tmp = "";
            for(int a = 0; a < arr.length; a++){
                for(int b = 0; b < k; b++){
                    tmp = tmp + arr[a];
                }
            }
            picture[i] = tmp;
        }
        int idx = 0;
        for(int i = 0; i < answer.length; ){
            for(int j = 0; j < k; j++){
                answer[i] = picture[idx];
                i++;
            }
            idx++;
        }
     
        return answer;
    }
}