/*
 * CRIAR UM VETOR 'A' COM 10 ELEMENTOS INTEIROS. CONSTRUIR UM VETOR 'B' DE
 * MESMO TIPO E TAMANHO, OBEDECENDO AS SEGUINTES REGRAS DE FORMAÇÃO:
 * 1) B[I] DEVERÁ RECEBER 1 QUANDO A[I] FOR PAR;
 * 2) B[I] DEVERÁ RECEBER 0 QUANDO A[I] FOR ÍMPAR;
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
		
		System.out.print("Números lidos: ");
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
