/*
 * LER UM VETOR 'A' COM 10 ELEMENTOS E CONSTRUIR UM VETOR 'B' DE MESMO
 * TIPO E TAMANHO E COM OS MESMOS ELEMENTOS DE 'A', SENDO QUE ESTES
 * DEVERÃO ESTAR INVERTIDOS, OU SEJA, O PRIMEIRO DE 'A' PASSA A SER
 * O ÚLTIMO DE 'B', O SEGUNDO DE 'A' PASSA A SER O PENÚLTIMO DE 'B'
 * E ASSIM POR DIANTE.
 */
package lista04;

import java.util.Random;

public class Exer28 {

	public static void main(String[] args) {
		Random geradorNumero = new Random();
		
		
		int vetorA[] = new int[10];
		int vetorB[] = new int[vetorA.length];
		int j = vetorA.length - 1;
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = geradorNumero.nextInt(101) + 1;
			vetorB[j] = vetorA[i];
			j --;
		}
		
		System.out.print("VetorA: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.print("VetorB: ");
		
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
	}

}
