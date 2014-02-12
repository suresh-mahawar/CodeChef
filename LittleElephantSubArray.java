package codechef;
import java.io.*;

public class LittleElephantSubArray {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		short N = Short.parseShort(br.readLine());
		int input[] =  new int[N];
		String in[] = new String[N];
		in = br.readLine().split(" ");
		int[][] limitSub = new int[1300][2];
		for(int i =0 ; i<N ;i++){
			input[i] = Integer.parseInt(in[i]);
		}
		short Q = Short.parseShort(br.readLine());
		while(Q>0){
			int K = Integer.parseInt(br.readLine());
			int count = 0;
			int countholder = 0;
			int p = 0;
			
			for(int i = 0 ; i<N ; i++){
				boolean flag = false;
				if(input[i] == K){
						limitSub[p][0] = i;
						limitSub[p][1] = i;
						p++;
						countholder = ++count;
						
					int k = i-1;
					int j = i+1;
					while(k>=0 && input[k]>=input[i]){
						for( int l = 0 ; l<count ; l++){
							if(limitSub[l][0]==k && limitSub[l][1]==i){
								flag =true;
								break;
							}
						}
						if(!flag){
							limitSub[p][0] = k;
							limitSub[p][1] = i;
							p++;
							countholder++;
							
						}
						k--;
					}
					count = countholder;
					flag = false;
					while(j<N && input[j]>=input[i]){
						for( int l = 0 ; l<count ; l++){
							if(limitSub[l][0]==j && limitSub[l][1]==i){
								flag = true;
								break;
							}
						}
						if(!flag){
							limitSub[p][0] = i;
							limitSub[p][1] = j;
							p++;
							countholder++;
							flag = false;
						}
						j++;
					}
					count = countholder;
					flag = false;
					j = i+1;
					k = i-1;
					while(k>=0 && input[k]>=input[i]){
						while(j<N && input[j]>=input[i]){
							for( int l = 0 ; l<count ; l++){
								if(limitSub[l][0]==k && limitSub[l][1]==j){
									flag = true;
									break;
								}
							}
							if(!flag){
								limitSub[p][0] = k;
								limitSub[p][1] = j;
								p++;
								countholder++;
								flag = false;
							}
							j++;
						}
						k--;
					}
					count = countholder;
				}
			}
			System.out.println(count);
			Q--;
		}
	}
}
