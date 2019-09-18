/*
 * CRIAR UM VETOR 'A' COM 5 ELEMENTOS INTEIROS. CONSTRUIR UM VETOR 'B'
 * DE MESMO TIPO E TAMANHO E COM OS MESMOS ELEMENTOS DO VETOR 'A', OU 
 * SEJA, 'B'[I] = 'A'[I].
 */
package lista04;

import java.util.Random;

public class Exer01 {

	public static void main(String[] args) {
		Random gerarNumero = new Random();
		
		int vetorA[] = new int[5];
		int vetorB[] = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = gerarNumero.nextInt(101);
			vetorB[i] = vetorA[i];
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " - ");
		}
		System.out.println();
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " - ");
		}
	}

}
