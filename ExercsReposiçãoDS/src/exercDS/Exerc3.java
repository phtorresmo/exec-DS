package exercDS;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Exerc3 {
	
	public static void main(String[] args) {
		
		Scanner respUser = new Scanner(System.in);
		boolean repetir = true;
		
		while(repetir == true) {
			
			int escolha;
			ArrayList<Integer> arrayNums = new ArrayList<Integer>();
			
			System.out.println("Adicione um número, para que ele seja colocado em uma lista em ordem crescente ou decrescente:\n");
			arrayNums.add(respUser.nextInt());
			
			while(repetir == true) {		
				System.out.println("Adicionar mais números? Se sim responda 'true', se não responda 'false'");
				repetir = respUser.nextBoolean();
				
				if (repetir == true) {
					System.out.println("Adicione mais um número");
					arrayNums.add(respUser.nextInt());
				}
			}
			
			System.out.println("Você quer que os números sejam colocados em ordem:\n[1]crescente\n[2]decrescente");
			escolha = respUser.nextInt();
			
			switch (escolha) {
			case 1:
				Collections.sort(arrayNums);
				System.out.println("Os números escolhidos em ordem crescente: " + arrayNums);
				break;
			case 2:
				Collections.sort(arrayNums, Collections.reverseOrder());
				System.out.println("Os números escolhidos em ordem decrescente:" + arrayNums);
				break;
			default:
				System.out.println("Escolha uma opção válida! ");
			}
			
			
			System.out.println("Repetir o programa? Se sim responda 'true', se não responda 'false'");
			repetir = respUser.nextBoolean();

		}
		System.out.println("Programa Finalizado!");
	}

}
