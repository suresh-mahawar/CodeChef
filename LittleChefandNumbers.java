package codechef;

import java.io.*;

public class LittleChefandNumbers {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t>0){
			int n = Integer.parseInt(br.readLine());
			long in[] = new long[n];
			String[] sin = br.readLine().split(" ");
			for(int i = 0 ;  i<n ; i++){
				in[i] = Long.parseLong(sin[i]);
			}
			lcf(in);
			t--;
		}
	}
	public static void lcf(long[] in){
		System.out.println(sublcf(in,0,in.length-1));
		//System.out.println(sublcf2(in,0,in.length-1));
	}
	public static long sublcf(long[] in, int l, int h){
		if(l<h){
			int m = (l+h)/2;
			long left = sublcf(in,l,m);
			long right = sublcf(in,m+1,h);
			return getCount1(in,l,m,h)+left+right;
		}	
		return 0;
	}
	public static long getCount1(long input[],int start, int mid, int end){
		int l = 0, r = 0;
		for(int i = start ; i<=mid ; i++){
				if(input[i]!=0 && input[i]!=1){
					l++;
				}
		}
		for(int i = mid+1 ; i<=end ; i++){
			if(input[i]!=0 && input[i]!=1){
				r++;
			}
		}
		return r*l;
	}
	public static long getCount(long input[],int start, int mid, int end){
		int n1 = mid-start+1;
		int n2 = end-mid;
		long Left[] = new long[n1];
		long Right[] = new long[n2];
		long count = 0;
		for(int i = 0 ; i<n1 ; i++){
			Left[i] = input[i+start];	
		}
		for(int i = 0 ; i<n2 ; i++){
			Right[i] = input[i+mid+1];
		}
		int i = n1-1, j = n2-1,k = start;
		
		i = 0;
		j = 0;
		while(i<n1 && j<n2){
			if(Left[i]*Right[j]>Left[i]+Right[j]){
				count++;
				input[k++] = Left[i++];
			}else{
				input[k++] = Right[j++];
			}
		}
		while(i<n1){
			input[k++] = Left[i++];
		}
		while(j<n2){
			input[k++] = Right[j++];
		}
		return count;
	}
}
