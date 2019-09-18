/*
 * CRIAR DOIS VETORES 'A' E 'B' CADA UM COM 10 ELEMENTOS INTEIROS. CONSTRUIR
 * UM VETOR 'C' DE MESMO TIPO E TAMANHO, OBEDECENDO AS SEGUINTES REGRAS DE FORMAÇÃO:
 * 1) C[I] DEVERÁ RECEBER 1 QUANDO A[I] FOR MAIOR QUE B[I];
 * 2) C[I] DEVERÁ RECEBER 0 QUANDO A[I] FOR IGUAL A B[I];
 * 3) C[I] DEVERÁ RECEBER -1 QUANDO A[I] FOR MENOR QUE B[I];
 */
package lista04;

import java.util.Random;

public class Exer26 {

	public static void main(String[] args) {
		
		Random geradorNum = new Random();
		
		int vetorA[] = new int[10];
		int vetorB[] = new int[vetorA.length];
		int vetorC[] = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = geradorNum.nextInt(101);
			vetorB[i] = geradorNum.nextInt(101);
			
			if(vetorA[i] > vetorB[i]) {
				vetorC[i] = 1; 
			}else if(vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;
			}else {
				vetorC[i] = -1;
			}
		}
		
		System.out.print("Números lidos VetorA: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.print("Números lidos VetorB: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		System.out.print("VetorC: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		
		
	}

}
