package codechef;
import java.io.*;

public class MakeHimHappy {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nk[] = new String[2];
		nk = br.readLine().split(" ");
		int N = Integer.parseInt(nk[0]);
		int K = Integer.parseInt(nk[1]);
		int input[] = new int[N];
		int index[] = new int[N];
		String in[] = new String[N];
		in = br.readLine().split(" ");
		for(int i = 0 ; i<N ;i++){
			input[i] = Integer.parseInt(in[i]);
			index[i] = i;
		}
		
		/*
		int i = 0;
		int j = N-1;
		int min = -1;
		boolean flag = false;
		while(i<j){
			int k = 0;
			int l = N-1;
			int lmin = 0;
			int rmin = 0;
			if((input[i]+input[j])==K){
				lmin = (i-0)<(N-1-j)? (N-1-j)+1 : (i-0)+1;
				break;
			}
			while(k<i){
				if((input[k]+input[j])==K){
					lmin = (k-0)<(N-1-j)? (N-1-j)+1 : (k-0)+1;
					break;
				}
				k++;
			}
			while(l>j){
				if((input[l]+input[i])==K){
					rmin = (i-0)<(N-1-l)? (N-1-l)+1 : (i-0)+1;
					break;
				}
				l--;
			}
			if(lmin>rmin){
				min = lmin;
				break;
			}else if(lmin<rmin){
				min = rmin;
				break;
			}
			if(flag==false){
				i++;
				flag = true;
			}else{
			j--;
			flag = false;
			}
		}*/
		
		sort(input,index);
		int i = 0;
		int j = N-1;
		int max = 0;
		while(i<j){
			if((input[i]+input[j])==K){
				if(max<Math.abs(index[i]-index[j])){
					max = Math.abs(index[i]-index[j]);
				}
				i++;
				j--;
			}
			else if((input[i]+input[j])>K){
				j--;
			}
			else{
				i++;
			}
		}
		
			System.out.println(N-max);
	}
	public static void sort(int input[],int index[]){
		for(int i = 0 ; i<input.length-1 ;  i++){
			for(int j = i+1 ; j<input.length ; j++){
				if(input[i]>input[j]){
					input[i] = input[i] + input[j];
					input[j] = input[i] - input[j];
					input[i] = input[i] - input[j];
					index[i] = index[i] + index[j];
					index[j] = index[i] - index[j];
					index[i] = index[i] - index[j];
				}
			}
		}
	}
}
