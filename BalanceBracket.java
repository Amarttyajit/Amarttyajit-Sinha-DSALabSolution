package com.balancebracket.module;

import java.util.Stack;
public class BalanceBracket {
	
	Stack<Character> stack= new Stack<Character>();
	 int flag=0;
	
	public void balancingBracket( String b)
	{
		int size= b.length();
		for(int i=0; i< size;i++)
		{ 
			char c = b.charAt(i);
			if( c!= '{' && c!= '[' && c!='(' && c!= '}' && c!= ']' && c!=')') 
			{
				System.out.println("The entered Strings do not contain Balanced Brackets");
				System.exit(i);
			}
			
		}
		if(size%2!=0)
		{
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
		else
		{ 
			for(int i=0; i< size/2;i++)
			{ 
				char j= b.charAt(i);
				stack.push(j);
			}
		
		for(int i=size/2; i< size;i++)
		{ 
			char j=stack.pop();
			if((b.charAt(i))==j)
			{
				flag++;
			}
		}
		
		
		if(flag==0)
		{
			System.out.println("The entered String has Balanced Brackets");
		}
		else
		{
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
		}
		
		
	}
}
