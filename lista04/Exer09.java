/*
 * CRIAR DOIS VETORES 'A' E 'B' CADA UM COM 10 ELEMENTOS INTEIROS. CONSTRUIR
 * UM VETOR 'C', ONDE CADA ELEMENTO DE 'C' É A DIVISÃO DOS RESPECTIVOS ELEMENTOS
 * EM 'A' E 'B', OU SEJA 'C'[I] = 'A'[I] / FOLAT('B'[I]).
 */
package lista04;

import java.text.DecimalFormat;
import java.util.Random;

public class Exer09 {

	public static void main(String[] args) {
		Random gerarNumero = new Random();
		DecimalFormat df = new DecimalFormat("###.##");
		
		int vetorA[] = new int[10];
		float vetorB[] = new float[vetorA.length];
		double vetorC[] = new double[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = gerarNumero.nextInt(11) + 1;
			vetorB[i] = gerarNumero.nextInt(11) + 1;
			vetorC[i] = vetorA[i] / vetorB[i];
		}

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + " / " + vetorB[i] + " = " + df.format(vetorC[i]));
		}


	}

}
