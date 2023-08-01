import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> map1 = new HashMap<>();
        List<Integer> list1 = new ArrayList<>();
        String[] today_arr = today.split("\\.");
        System.out.print(Arrays.toString(today_arr));
        int today_year = Integer.parseInt(today_arr[0]);
        int today_month = Integer.parseInt(today_arr[1]);
        int today_day = Integer.parseInt(today_arr[2]);
        for(int i = 0; i < terms.length; i++){
            String[] arr = terms[i].split(" ");
            map1.put(arr[0], Integer.parseInt(arr[1]));
        }
        
        for(int i = 0; i < privacies.length; i++){
            String[] p_arr = privacies[i].split(" ");
            String[] p_date = p_arr[0].split("\\.");
            
            int plus_month = map1.get(p_arr[1]);
            int plus_year = 0;
            int day = Integer.parseInt(p_date[2]);
            int month = Integer.parseInt(p_date[1]) + plus_month;
            while(month > 12){
                month = month - 12;
                plus_year++;
            }
            int year = Integer.parseInt(p_date[0]) + plus_year;
            if(year < today_year){
                list1.add(i + 1);
            } else if(year > today_year){
                continue;
            } else if(year == today_year) {
                if(month < today_month){
                    list1.add(i + 1);
                } else if(month > today_month){
                    continue;
                } else if(month == today_month) {
                    if(day < today_day){
                        list1.add(i + 1);
                    } else if(day > today_day){
                        continue;
                    } else if(day == today_day) {
                        list1.add(i + 1);
                    }
                }
            }
        }
        int[] answer = list1.stream().mapToInt(i->i).toArray();
        return answer;
    }
}