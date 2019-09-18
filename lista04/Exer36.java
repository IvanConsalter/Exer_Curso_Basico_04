/*
 * CRIAR UM VETOR 'A' COM 11 ELEMENTOS, INDEXADOS DE 0 ATÉ 10. SENDO QUE
 * CADA ELEMENTO DO VETOR 'A' É FORMADO PELA POTÊNCIA DE BASE 2 ELEVADO
 * AO EXPOENTE IGUAL A POSIÇÃO DO RESPECTIVO ELEMENTO, OU SEJA:
 * 
 * A[I] = 2^I. SUGESTÃO INT A[11];
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
