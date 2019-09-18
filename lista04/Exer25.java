/*
 * CRIAR UM VETOR 'A' COM 10 ELEMENTOS INTEIROS. CONSTRUIR UM VETOR 'B' DE
 * MESMO TIPO E TAMANHO, OBEDECENDO AS SEGUINTES REGRAS DE FORMA��O:
 * 1) B[I] DEVER� RECEBER 1 QUANDO A[I] FOR PAR;
 * 2) B[I] DEVER� RECEBER 0 QUANDO A[I] FOR �MPAR;
 */
package lista04;

import java.util.Random;

public class Exer25 {

	public static void main(String[] args) {
		
		Random gerarNum = new Random();
		
		int vetorA[] = new int[10];
		int vetorB[] = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = gerarNum.nextInt(101) + 1;
			
			if(vetorA[i] % 2 == 0) {
				vetorB[i] = 1;
			}
			else {
				vetorB[i] = 0;
			}
		}
		
		System.out.print("N�meros lidos: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.print("Vetor B: ");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}

	}

}
