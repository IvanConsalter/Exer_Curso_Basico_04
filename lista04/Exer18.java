/*
 * LER UM VETOR 'A' COM 10 ELEMENTOS INTEIROS CORRESPONDENTES AS IDADES
 * DE UM GRUPO DE PESSOAS. ESCREVA UM PROGRAMA QUE DETERMINE E ESCREVA 
 * A MENOR E A MAIOR IDADE E SUAS RESPECTIVAS POSIÇÕES.
 */
package lista04;

import java.util.Random;

public class Exer18 {

	public static void main(String[] args) {
		Random geradorNum = new Random();

		int vetorA[] = new int[10];
		int menorIdade = 100, maiorIdade = 0;

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = geradorNum.nextInt(100) + 1;

			if (vetorA[i] < menorIdade) {
				menorIdade = vetorA[i];
			}
			if(vetorA[i] > maiorIdade){
				maiorIdade = vetorA[i];
			}
		}

		System.out.print("Idades registradas: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println("A menor idade registrada foi: " + menorIdade);
		System.out.println("A maior idade registrada foi: " + maiorIdade);

	}

}
