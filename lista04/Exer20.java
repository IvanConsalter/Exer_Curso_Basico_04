/*
 * IMPLEMENTAR UM PROGRAMA QUE OBTENHA A COTA��O DO D�LAR(U$)
 * EM RELA��O AO REAL(R$) E A SEGUIR ARMAZENE EM UM VETOR 'A'
 * COM 20 ELEMENTOS AS SEGUINTES CONVERS�ES:
 * A[I] = COTA��O DO DOLAR * I, PARA TODO I VARIANDO DE 1 AT� 20.
 */
package lista04;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double vetorA[] = new double[20];
		double cotacao;
		
		System.out.print("Entre com a cota��o do dollar: ");
		cotacao = sc.nextDouble();
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = cotacao * (i + 1);
		}
		
		for(int i = 0; i < vetorA.length; i++)
			System.out.println(vetorA[i]);
		sc.close();
	}

}
