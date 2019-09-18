/*
 * CRIAR UM VETOR 'A' COM 10 ELEMENTOS INTEIROS.IMPLEMENTAR UM 
 * PROGRAMA QUE DEFINA E ESCREVA A QUANTIDADE DE ELEMENTOS 
 * ARMAZENADOS NESTE VETOR QUE SÃO PARES.
 */
package lista04;

import java.util.Random;

public class Exer11 {

	public static void main(String[] args) {
		Random gerar = new Random();
		
		int par = 0;
		int vetorA[] = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = gerar.nextInt(101);
			
			if(vetorA[i] % 2 == 0) {
				par ++;
			}
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println("De " + vetorA.length + " números: " + par + " são Par.");
	}

}
