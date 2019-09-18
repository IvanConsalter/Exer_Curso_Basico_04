/*
 * NÚMEROS PALÍNDROMOS SÃO AQUELES QUE ESCRITOS DA DIREITA PARA A ESQUERDA
 * TÊM O MESMO VALOR QUANDO ESCRITOS DA ESQUERDA PARA A DIREITA. 
 * EX: 545; 
 *     789987;
 *     97379;
 *     123454321;
 *     
 * ESCREVA UM PROGRAMA QUE VERIFIQUE SE UM DADO VETOR 'A' DE 10 ELEMENTOS 
 * INTEIROS É UM PALÍNDROMO, OU SEJA, SE O PRIMEIRO ELEMENTO DO VETOR É IGUAL
 * AO ÚLTIMO, SE O SEGUNDO ELEMENTO DO VETOR É IGUAL AO PENÚLTIMO E ASSIM
 * POR DIANTE ATÉ VERIFICAR TODOS OS ELEMENTOS OU CHEGAR A CONCLUSÃO QUE
 * O VETOR NÃO É UM PALÍNDROMO.    
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
		System.out.print("Números lidos: ");
		for (int n = 0; n < vetorA.length; n++) {
			if (vetorA[n] == 0) {
				continue;
			}
			System.out.print(vetorA[n] + " ");
		}

		for (i = 0; i < j; i++) {
			if (vetorA[i] != vetorA[j]) {
				System.out.println("Não é um Palíndromo");
				break;
			}
			
			j--;
		}
		sc.close();

	}

}
