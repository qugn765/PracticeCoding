import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String num = st.nextToken(); //B진법의 값인 N
        int n = Integer.parseInt(st.nextToken()); //몇 진법인지
        br.close();
        
        char[] arr = num.toCharArray();
        int idx = arr.length;
        if(arr.length >= 1){
            idx = idx - 1;
        }
        
        int answer = 0;
        for(int i = 0; i < arr.length; i++){
            if((int)'A' <= (int)arr[i] && (int)arr[i] <=(int)'Z'){
                answer += Math.pow(n, (idx - i)) * ((int)arr[i] - (int)'A' + 10);
            } else {
                answer += Math.pow(n,(idx - i)) * Character.getNumericValue(arr[i]);
            }
        }
        System.out.println(answer);
	}
}