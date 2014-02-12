package codechef;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LalithDosa {
		public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine());
			int prices[] = new int[N];
			String pricecopy[] = new String[N];
			pricecopy = br.readLine().split(" ");
				for(int i = 0; i<N ; i++){
					prices[i]= Integer.parseInt(pricecopy[i]);
				}
			int replaceCounts = 0;
			boolean duplicate = false;
			for(int i = 1 ; i<N ; i++){
				if( prices[i-1]>prices[i]){
					replaceCounts++;
					continue;
				}
				if(prices[i-1]==prices[i]){
					replaceCounts++;
					duplicate =  true;
					continue;
				}
				if((i+1)<N && duplicate && prices[i] == prices[i+1]+1){
					 replaceCounts++;					 
				}else{
					duplicate = false;
				}
			}
			System.out.println(replaceCounts);
		}
	}
