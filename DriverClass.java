package com.balancebracket.main;

import java.util.Scanner;
import com.balancebracket.module.BalanceBracket;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the brackets sequence: ");
		String bracket= sc.next();
		
		BalanceBracket bb= new BalanceBracket();
		bb.balancingBracket(bracket);
		
		
	}

}
