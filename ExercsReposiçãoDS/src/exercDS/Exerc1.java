package exercDS;

import java.util.Scanner;

public class Exerc1 {
	public static void main(String[] args) {
		Scanner respUser = new Scanner(System.in);
		int num;
		boolean repetir = true;
		
		while (repetir == true) {
			System.out.println("Digite um n�mero para saber se � �mpar ou par: ");
			num = respUser.nextInt();
			
			if(num % 2 == 0) {
				System.out.println("O n�mero " + num + " � PAR!");
			} else {
				System.out.println("O n�mero " + num + " � �MPAR!");
			}
			
			System.out.println("Quer ver outro n�mero? Se sim responda 'true', se n�o responda 'false' ");
			repetir = respUser.nextBoolean();
		}
		System.out.println("Programa Finalizado!");
	}
}
