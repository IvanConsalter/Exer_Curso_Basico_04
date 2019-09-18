/*
 * CRIAR UM VETOR 'A' COM 15 ELEMENTOS INTEIROS. CONSTRUIR UM VETOR 'B'
 * DE MESMO TIPO E TAMANHO, SENDO QUE CADA ELEMENTO DO VETOR 'B' DEVER� 
 * SER O RESPECTIVO ELEMENTO DE 'A' MULTIPLICADO POR SUA POSI��O(OU �NDICE), OU 
 * SEJA, 'B'[I] = 'A'[I] * I.
 */
package lista04;

import java.text.DecimalFormat;
import java.util.Random;

public class Exer05 {

	public static void main(String[] args) {
		Random gerarNumero = new Random();
		DecimalFormat df = new DecimalFormat("###.##");

		int vetorA[] = new int[15];
		double vetorB[] = new double[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = gerarNumero.nextInt(11);
			vetorB[i] = vetorA[i] * i;
		}

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " - ");
		}
		System.out.println();
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(df.format(vetorB[i]) + " - ");
		}

	}

}
