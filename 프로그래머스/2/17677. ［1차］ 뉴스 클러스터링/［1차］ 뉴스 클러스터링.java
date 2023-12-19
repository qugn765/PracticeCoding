import java.util.ArrayList;
import java.util.List;

class Solution {
    		public int solution(String str1, String str2) {
        int answer = 1;
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();
        for(int i = 0; i < str1.length()-1; i++) {
        	String temp1 = str1.substring(i, i + 1).toLowerCase();
        	String temp2 = str1.substring(i + 1, i +2).toLowerCase();
        	if(!temp1.matches("[a-z]")) {
        		continue;
        	}
        	if(!temp2.matches("[a-z]")) {
        		continue;
        	}
        	String temp3 = temp1 + temp2;
        	list1.add(temp3);
        	list4.add(temp3);
        }
        System.out.println("list1 : " +list1);
        for(int i = 0; i < str2.length()-1; i++) {
        	String temp1 = str2.substring(i, i + 1).toLowerCase();
        	String temp2 = str2.substring(i + 1, i +2).toLowerCase();
        	if(!temp1.matches("[a-z]")) {
        		continue;
        	}
        	if(!temp2.matches("[a-z]")) {
        		continue;
        	}
        	String temp3 = temp1 + temp2;
        	list2.add(temp3);
        }
        System.out.println("list2 : " +list2);
        
        list4.addAll(list2);

        for(int i = 0; i < list1.size(); i++) {
        	for(int j = 0; j < list2.size(); j++) {
        		if(list1.get(i).equals(list2.get(j))) {
        			list3.add(list1.get(i));
        			list1.set(i, "11111");
        			list2.set(j, "22222");
        		}
        	}
        }
        System.out.println("교 : " + list3);
        for(int i = 0; i < list3.size(); i++) {
        	list4.remove(list3.get(i));
        }
        System.out.println("합 : " + list4);

        int idx1 = list3.size();
        int idx2 = list4.size();
        if(idx2 == 0) {
        	return answer * 65536;
        } else {
        	answer = (int)(1.0 * idx1 / idx2 * 65536);
        }
        return answer;
    }
}