/*
 * CRIAR UM VETOR 'A' COM 10 ELEMENTOS INTEIROS. DESENVOLVER UM PROGRAMA
 * QUE VERIFIQUE SE 'TODOS' OS ELEMENTOS DO VETOR 'A' SÃO PARES.
 * SE PELO MENOS UM ELEMENTOS DO VETOR NÃO FOR PAR O PROCESSO DE REPETIÇÃO
 * PARA PERCORRER OS ELEMENTOS DO VETOR DEVE SER ENCERRADO, COMO SUGESTÃO:
 * UTILIZE UMA VARIÁVEL DO TIPO FLAG PARA ATINGIR ESSE PROPÓSITO.
 */
package lista04;

import java.util.Random;
//import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		Random gerarNumero = new Random();

		int vetorA[] = new int[10];
		int soPar[] = new int[vetorA.length];
		

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = gerarNumero.nextInt(101) + 1;
			if (vetorA[i] % 2 == 0) {

				soPar[i] = vetorA[i];
			} else {
				break;
			}
		}

		System.out.print("VetorA: ");
		for (int i = 0; i < vetorA.length; i++) {
			if (soPar[i] == 0) {
				continue;
			}
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.print("Números pares lidos: ");
		for (int i = 0; i < soPar.length; i++) {
			if (soPar[i] == 0) {
				continue;
			}
			System.out.print(soPar[i] + " ");
		}
		
		
		
		//sc.close();
	}

}
