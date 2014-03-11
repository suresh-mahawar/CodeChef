/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class AmbigiousPermutation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		do{
			int input[] = new int[n+1];
			for(int i =1 ; i<=n ; i++)
			input[i] = sc.nextInt();
			boolean isAmbigious = true;
			for(int i = 1; i<=n ; i++){
				if(input[input[i]]!=i){
					isAmbigious = false;
					break;
				}
			}
			if(isAmbigious)
			System.out.println("ambiguous");
			else System.out.println("not ambiguous");
			n = sc.nextInt();
		}while(n!=0);
	}
}