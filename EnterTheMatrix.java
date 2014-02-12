package codechef;
import java.io.*;

public class EnterTheMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		short t = Short.parseShort(br.readLine());		
		while(t>0){
			String cy = br.readLine();
			int min = Integer.MAX_VALUE;
			int currentmin = 0;
			int count = 0;
			char cypher[] = cy.toCharArray();
			for(int k = 0 ; k<cypher.length-2 ; k++){
				count=0;
				currentmin = 0;
				int c1 = 0,c2 = 0,c3 =0;
				char p = ' ';
			for(int i = k ; count!=3 && i<cypher.length ; i++){
				switch(cypher[i]){
				case 'R' :{
					currentmin++;
					if(count==1 && p == 'R'){
						k = i-1;
					}
					c1 =1;
					p = 'R';
					break;							
				}
				case 'G' :{
					currentmin++;
					if(count==1  && p == 'G'){
						k = i-1;
					}
					c2 = 1;
					p = 'G';
					break;
				}
				case 'B' :{
					currentmin++;
					if(count==1  && p == 'B'){
						k = i-1;
					}
					c3 = 1;
					p = 'B';
					break;
				}
				default : {};
				}
				count = c1 + c2 +c3;
				if(count == 3){
					if(min>currentmin){
						min = currentmin;
					}
					c1 = c2 = c3 = 0;
				}
			}
			}
			System.out.println(min);			
			t--;
		}
	}

}
