import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int line = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Queue<Integer> waitingline = new LinkedList<>();
		Stack<Integer> sideline = new Stack<>();

		int number = 1;
		int cnt = st.countTokens();
		for (int i = 0; i < cnt; i++) {
			waitingline.offer(Integer.parseInt(st.nextToken()));
		}
		String result = "Sad";
		while(!waitingline.isEmpty()) {
			if(waitingline.peek() == number) {
				waitingline.poll();
				number++;
				if(number == line) {
					result =  "Nice";
				}
				continue;
			} else if(!sideline.isEmpty() && sideline.peek() == number){
				sideline.pop();
				number++;
				if(number == line) {
					result =  "Nice";
				}
				continue;
			} else {
				sideline.add(waitingline.poll());
			}
		}
		while(!sideline.isEmpty()) {
			if(sideline.pop() == number) {
				number++;
			} else {
				break;
			}
		}
		if((number - 1) == line) {
			result = "Nice";
		}
		System.out.println(result);
	}
}