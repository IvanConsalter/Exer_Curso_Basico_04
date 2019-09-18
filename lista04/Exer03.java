/*
 * CRIAR UM VETOR 'A' COM 15 ELEMENTOS INTEIROS. CONSTRUIR UM VETOR 'B'
 * DE MESMO TIPO E TAMANHO, SENDO QUE CADA ELEMENTO DO VETOR 'B' DEVERÁ 
 * SER O QUADRADO DO RESPECTIVO ELEMENTO DE 'A', OU 
 * SEJA, 'B'[I] = 'A'[I] * 'A'[I].
 */
package lista04;

import java.util.Random;

public class Exer03 {

	public static void main(String[] args) {
		Random gerarNumero = new Random();

		int vetorA[] = new int[15];
		int vetorB[] = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = gerarNumero.nextInt(11);
			vetorB[i] = vetorA[i] * vetorA[i];
		}

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " - ");
		}
		System.out.println();
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " - ");
		}

	}

}
