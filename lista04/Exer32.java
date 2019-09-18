/*
 * CRIAR UM VETOR 'A' COM 5 ELEMENTOS INTEIROS. ESCREVA UM PROGRAMA QUE
 * IMPRIMA A TABUADA DE CADA UM DOS ELEMENTOS DO VETOR 'A'.
 */
package lista04;

import java.util.Random;

public class Exer32 {

	public static void main(String[] args) {
		Random gerarNumero = new Random();
		
		int vetorA[] = new int[5];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = gerarNumero.nextInt(10) + 1;
			for(int j = 1; j <= 10; j++) {
				System.out.println(vetorA[i] + " X " + j + " = " + vetorA[i] * j);
			}
			System.out.println();
		}

	}

}
