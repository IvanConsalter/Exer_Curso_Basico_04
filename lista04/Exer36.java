/*
 * CRIAR UM VETOR 'A' COM 11 ELEMENTOS, INDEXADOS DE 0 AT� 10. SENDO QUE
 * CADA ELEMENTO DO VETOR 'A' � FORMADO PELA POT�NCIA DE BASE 2 ELEVADO
 * AO EXPOENTE IGUAL A POSI��O DO RESPECTIVO ELEMENTO, OU SEJA:
 * 
 * A[I] = 2^I. SUGEST�O INT A[11];
 */
package lista04;

public class Exer36 {

	public static void main(String[] args) {
		
		double vetorA[] = new double[11];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = Math.pow(2, i);
		}
		System.out.print("VetorA: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

	}

}
