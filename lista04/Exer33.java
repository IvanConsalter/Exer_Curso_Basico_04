/*
 * CRIAR UM VETOR 'A' COM 10 ELEMENTOS INTEIROS. ESCREVA UM PROGRAMA QUE 
 * IMPRIMA CADA ELEMENTO DO VETOR 'A' E UMA MENSAGEM INDICANDO SE O RESPECTIVO
 * ELEMENTO � UM N�MERO PRIMO OU N�O.
 */
package lista04;

import java.util.Random;

public class Exer33 {

	public static void main(String[] args) {
		
		Random gerarNumero = new Random();
		
		int vetorA[] = new int[10];
		String primoOuNaoPrimo[] = new String[vetorA.length]; 
		int numeroPrimo = 0;
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = gerarNumero.nextInt(101) + 1;
			for(int j = vetorA[i]; j > 0; j--) {
				if(vetorA[i] % j == 0) {
					numeroPrimo ++;
				}
			}
			
			if(numeroPrimo == 2) {
				primoOuNaoPrimo[i] = "� um n�mero Primo!";
			}
			else if(numeroPrimo > 2) {
				primoOuNaoPrimo[i] = "N�o � um n�mero Primo";
			}
			numeroPrimo = 0;
		}
		
		System.out.print("N�meros lidos:");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + ": " + primoOuNaoPrimo[i]);
		}
	}

}
