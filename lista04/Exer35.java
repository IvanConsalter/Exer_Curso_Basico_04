/*
 * CRIAR UM VETOR 'A' COM 10 ELEMENTOS. ESCREVA UM PROGRAMA QUE IMPRIMA
 * CADA ELEMENTO DO VETOR 'A' E A RELAÇÃO DE TODOS OS DIVISORES DO RESPECTIVO
 * ELEMENTO.
 */
package lista04;

import java.util.Random;

public class Exer35 {

	public static void main(String[] args) {
		Random gerarNumero = new Random();

		int vetorA[] = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = gerarNumero.nextInt(20) + 2;
			System.out.println("Divisore de: " + vetorA[i]);
			for (int j = 1; j <= vetorA[i]; j++) {
				if (vetorA[i] % j == 0) {
					System.out.println(j);
				}
			}
		}

	}

}
