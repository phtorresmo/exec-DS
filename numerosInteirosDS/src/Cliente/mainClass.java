package Cliente;
import java.util.Scanner;
import Modelo.NumeroInt;

public class mainClass {
    //criando vars
    public static void main(String args[]) {
    String porExtenso = "";
    int respostaUser = 1;
    Scanner scan = new Scanner(System.in);
    String numero;

    
    //dividindo em "grupos"
    NumeroInt[] umANove = { 
        new NumeroInt("zero"), 
        new NumeroInt("one"), 
        new NumeroInt("two"),
        new NumeroInt("three"),
        new NumeroInt("four"), 
        new NumeroInt("five"), 
        new NumeroInt("six"), 
        new NumeroInt("seven"), 
        new NumeroInt("eight"), 
        new NumeroInt("nine")};
    NumeroInt[] Dezenas = {  
        new NumeroInt("ten"), 
        new NumeroInt("eleven"), 
        new NumeroInt("twelve"), 
        new NumeroInt("thirteen"), 
        new NumeroInt("fourteen"), 
        new NumeroInt("fifteen"), 
        new NumeroInt("sixteen"), 
        new NumeroInt("seventeen"), 
        new NumeroInt ("eighteen"), 
        new NumeroInt ("nineteen")};
    NumeroInt[] dezenasCompostas = { 
        new NumeroInt("twenty"), 
        new NumeroInt("thirty"), 
        new NumeroInt("forty"), 
        new NumeroInt("fifty")};
 
    while (respostaUser == 1) {

        System.out.println("Digite um número entre 0 e 100 para ver escrito por extenso em inglês: ");
        numero = scan.next(); // lendo número escolhido pelo usuário
        
        //ERRO para valores inválidos
        if (Integer.valueOf(numero) < 0 || Integer.valueOf(numero) > 100) {
            System.out.println("|ERRO| VALOR INVÁLIDO");
        //para valores válidos
        } else {
            char[] algarismos = numero.toCharArray(); // converterdo numeroString em um array de caracteres

            int indice = 0;

            if (algarismos.length == 3) {
            porExtenso = "one-hundred";
            } else if (algarismos.length == 1) {
            indice = Character.getNumericValue(algarismos[0]);
            porExtenso = umANove[indice].getValorPorExtenso();
            } else if (algarismos.length == 2) {
                if (algarismos[1] == '0') {  
                indice = Character.getNumericValue(algarismos[0]) - 1;
                porExtenso = dezenasCompostas[indice].getValorPorExtenso();
                } else if (algarismos[0] == '1') {
                indice = Character.getNumericValue(algarismos[1]);
                porExtenso = Dezenas[indice].getValorPorExtenso();
                } else if (algarismos[0] == '2') {
                indice = Character.getNumericValue(algarismos[1]);
                porExtenso = dezenasCompostas[0].getValorPorExtenso() + "-" + umANove[indice].getValorPorExtenso();
                } else if (algarismos[0] == '3') {
                indice = Character.getNumericValue(algarismos[1]);
                porExtenso = dezenasCompostas[1].getValorPorExtenso() + "-" + umANove[indice].getValorPorExtenso();
                } else if (algarismos[0] == '4') {
                indice = Character.getNumericValue(algarismos[1]);
                porExtenso = dezenasCompostas[2].getValorPorExtenso() + "-" + umANove[indice].getValorPorExtenso();
                } else if (algarismos[0] == '5') {
                indice = Character.getNumericValue(algarismos[1]);
                porExtenso = dezenasCompostas[3].getValorPorExtenso() + "-" + umANove[indice].getValorPorExtenso();
                } else if (algarismos[0] == '6') {
                indice = Character.getNumericValue(algarismos[1]);
                porExtenso = umANove[6].getValorPorExtenso() + "ty-" + umANove[indice].getValorPorExtenso();
                } else if (algarismos[0] == '7') {
                indice = Character.getNumericValue(algarismos[1]);
                porExtenso = umANove[7].getValorPorExtenso() + "ty-" + umANove[indice].getValorPorExtenso();
                } else if (algarismos[0] == '8') {
                indice = Character.getNumericValue(algarismos[1]);
                porExtenso = umANove[8].getValorPorExtenso() + "y-" + umANove[indice].getValorPorExtenso();
                } else if (algarismos[0] == '9') {
                indice = Character.getNumericValue(algarismos[1]);
                porExtenso = umANove[9].getValorPorExtenso() + "ty-" + umANove[indice].getValorPorExtenso();
                }
            }
            System.out.println("Número: " + porExtenso);
            
        }

        System.out.println("DIGITE: 1 - Continuar; qualquer número - Sair");
        respostaUser = scan.nextInt();
        
    } 
    
    }
}
