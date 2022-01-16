package me.dio;

import java.util.Scanner;

/**
 * @author Igor Marinho
 */

public class DIO {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	for (int i = 0; i < 10000; i++) {
    		if (i % N == 2) System.out.println(i);
    	}
    	
	}

}
