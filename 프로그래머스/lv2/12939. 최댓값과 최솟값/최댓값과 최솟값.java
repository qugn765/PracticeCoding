import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int[] arr_int = new int[arr.length];
        for(int i = 0; i < arr_int.length; i++){
            arr_int[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(arr_int);
        answer += arr_int[0] + " " + arr_int[arr_int.length-1];
        return answer;
    }
}