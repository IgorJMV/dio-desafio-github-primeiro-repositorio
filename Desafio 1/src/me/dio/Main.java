package me.dio;

import java.util.Scanner;

/**
 * @author Igor Marinho
 */

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, PROD;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		PROD = A * B;
		
		System.out.println("PROD = " + PROD);
		
		sc.close();

	}

}
