/*
 * LER UM VETOR 'A' COM 20 ELEMENTOS. CONSTRUIR DOIS VETORES 'B' E 'C', SENDO
 * QUE NOS VETOR 'B' E 'C' SERÃO ARMAZENADOS OS VALORES PARES E ÍMPARES DE 'A'
 * RESPECTIVAMENTE.
 */
package lista04;


import java.util.Random;

public class Exer30 {

	public static void main(String[] args) {
		Random geradorNumero = new Random();
		
		
		
		int vetorA[] = new int[20];
		int vetorPar[] = new int[vetorA.length];
		int vetorImpar[] = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = geradorNumero.nextInt(101) + 1;
			
			if (vetorA[i] % 2 == 0) {
				vetorPar[i] = vetorA[i];
			}
			else {
				vetorImpar[i] = vetorA[i];
			}
		}
		
		System.out.print("Números lidos: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.print("Números Pares:");
		for(int i = 0; i < vetorImpar.length; i++) {
			if(vetorPar[i] == 0 ) {
				continue;
			}
			System.out.print(vetorPar[i] + " ");
		}
		
		System.out.println();
		System.out.print("Números Ímpares:");
		for(int i = 0; i < vetorImpar.length; i++) {
			if(vetorImpar[i] == 0 ) {
				continue;
			}
			System.out.print(vetorImpar[i] + " ");
		}
		


	}

}
