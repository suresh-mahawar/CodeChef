/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class TheLeadGame
{
	public static void leadGame() throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f[] = new int[n];
		int s[] = new int[n];
		int lead[] = new int[n];
		int player = 0;
		f[0] = sc.nextInt();
		s[0] = sc.nextInt();
		if(f[0]>s[0]){
			lead[0] = f[0]-s[0];
			player =1;
		}else{
			lead[0] = s[0]-f[0];
			player = 2;
		}
		int max = lead[0];
		for(int i = 1 ; i<n ; i++){
			f[i] = f[i-1] + sc.nextInt();
			s[i] = s[i-1] + sc.nextInt();
			if((f[i]-s[i])>0){
				if((f[i]-s[i])>max){
					lead[i] = f[i]-s[i];
					max = lead[i];
					player = 1;
				}
			}else{
				if((s[i]-f[i])>max){
					lead[i] = s[i]-f[i];
					max = lead[i];
					player = 2;
				}
			}
		}
		System.out.println(player+" "+max);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		leadGame();
	}
}