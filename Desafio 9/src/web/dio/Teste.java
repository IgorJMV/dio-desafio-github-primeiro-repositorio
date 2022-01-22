package web.dio;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		Integer senha;
		for(;;) {
			senha = leitor.nextInt();
			if(senha.equals(2002)) {
				System.out.println("Acesso Permitido");
				break;
			} else {
				System.out.println("Senha Invalida");
			}
		}
		
		leitor.close();
	}

}
