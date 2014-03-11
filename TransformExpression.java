package codechef;

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
public class TransformExpression {
	public static void transformTheExpressioin() throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		String infixs = sc.next();
		String postfix = "";
		char infix[] = infixs.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		stack.push('(');
		for(int i = 0 ; i<infix.length ; i++){
			if(precedence(infix[i])<=stackPrecedence(stack.peek())){
				while(!stack.empty() && precedence(infix[i])<stackPrecedence(stack.peek())){
					if(stack.peek()!='(' && stack.peek()!=')' )
						postfix = postfix + stack.pop();
					else stack.pop();
				}
				if(!stack.empty() && precedence(infix[i])==stackPrecedence(stack.peek())){
					stack.pop();
				}
				stack.push(infix[i]);
			}else{
				stack.push(infix[i]);
			}
		}
		System.out.println(postfix);
		t--;
		}
	}
	public static int precedence(char c){
		int va;
		switch(c){
			case '+' : va = 1;break;
			case '-' : va = 1;break;
			case '*' : va = 3;break;
			case '/' : va = 3;break;
			case '^' : va = 6;break;
			case '(' : va = 9;break;
			case ')' : va = 0;break;
			default : va = 7;
		}
		return va;
	}
	public static int stackPrecedence(char c){
		int va;
		switch(c){
			case '+' : va = 2;break;
			case '-' : va = 2;break;
			case '*' : va = 4;break;
			case '/' : va = 4;break;
			case '^' : va = 5;break;
			case '(' : va = 0;break;
			default : va = 8;
		}
		return va;
	}	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		transformTheExpressioin();
	}
}