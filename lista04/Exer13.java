/*
 * CRIAR UM VETOR 'A' COM 10 ELEMENTOS INTEIROS. IMPLEMENTAR UM PROGRAMA 
 * QUE DETERMINE A SOMA DOS ELEMENTOS ARMAZENADOS NESTE VETOR QUE SÃO 
 * MÚLTIPLOS DE 5.
 */
package lista04;

import java.util.Random;

public class Exer13 {

	public static void main(String[] args) {
		
		Random gerarNumero = new Random();
		
		int vetorA[] =  new int[10];
		int multiplicos5[] = new int[vetorA.length];
		int soma = 0;
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = gerarNumero.nextInt(101) + 1;
			if(vetorA[i] % 5 == 0) {
				soma += vetorA[i];
				multiplicos5[i] = vetorA[i];
			}
		}
		
		System.out.print("Números lidos: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.print("Multiplos de 5: ");
		for (int i = 0; i < multiplicos5.length; i++) {
			if(multiplicos5[i] == 0) {
				continue;
			}
			System.out.print(multiplicos5[i] + " ");
		}
		System.out.println();
		System.out.println("Soma dos multiplos: " + soma);
	}

}
