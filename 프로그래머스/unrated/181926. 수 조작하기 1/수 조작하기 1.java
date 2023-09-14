class Solution {
    public int solution(int n, String control) {
        int answer = n;
        String[] control_arr = control.split("");
        for(String s : control_arr){
            if(s.equals("w")) answer += 1;
            else if(s.equals("s")) answer -= 1;
            else if(s.equals("d")) answer += 10;
            else if(s.equals("a")) answer -= 10;
        }
        return answer;
    }
}