package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SherlockCipher {
			public static void main(String[] as) throws IOException{
			BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
			short t = Short.parseShort(sc.readLine());
			while(t>0){
			int N = Integer.parseInt(sc.readLine());
			String S = sc.readLine();
			int arr[] = new int[N];
			String ar[] = new String[N];
			ar = sc.readLine().split(" ");
			for(int i = 0; i<N ; i++){
				arr[i] = Integer.parseInt(ar[i]);
			}
			char ss[] = S.toCharArray();
			for(int i = 0; i<N; i++){
				char temp = ss[i];
				ss[i] = ss[arr[i]-1];
				ss[arr[i]-1] = temp;
			}
			for(int i = 0; i<N; i++){
			System.out.print(ss[i]);
			}
			t--;
			}
		}
}
