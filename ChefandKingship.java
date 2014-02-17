package geeksforgeeks;
import java.io.*;

public class ChefandKingship {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Byte t = Byte.parseByte(br.readLine());
		while(t>0){
			int N = Integer.parseInt(br.readLine());
			int p[] = new int[N];
			String sp[] = new String[N];
			sp = br.readLine().split(" ");
			for(int i = 0 ; i<N ; i++){
				p[i] = Integer.parseInt(sp[i]);
			}
       		int min = 10000000;
			for(int i = 0 ; i<N ; i++){
				if(min>p[i]){
					min = p[i];
				}
			}
			long cost = 0;
			for(int i = 0 ; i<N ; i++){
					cost += p[i]*min;
			}
			System.out.println(cost-min*min);
			t--;
		}
	}

}
