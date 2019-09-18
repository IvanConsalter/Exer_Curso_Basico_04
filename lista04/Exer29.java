/*
 * LER DOIS VETORES 'A' E 'B' COM 10 ELEMENTOS CADA. CONSTRUIR UM VETOR 'C',
 * SENDO ESTE A JUNÇÃO DOS DOIS OUTROS VETORES. OS PRIMEIROS 10 ELEMENTOS 
 * DE 'C' DEVERÃO RECEBER OS ELEMENTOS DE 'A' E OS ÚLTIMOS ELEMENTOS DE 'C' 
 * DEVERÃO RECEBER OS ELEMENTOS DE 'B'. DESTA FORMA, 'C' DEVERÁ TER O DOBRO
 * DE ELEMENTOS DE 'A' E 'B', OU SEJA, 20 ELEMENTOS.
 */
package lista04;

import java.util.Random;

public class Exer29 {

	public static void main(String[] args) {
		Random gerarNum = new Random();
		
		int vetorA[] = new int[10];
		int vetorB[] = new int[vetorA.length];
		int vetorC[] = new int[vetorA.length * 2];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = gerarNum.nextInt(11) + 1;
			vetorC[i] = vetorA[i];
		}

		for(int i = 0; i < vetorA.length; i++) {
			vetorB[i] = gerarNum.nextInt(11) + 1;
			vetorC[vetorA.length + i] = vetorB[i];
		}
		
		System.out.print("VetorA: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.print("VetorB: ");
		
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println();
		System.out.print("VetorC: ");
		
		for(int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
	}

}
