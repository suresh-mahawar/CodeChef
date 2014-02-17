package geeksforgeeks;
import java.util.*;
public class ChefandRemissness {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		int g1 = sc.nextInt();
		int g2 = sc.nextInt();
		System.out.print(g2+((g1-g2)&~(g1-g2)>>(Integer.SIZE-1)));
		System.out.println(" "+(g1+g2));
		t--;
		}
	}

}
