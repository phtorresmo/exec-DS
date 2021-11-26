package exercDS;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		Scanner userResp = new Scanner(System.in);
		int escolha;
		boolean repetir = true;
		
		while (repetir == true) {
			System.out.println("Escolha o tipo do cartão:\n[1] Silver\n[2] Gold\n[3]Diamond");
			escolha = userResp.nextInt();
			switch (escolha) {
			case 1:
				System.out.println("Seu cartão é Silver");
				System.out.println("Foco em quem possui uma renda mínima maior que R$2 mil. Também permite compras internacionais, e sua anuidade gira em torno de R$300.\n");
				break;
			case 2:
				System.out.println("Seu cartão é Gold");
				System.out.println("A renda mínima para obter esse cartão é de R$5 mil. Sua anuidade gira em torno de R$450. Se tratando de valores, podem existir variações entre as bandeiras.\n");
				break;
			case 3:
				System.out.println("Seu cartão é Diamond");
				System.out.println("Direcionado para pessoas com um poder aquisitivo maior, a renda mínima para obter esse cartão é de R$15 mil.\n");
				break;
			default:
				System.out.println("Escolha uma opção válida! ");
			}
			
			
			System.out.println("Quer ver sobre outro cartão? Se sim responda 'true', se não responda 'false'");
			repetir = userResp.nextBoolean();
		}
		System.out.println("Programa Finalizado!");
		
	}

}
