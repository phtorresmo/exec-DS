package exercDS;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		Scanner userResp = new Scanner(System.in);
		
		boolean repetir = true;
		
		while (repetir == true) {
			int num;
			int fat = 1;
			
			System.out.println("Digite um n�mero para saber seu fatorial: ");
			num = userResp.nextInt();	
			
			for(int c = num; c > 0; c--){
				fat *= c;
			}

			System.out.println(fat);
			
			System.out.println("Quer saber o fatorial de outro n�mero? Se sim responda 'true', se n�o responda 'false'");
			repetir = userResp.nextBoolean();
		}
		System.out.println("Programa Finalizado!");		
	}
					
}
