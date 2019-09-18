/*
 * N�MEROS PAL�NDROMOS S�O AQUELES QUE ESCRITOS DA DIREITA PARA A ESQUERDA
 * T�M O MESMO VALOR QUANDO ESCRITOS DA ESQUERDA PARA A DIREITA. 
 * EX: 545; 
 *     789987;
 *     97379;
 *     123454321;
 *     
 * ESCREVA UM PROGRAMA QUE VERIFIQUE SE UM DADO VETOR 'A' DE 10 ELEMENTOS 
 * INTEIROS � UM PAL�NDROMO, OU SEJA, SE O PRIMEIRO ELEMENTO DO VETOR � IGUAL
 * AO �LTIMO, SE O SEGUNDO ELEMENTO DO VETOR � IGUAL AO PEN�LTIMO E ASSIM
 * POR DIANTE AT� VERIFICAR TODOS OS ELEMENTOS OU CHEGAR A CONCLUS�O QUE
 * O VETOR N�O � UM PAL�NDROMO.    
 */
package lista04;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int vetorA[] = new int[20];
		int i = 0;
		boolean sair = false;

		System.out.println("Digite 0 para sair.");
		do {
			vetorA[i] = sc.nextInt();
			if (vetorA[i] == 0) {
				sair = true;
			}

			i++;

		} while (sair == false);

		int j = (i - 2);
	
		System.out.println();
		System.out.print("N�meros lidos: ");
		for (int n = 0; n < vetorA.length; n++) {
			if (vetorA[n] == 0) {
				continue;
			}
			System.out.print(vetorA[n] + " ");
		}

		for (i = 0; i < j; i++) {
			if (vetorA[i] != vetorA[j]) {
				System.out.println("N�o � um Pal�ndromo");
				break;
			}
			
			j--;
		}
		sc.close();

	}

}
