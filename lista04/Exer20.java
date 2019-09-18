/*
 * IMPLEMENTAR UM PROGRAMA QUE OBTENHA A COTAÇÃO DO DÓLAR(U$)
 * EM RELAÇÃO AO REAL(R$) E A SEGUIR ARMAZENE EM UM VETOR 'A'
 * COM 20 ELEMENTOS AS SEGUINTES CONVERSÕES:
 * A[I] = COTAÇÃO DO DOLAR * I, PARA TODO I VARIANDO DE 1 ATÉ 20.
 */
package lista04;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double vetorA[] = new double[20];
		double cotacao;
		
		System.out.print("Entre com a cotação do dollar: ");
		cotacao = sc.nextDouble();
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = cotacao * (i + 1);
		}
		
		for(int i = 0; i < vetorA.length; i++)
			System.out.println(vetorA[i]);
		sc.close();
	}

}
