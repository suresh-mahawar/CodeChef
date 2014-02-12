package codechef;
import java.io.*;

public class CrossTheMaze {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t>0){
		String NM[] = new String[2];
		NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		short maze[][] = new short[N][M];
		short mincount[][] = new short[N][M];
		boolean validity[][] = new boolean[N][M];
		char m[] = new char[M];
		for(int i = 0 ; i<N ; i++){
			m = br.readLine().toCharArray();
			for(int j = 0; j<M ; j++){
				maze[i][j] = (short)(m[j]-'0');
			}
		}		
		validity[0][0] =true;
		mincount[0][0]++;
		for(int i = 1 ; i<N ; i++){
			if((i-1)>=0 && maze[i-1][0]!=maze[i][0]){					
				validity[i][0] = true;
			}else{
				break;
			}
		}
		for(int i = 1 ; i<N ; i++){
			if(validity[i][0]){					
				mincount[i][0]+=mincount[i-1][0];
			}else{
				break;
			}
		}
		for(int i = 1 ; i<M ; i++){
			if((i-1)>=0 && maze[0][i-1]!=maze[0][i]){					
				validity[0][i] = true;
			}else{
				break;
			}
		}
		for(int i = 1 ; i<M ; i++){
			if(validity[0][i]){					
				mincount[0][i]+=mincount[0][i-1];
			}else{
				break;
			}
		}
		for(int j =1 ; j<M ; j++){
			for(int i = 1 ; i<N ; i++){
				if(maze[i][j-1]!=maze[i][j] || maze[i-1][j]!=maze[i][j]){					
					validity[i][j] = true;
				}else{
					break;
				}
			}
			for(int i = 1 ; i<N ; i++){
				if(validity[i][j-1] && validity[i-1][j]){					
					mincount[i][j] = min(mincount[i-1][j],mincount[i][j-1]);
					mincount[i][j]++;
				}else if(validity[i-1][j]){
					if(maze[i][j-1]!=maze[i][j]){
					mincount[i][j] = mincount[i-1][j];
					mincount[i][j]++;
					}
				}else if(validity[i][j-1]){
					if(maze[i-1][j]!=maze[i][j]){
					mincount[i][j] = mincount[i][j-1];
					mincount[i][j]++;
					}
				}else{
					mincount[i][j] = 0;
				}
			}
		}
		if(mincount[N-1][M-1]>1){
			System.out.println(mincount[N-1][M-1]);
		}else{
			System.out.println("-1");
		}
		t--;
	}
	}
	public static short min(short a, short b){
	return a>b ? a : b;
	}
}
