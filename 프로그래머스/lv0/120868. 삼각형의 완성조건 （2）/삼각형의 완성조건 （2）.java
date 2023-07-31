class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        for(int i = 0; i < 2000; i++){
            if(sides[0] <= i && sides[1] <= i){
                if(i < sides[0] + sides[1]) answer++;
            } else if( sides[0] <= sides[1] && i <= sides[1]){
                if(sides[1] < sides[0] + i) answer++;
            } else if ( sides[1] <= sides[0] && i <= sides[0]){
                if(sides[0] < sides[1] + i) answer++;
            } else if(sides[0]==sides[1] && sides[1]==i){
                answer++;
            } 
        }
        return answer;
    }
}