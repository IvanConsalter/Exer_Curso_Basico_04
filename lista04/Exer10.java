/*
 * CRIAR UM VETOR 'A' COM 10 ELEMENTOS INTEIROS. CONSTRUIR UM VETOR 'B'
 * DE MESMO TIPO E TAMANHO, SENDO QUE CADA ELEMENTO DO VETOR 'B' DEVER�
 * SER O RESTO DA DIVIS�O DO RESPECTIVO ELEMENTO DE 'A' POR 2, OU SEJA:
 * 'B'[I] = 'A'[I] % 2.
 */
package lista04;


import java.util.Random;

public class Exer10 {

	public static void main(String[] args) {
		Random gerarNumero = new Random();
		

		int vetorA[] = new int[10];
		int vetorB[] = new int[vetorA.length];
		

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = gerarNumero.nextInt(101) + 1;
			vetorB[i] = vetorA[i] % 2;
			
		}

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Resto da Divis�o de " + vetorA[i] + " / 2 = " + vetorB[i]);
		}

	}

}
