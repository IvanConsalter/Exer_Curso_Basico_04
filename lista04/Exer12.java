/*
 * CRIAR UM VETOR 'A' COM 10 ELEMENTOS INTEIROS.IMPLEMENTAR UM 
 * PROGRAMA QUE DEFINA E ESCREVA A SOMA DE TODOS OS ELEMENTOS 
 * ARMAZENADOS NESTE VETOR.
 */
package lista04;

import java.util.Random;
import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Random gerar = new Random();
		Scanner sc = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int soma = 0;
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = gerar.nextInt(11);
			soma += vetorA[i];
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]);
			if(i == 9) {
				break;
			}
			System.out.print(" + ");
		}
		
		
		System.out.println(" = " + soma);
		
		sc.close();
	}

}
