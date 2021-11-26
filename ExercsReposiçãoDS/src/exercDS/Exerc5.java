package exercDS;

import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		boolean repetir = true;
		
		while (repetir == true) {
			int pontos = 0;
			int escolha;
			Scanner respUser = new Scanner(System.in);
			System.out.println("---CONHECIMENTOS GERAIS---");
			System.out.println("De quem é a famosa frase “Penso, logo existo?\n"
					+ "1- Platão\n"
					+ "2- Galileu Galilei\n"
					+ "3- Descartes\n"
					+ "4- Sócrates\n"
					+ "5- Francis Bacon");
			escolha = respUser.nextInt();
			switch (escolha) {
			case 3:
				pontos++;
				break;			
			}
			
			System.out.println("De onde é a invenção do chuveiro elétrico?\n"
					+ "1- Brasil\n"
					+ "2- Inglaterra\n"
					+ "3- França\n"
					+ "4- Austrália\n"
					+ "5- Itália");
			escolha = respUser.nextInt();
			switch (escolha) {
			case 1:
				pontos++;
				break;			
			}
			
			System.out.println("Qual o nome do presidente do Brasil que ficou conhecido como Jango?\n"
					+ "1- Jânio Quadros\n"
					+ "2- Jacinto Anjos\n"
					+ "3- Getúlio Vargas\n"
					+ "4- João Figueiredo\n"
					+ "5- João Goulart");
			escolha = respUser.nextInt();
			switch (escolha) {
			case 5:
				pontos++;
				break;			
			}
			
			System.out.println("Qual o grupo em que todas as palavras foram escritas corretamente?\n"
					+ "1- Asterístico, beneficiente, meteorologia, entertido\n"
					+ "2- Asterisco, beneficente, meteorologia, entretido\n"
					+ "3- Asterisco, beneficente, metereologia, entretido\n"
					+ "4- Asterístico, beneficiente, metereologia, entretido\n"
					+ "5- Asterisco, beneficiente, metereologia, entretido");
			escolha = respUser.nextInt();
			switch (escolha) {
			case 2:
				pontos++;
				break;			
			}
			
			System.out.println("Qual o livro mais vendido no mundo a seguir à Bíblia?\n"
					+ "1- O Senhor dos Anéis\n"
					+ "2- Dom Quixote\n"
					+ "3- O Pequeno Príncipe\n"
					+ "4- Ela, a Feiticeira\n"
					+ "5- Um Conto de Duas Cidades");
			escolha = respUser.nextInt();
			switch (escolha) {
			case 2:
				pontos++;
				break;		
			}
			
			
			System.out.println("Você Acertou " + pontos+"/5");
			System.out.println("Quer tentar o Quiz mais uma vez? Se sim responda 'true', se não responda 'false'");
			repetir = respUser.nextBoolean();
		}
		System.out.println("Programa Finalizado!");
	}
}
