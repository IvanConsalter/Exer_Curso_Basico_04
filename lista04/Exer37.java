/*
 * CRIAR UM VETOR 'A' COM 15 ELEMENTOS INTEIROS. CONSTRUIR UM VETOR 'B' DE 
 * MESMO TAMANHO, SENDO QUE CADA ELEMENTO DO VETOR 'B' SEJA O FATORIAL DO
 * ELEMENTO CORRESPONDENTE EM 'A'.
 */
package lista04;

import java.util.Scanner;

public class Exer37 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vetorA[] = new int[15];
		int vetorB[] = new int[vetorA.length];
		
		for(int i = 0;i < vetorA.length; i++) {
			vetorA[i] = (i + 1);
			vetorB[i] = 1;
			for(int j = vetorA[i]; j > 0; j--) {
				vetorB[i] *=  j;
			}
		}
		
		System.out.print("VetorA: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println("VetorB: ");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.println("Fatorial de " + vetorA[i] + " = " + vetorB[i]);
		}
		
		
		
		
		
		sc.close();

	}

}
