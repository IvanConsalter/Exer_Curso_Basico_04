/*
 * CRIAR DOIS VETORES 'A' E 'B' CADA UM COM 10 ELEMENTOS INTEIROS. CONSTRUIR
 * UM VETOR 'C', ONDE CADA ELEMENTO DE 'C' É A SOMA DOS RESPECTIVOS ELEMENTOS
 * EM 'A' E 'B', OU SEJA 'C'[I] = 'A'[I] + 'B'[I].
 */
package lista04;


import java.util.Random;

public class Exer06 {

	public static void main(String[] args) {
		Random gerarNumero = new Random();
		

		int vetorA[] = new int[10];
		int vetorB[] = new int[vetorA.length];
		int vetorC[] = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = gerarNumero.nextInt(11);
			vetorB[i] = gerarNumero.nextInt(11);
			vetorC[i] = vetorA[i] + vetorB[i];
		}

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + " + " + vetorB[i] + " = " + vetorC[i]);
		}
		


	}

}
