/*
 * CRIAR UM VETOR 'A' COM 8 ELEMENTOS INTEIROS. CONSTRUIR UM VETOR 'B'
 * DE MESMO TIPO E TAMANHO E COM OS ELEMENTOS DO VETOR 'A' MULTIPLICADOS
 * POR 2, OU SEJA: 'B'[I] = 'A'[I] * 2.
 */
package lista04;

import java.util.Random;

public class Exer02 {

	public static void main(String[] args) {
		Random gerarNumero = new Random();

		int vetorA[] = new int[8];
		int vetorB[] = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = gerarNumero.nextInt(26);
			vetorB[i] = vetorA[i] * 2;
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
