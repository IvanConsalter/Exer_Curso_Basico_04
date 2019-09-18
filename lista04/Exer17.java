/*
 * LER UM VETOR 'A' COM 10 ELEMENTOS INTEIROS CORRESPONDENTES AS IDADES 
 * DE UM GRUPO DE PESSOAS. ESCREVA UM PROGRAMA QUE DETERMINE E ESCREVA 
 * A QUANTIDADE DE PESSOAS QUE POSSUEM IDADE SUPERIOR A 35 ANOS.
 */
package lista04;

import java.util.Random;

public class Exer17 {

	public static void main(String[] args) {
		Random geradorNum = new Random();
		
		int vetorA[] = new int[10];
		int maiorQue35 = 0;
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = geradorNum.nextInt(100) + 1;
			
			if(vetorA[i] > 35) {
				maiorQue35 ++;
			}
		}
		
		System.out.print("Idades registradas: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println(maiorQue35 + " pessoas tem mais que 35 anos.");
		
		
	}

}
