package exercDS;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		Scanner userResp = new Scanner(System.in);
		int escolha;
		boolean repetir = true;
		
		while (repetir == true) {
			System.out.println("Escolha o tipo do cart�o:\n[1] Silver\n[2] Gold\n[3]Diamond");
			escolha = userResp.nextInt();
			switch (escolha) {
			case 1:
				System.out.println("Seu cart�o � Silver");
				System.out.println("Foco em quem possui uma renda m�nima maior que R$2 mil. Tamb�m permite compras internacionais, e sua anuidade gira em torno de R$300.\n");
				break;
			case 2:
				System.out.println("Seu cart�o � Gold");
				System.out.println("A renda m�nima para obter esse cart�o � de R$5 mil. Sua anuidade gira em torno de R$450. Se tratando de valores, podem existir varia��es entre as bandeiras.\n");
				break;
			case 3:
				System.out.println("Seu cart�o � Diamond");
				System.out.println("Direcionado para pessoas com um poder aquisitivo maior, a renda m�nima para obter esse cart�o � de R$15 mil.\n");
				break;
			default:
				System.out.println("Escolha uma op��o v�lida! ");
			}
			
			
			System.out.println("Quer ver sobre outro cart�o? Se sim responda 'true', se n�o responda 'false'");
			repetir = userResp.nextBoolean();
		}
		System.out.println("Programa Finalizado!");
		
	}

}
