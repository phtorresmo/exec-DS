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
			System.out.println("De quem � a famosa frase �Penso, logo existo?\n"
					+ "1- Plat�o\n"
					+ "2- Galileu Galilei\n"
					+ "3- Descartes\n"
					+ "4- S�crates\n"
					+ "5- Francis Bacon");
			escolha = respUser.nextInt();
			switch (escolha) {
			case 3:
				pontos++;
				break;			
			}
			
			System.out.println("De onde � a inven��o do chuveiro el�trico?\n"
					+ "1- Brasil\n"
					+ "2- Inglaterra\n"
					+ "3- Fran�a\n"
					+ "4- Austr�lia\n"
					+ "5- It�lia");
			escolha = respUser.nextInt();
			switch (escolha) {
			case 1:
				pontos++;
				break;			
			}
			
			System.out.println("Qual o nome do presidente do Brasil que ficou conhecido como Jango?\n"
					+ "1- J�nio Quadros\n"
					+ "2- Jacinto Anjos\n"
					+ "3- Get�lio Vargas\n"
					+ "4- Jo�o Figueiredo\n"
					+ "5- Jo�o Goulart");
			escolha = respUser.nextInt();
			switch (escolha) {
			case 5:
				pontos++;
				break;			
			}
			
			System.out.println("Qual o grupo em que todas as palavras foram escritas corretamente?\n"
					+ "1- Aster�stico, beneficiente, meteorologia, entertido\n"
					+ "2- Asterisco, beneficente, meteorologia, entretido\n"
					+ "3- Asterisco, beneficente, metereologia, entretido\n"
					+ "4- Aster�stico, beneficiente, metereologia, entretido\n"
					+ "5- Asterisco, beneficiente, metereologia, entretido");
			escolha = respUser.nextInt();
			switch (escolha) {
			case 2:
				pontos++;
				break;			
			}
			
			System.out.println("Qual o livro mais vendido no mundo a seguir � B�blia?\n"
					+ "1- O Senhor dos An�is\n"
					+ "2- Dom Quixote\n"
					+ "3- O Pequeno Pr�ncipe\n"
					+ "4- Ela, a Feiticeira\n"
					+ "5- Um Conto de Duas Cidades");
			escolha = respUser.nextInt();
			switch (escolha) {
			case 2:
				pontos++;
				break;		
			}
			
			
			System.out.println("Voc� Acertou " + pontos+"/5");
			System.out.println("Quer tentar o Quiz mais uma vez? Se sim responda 'true', se n�o responda 'false'");
			repetir = respUser.nextBoolean();
		}
		System.out.println("Programa Finalizado!");
	}
}
