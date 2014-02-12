/* package whatever; // don't place package name! */
package codechef;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class TimeStoppedReaction
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		    long n =  sc.nextLong();
			long k = sc.nextLong();
			long m = sc.nextLong();
			System.out.println(getTimeStoppedReaction(n,k,m));
			t--;
		}
	}
	public static int getTimeStoppedReaction(long n, long k, long m){
		int time = 0;
         long atoms = n;
		if(atoms>m) return 0;
		while(atoms<=m)	{
			time++;
			atoms *= k;
			
		}
		return time-1;
	}
}