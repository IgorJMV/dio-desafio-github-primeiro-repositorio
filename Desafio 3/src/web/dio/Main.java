package web.dio;

import java.util.Scanner;

/**
 * @author Igor Marinho
 */

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		int C = sc.nextInt();
		
		if (((L + C) % 2) == 0)
			System.out.println("1");
		else
			System.out.println("0");
		
		sc.close();

	}

}
