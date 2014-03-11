package codechef;

import java.util.*;

public class Walk {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();	
		while(t>0){
			int s = sc.nextInt();

			int max = Integer.MIN_VALUE;
			int j = 0;
			//int count = 0;
			for(int i = 0 ; i<s ; i++){
				int sin = sc.nextInt();
				if(max<sin){
					max = sin;
					//count++;;
					j = i;		
				}
			}
			System.out.println(max+j);
			t--;
		}
	}
}
