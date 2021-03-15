package poolista;

import java.util.Scanner;
import java.util.ArrayList;

public class POOlista {
    
    //Atributos
    static Scanner guardar = new Scanner(System.in);
    static ArrayList<Animal> animais = new ArrayList();
            
    public static void main (String args[]){
        int user = 0;
        while(user == 0){
            Animal an01 = new Animal();
            System.out.println("Qual a espécie do animal?:  ");
            an01.especie = guardar.next();
            System.out.println("Qual a raça do animal?: ");
            an01.raca = guardar.next();
            System.out.println("Nome do animal: ");
            an01.nome = guardar.next();
            System.out.println("Qual o peso do animal?: ");
            an01.peso = guardar.nextFloat();
            System.out.println("Qual a cor do animal?: ");
            an01.cor = guardar.next();
            animais.add(an01);
            System.out.println("Quer continuar? 0:sim 1:não ");
            user = guardar.nextInt();
        }
            System.out.println("Espécie\tRaça\tNome\tPeso\tCor");
            for(int i = 0; i < animais.size(); i++){
            System.out.println(animais.get(i).especie + "\t" + animais.get(i).raca + "\t" + animais.get(i).nome + "\t" + animais.get(i).peso + "\t" + animais.get(i).cor);   
        }
    }
}