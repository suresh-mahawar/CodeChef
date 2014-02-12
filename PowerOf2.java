package codechef;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PowerOf2 {
	public static void main(String [] args) throws IOException{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		short t = Short.parseShort(sc.readLine());
		while(t>0){
		int N = Integer.parseInt(sc.readLine());
		int count = 0;
		while(N>1){
			N= N>>1&1;
			count += (N&1)>0? 1 : 0;
		}
		System.out.print(count==1 ? "1" : "0");
		t--;
		}
	}
}
