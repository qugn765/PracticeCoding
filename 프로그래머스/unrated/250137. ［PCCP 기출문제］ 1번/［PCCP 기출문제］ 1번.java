class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int last_time = attacks[attacks.length - 1][0];
        int continues = 0;
        int n = 0;
        for(int i = 0; i <= last_time; i++){
            if(n < attacks.length && i == attacks[n][0]){
                answer = answer - attacks[n][1];
                continues = 0;
                n++;
                if(answer <= 0) return -1;
            } else {
                answer += bandage[1];
                continues++;
                if(continues == bandage[0]){
                    answer += bandage[2];
                    continues = 0;
                }
                if(answer > health) answer = health;
            }

        }
        return answer;
    }
}