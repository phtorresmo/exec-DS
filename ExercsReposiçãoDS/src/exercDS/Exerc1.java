package exercDS;

import java.util.Scanner;

public class Exerc1 {
	public static void main(String[] args) {
		Scanner respUser = new Scanner(System.in);
		int num;
		boolean repetir = true;
		
		while (repetir == true) {
			System.out.println("Digite um número para saber se é ímpar ou par: ");
			num = respUser.nextInt();
			
			if(num % 2 == 0) {
				System.out.println("O número " + num + " é PAR!");
			} else {
				System.out.println("O número " + num + " é ÍMPAR!");
			}
			
			System.out.println("Quer ver outro número? Se sim responda 'true', se não responda 'false' ");
			repetir = respUser.nextBoolean();
		}
		System.out.println("Programa Finalizado!");
	}
}
