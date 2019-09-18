/*
 * CRIAR UM VETOR 'A' COM 10 ELEMENTOS INTEIROS. IMPLEMENTAR UM PROGRAMA 
 * QUE DEFINA E ESCREVA A M�DIA ARITM�TICA SIMPLES DOS ELEMENTOS �MPARES
 * ARMAZENADOS NESTE VETOR.
 */
package lista04;

import java.text.DecimalFormat;
import java.util.Random;

public class Exer14 {

	public static void main(String[] args) {
		Random geradorNumero = new Random();
		DecimalFormat df = new DecimalFormat("###.##");
		
		double soma = 0;
		int numerosImpar = 0;
		int vetorA[] = new int[10];
		int vetorImpar[] = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = geradorNumero.nextInt(101) + 1;
			
			if (vetorA[i] % 2 != 0) {
				numerosImpar ++;
				vetorImpar[i] = vetorA[i];
				soma += vetorImpar[i];
			}
		}
		
		System.out.print("N�meros lidos: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.print("N�meros �mpares:");
		for(int i = 0; i < vetorImpar.length; i++) {
			if(vetorImpar[i] == 0 ) {
				continue;
			}
			System.out.print(vetorImpar[i] + " ");
		}
		
		double media = soma / numerosImpar;
		System.out.println();
		System.out.println("Soma dos n�meros �mpares: " + soma);
		System.out.println("M�dia: " + df.format(media));
	}

}
