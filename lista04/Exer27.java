/*
 * CRIAR UM VETOR 'A' COM 10 ELEMENTOS INTEIROS. CONSTRUIR UM VETOR 'B' DE
 * MESMO TIPO E TAMANHO, OBEDECENDO AS SEGUINTES REGRAS DE FORMAÇÃO:
 * 1) B[I] DEVERÁ RECEBER A LETRA "A" QUANDO A[I] FOR MENOR QUE 7;
 * 2) B[I] DEVERÁ RECEBER A LETRA "B" QUANDO A[I] FOR IGUAL QUE 7;
 * 3) B[I] DEVERÁ RECEBER A LETRA "C" QUANDO A[I] FOR MAIOR QUE 7 E MENOR QUE 10;
 * 4) B[I] DEVERÁ RECEBER A LETRA "D" QUANDO A[I] FOR IGUAL QUE 10;
 * 5) B[I] DEVERÁ RECEBER A LETRA "E" QUANDO A[I] FOR MAIOR QUE 10;
 * 
 * SUGESTÃO: CHAR B[10];
 */
package lista04;

import java.util.Random;

public class Exer27 {

	public static void main(String[] args) {
		Random gerarNumero = new Random();
		
		
		int vetorA[] = new int[10];
		char vetorB[] = new char[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = gerarNumero.nextInt(16) + 1;
			
			if(vetorA[i] < 7) {
				vetorB[i] = 'A';
			}else if(vetorA[i] == 7) {
				vetorB[i] = 'B';
			}else if(vetorA[i] > 7 && vetorA[i] < 10) {
				vetorB[i] = 'C';
			}else if(vetorA[i] == 10) {
				vetorB[i] = 'D';
			}else if(vetorA[i] > 10) {
				vetorB[i] = 'E';
			}
		}
		
		System.out.print("Números lidos: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.print("VetorB:         ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		

	}

}
