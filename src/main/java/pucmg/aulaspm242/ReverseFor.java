/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.aulaspm242;

import java.util.Scanner;

/**
 *
 * @author danil
 */
public class ReverseFor {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Entre com uma frase: ");
        String frase = s.nextLine();

        char[] vetEntrada = frase.toCharArray();
        char[] vetSaida = new char[vetEntrada.length];

        int totalEspacos = frase.length() - frase.replaceAll(" ", "").length();

        int[] vetSpace = new int[totalEspacos + 1];
        vetSpace[0] = 0;
        int contVet = 1;

        // Loop for reverso
        for (int i = 0; i < vetEntrada.length; i++) {
            if (vetEntrada[i] == ' ') {
                vetSpace[contVet] = i;
                contVet++;
            }
        }

        int indexAtual = 0;
        for (int i = vetSpace.length - 1; i >= 0; i--) {
            int indexPalavra = vetSpace[i];
            
            for (int j = indexAtual; j < vetSaida.length; j++) {
                if (indexPalavra >= vetSaida.length-1) {
                    //Tem de atualizar o indice que vai adicionar 
                    // a prox palavra..
                    indexAtual = 1;
                    break;
                }
                vetSaida[j] = vetEntrada[indexPalavra + 1];
                indexPalavra++;
            }
            //Chegou ao fim da palavra? Add o espço em branco...
            //vetSaida[XX] = ' ';
        }

        System.out.println("");
    }

}
