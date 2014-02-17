package codechef;

import java.io.*;
import java.util.*;
public class RihannaandFibonacci {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		int a = sc.nextInt();
		int b = sc.nextInt();
		int r = sc.nextInt();
		System.out.println(fastFibo(a,b,r-2));
		t--;
		}
	}
	public static int Fibo(int a,int b,int r){
		if(r==-1){
			return a;
		}
		if(r==0){
			return b;
		}
		while(r!=1){
			int a1 = a;
			a = b;
			b = (b+a1);
			--r;
		}
		return (b+a)%1000000007;
	}
	public static int fastFibo(int a, int b, int r){
		int F[][] = {{a+b,b},{b,a}};
		if(r==-1)return F[1][1];
		else if(r==0){
			return F[0][1];
		}else{
		powerMatrix(F,a,b,r);
		return F[0][0]%1000000007;
	   }
	}
	public static void powerMatrix(int F[][],int a,int b,int r){
		if(r==0 || r==1)
			return;
		int M[][] = {{a+b,b},{b,a}};
		powerMatrix(F,a,b,r/2);
		multiply(F,F);
		if(r%2!=0){
			multiply(F,M);
		}
	}
	public static void multiply(int F[][],int M[][]){
		int a = F[0][0]*M[0][0] + F[0][1]*M[1][0];
		int b = F[0][0]*M[0][1] + F[0][1]*M[1][1];
		int c = F[1][0]*M[0][0] + F[1][1]*M[1][0];
		int d = F[1][0]*M[0][1] + F[1][1]*M[1][1];
		F[0][0] = a;
		F[0][1] = b;
		F[1][0] = c;
		F[1][1] = d;
	}
}
