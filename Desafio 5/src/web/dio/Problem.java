package web.dio;

import java.util.Scanner;

/**
 * @author Igor Marinho
 */

public class Problem {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
    	int T = leitor.nextInt();
    	int B, A1, D1, L1, A2, D2, L2, V1, V2;
    	for (int i = 0; i < T; i++) {
    		B = leitor.nextInt(); //Valor do bônus
    		A1 = leitor.nextInt(); //Bruno: ataque do Digitron
    		D1 = leitor.nextInt(); //Bruno: valor de defesa
    		L1 = leitor.nextInt(); //Bruno: level do treinador
    		A2 = leitor.nextInt(); //Guarte: ataque do Digitron
    		D2 = leitor.nextInt(); //Guarte: valor de defesa
    		L2 = leitor.nextInt(); //Guarte: level do treinador

    		V1 = (A1 + D1)/2 + (L1 % 2 == 0 ? B : 0); //Valor do golpe de Bruno
    		V2 = (A2 + D2)/2 + (L2 % 2 == 0 ? B : 0); //Valor do golpe de Guarte
    		
            if (V1 > V2) System.out.println("Bruno");
    		else if (V2 > V1) System.out.println("Guarte");
    		else System.out.println("Empate");
    	}
    	leitor.close();

	}

}
