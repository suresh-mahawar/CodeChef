package codechef;
import java.io.*;
public class LongestCommenPattern {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		short t = Short.parseShort(br.readLine());
		while(t>0){
			String s1 = br.readLine();
			String s2 = br.readLine();
			int a[] = new int[26];
			for(int i = 0 ; i<26 ; i++){
				a[i] = 0;
			}
			int A[] = new int[26];
			for(int i = 0 ; i<26 ; i++){
				A[i] = 0;
			}
			int d[] = new int[10];
			for(int i = 0 ; i<10 ; i++){
				d[i] = 0;
			}
			
			for(int i = 0 ; i<s1.length() ; i++){
				if(s1.charAt(i)>='0' && s1.charAt(i)<='9'){
					d[s1.charAt(i)-'0']++;
				}
				else if(s1.charAt(i)>='a' && s1.charAt(i)<='z'){
					a[s1.charAt(i)-'a']++;
				}
				else if(s1.charAt(i)>='A' && s1.charAt(i)<='Z'){
					A[s1.charAt(i)-'A']++;
				}
			}
			int count = 0;
			for(int i = 0 ; i<s2.length() ; i++){
				if(s2.charAt(i)>='0' && s2.charAt(i)<='9' && d[s2.charAt(i)-'0'] > 0){
					d[s2.charAt(i)-'0']--;
					count++;
				}
				else if(s2.charAt(i)>='a' && s2.charAt(i)<='z' && a[s2.charAt(i)-'a'] > 0){
					a[s2.charAt(i)-'a']--;
					count++;
				}
				else if(s2.charAt(i)>='A' && s2.charAt(i)<='Z' && A[s2.charAt(i)-'A'] > 0){
					A[s2.charAt(i)-'A']--;
					count++;
				}
			}
			System.out.println(count);
			t--;
		}
	}
}
