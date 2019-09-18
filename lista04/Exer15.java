/*
 * CRIAR UM VETOR 'A' COM 10 ELEMENTOS INTEIROS. DESENVOLVER UM PROGRAMA
 * QUE DEFINA O PERCENTUAL DE ELEMENTOS PARES E ÍMPARES,RESPECTIVAMENTE
 * ARMAZENADOS NESTE VETOR.
 */
package lista04;

import java.util.Random;

public class Exer15 {

	public static void main(String[] args) {
		Random gerarNum = new Random();
		
		int vetorA[] = new int[10];
		int vetorPar[] = new int[vetorA.length];
		int vetorImpar[] = new int[vetorA.length];
		
		int porcentagemPar, porcentagemImpar;
		int numeroImpar = 0, numeroPar = 0;
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = gerarNum.nextInt(101) + 1;
			
			if(vetorA[i] % 2 == 0) {
				numeroPar ++;
				vetorPar[i] = vetorA[i];
			}else {
				numeroImpar ++;
				vetorImpar[i] = vetorA[i];
			}
		}
		
		System.out.print("Números lidos: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.print("Números Pares: ");
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorPar[i] == 0) {
				continue;
			}
			System.out.print(vetorPar[i] + " ");
		}
		
		System.out.println();
		System.out.print("Números Impares: ");
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorImpar[i] == 0) {
				continue;
			}
			System.out.print(vetorImpar[i] + " ");
		}
		System.out.println();
		porcentagemPar = (numeroPar * 100) / vetorA.length;
		porcentagemImpar = (numeroImpar * 100) / vetorA.length;
		
		System.out.println(porcentagemPar + "% são Pares");
		System.out.println(porcentagemImpar + "% são Impares");
	}

}
