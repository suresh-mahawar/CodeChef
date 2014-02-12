package codechef;
import java.io.*;
import java.util.*;

public class CoinCalculator {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		coinCal(n);
	}
	public static void coinCal(int n){
		int a = 1;
		int b = 1;
		int c = 1;
		int d = 1;
		int diff = n;
		int n1 = 0;
		while(diff>=a*5){
			++a;
			n1 += 5;
		}
		diff = n-n1;
		if(diff!=0){
			System.out.println(a-1);
		}
		else{
			System.out.println(a-1);
			System.out.println("0");
			System.out.println("0");
			System.out.println("0");
			return;
		}
		while(diff>=b*3){
			++b;
			n1 += 3;
		}
		diff = n - n1;
		if(diff!=0){
			System.out.println(b-1);
		}else{
			System.out.println(b-1);
			System.out.println("0");
			System.out.println("0");
			return;
		}
		while(diff>=c*2){
			++c;
			n1 += 2;
		}
		diff = n - n1;
		if(diff!=0){
			System.out.println(c-1);
		}
		else{
			System.out.println(c-1);
			System.out.println("0");
			return;
		}
		while(diff>=d*1){
			++d;
			n1++;
		}
		diff = n-n1;
		System.out.println(d-1);
	}
}
