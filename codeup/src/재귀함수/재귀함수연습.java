package ����Լ�;

import java.util.Scanner;

public class ����Լ����� {

	public static int factorial(int number) {
		int sum =1;
		for(int i=2; i<=number; i++) {
			sum *= i;
		}
		return sum;
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		System.out.println("���丮����?" + factorial(n));
		
		scan.close();
	}

}
