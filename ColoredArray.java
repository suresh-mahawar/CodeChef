package codechef;
import java.util.*;
public class ColoredArray {
	/**
	 * @param args
	 */
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		short t = sc.nextShort();
		while(t>0){
		short N = sc.nextShort();
		short M =sc.nextShort();
		short K = sc.nextShort();
		short input[] = new short[1001];		
		short B[][] = new short[1001][1001];
		short C[][] = new short[1001][1001];
		short position[] = new short[1001];
		short max[] = new short[1001];
		for(int i = 0 ; i<N ; i++){
			input[i] = sc.nextShort();
		}
		for(int i = 0; i<N ; i++){
			for(int j = 0; j<M ; j++){
				B[i][j] = sc.nextShort();
			}
		}
		for(int i = 0; i<N ; i++){
			for(int j = 0; j<M ; j++){
				C[i][j] = sc.nextShort();
			}
		}
		short score = 0;
		for(int i = 0; i<N ; i++){
			score += B[i][input[i]-1];
			position[i] = (short)i;
		}	
		
		for(int i = 0 ; i<N ; i++){
			short m = Short.MIN_VALUE;
			for(int j = 0 ; j<M ; j++){
				short x = (short)(B[i][j]-C[i][j]);
				if(x>m) m = x;
			}
			max[i] = m;
		}
		sortWithPosition(max,position);
		for(int i = 0; i<K ; i++){
			if(max[i]>B[position[i]][input[position[i]]-1]){
				score += max[i]-B[position[i]][input[position[i]]-1];
			}
		}
		System.out.println(score);
		t--;
		}
	}
	public static void sortWithPosition(short input[],short position[]){
		for(int i = 1 ; i<input.length ;  i++){
			short currentElement = input[i]; 
			short backPointer = (short)(i-1);
			while(backPointer >= 0 && input[backPointer] < currentElement){
				input[backPointer+1]= input[backPointer];
				position[backPointer+1] = position[backPointer];
				backPointer--;
			}
			input[backPointer+1] = currentElement;
			position[backPointer+1] = (short)i;
		}
	}	
}
