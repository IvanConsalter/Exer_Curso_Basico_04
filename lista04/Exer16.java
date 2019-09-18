/*
 * CRIAR UM VETOR 'A' COM 10 ELEMENTOS INTEIROS. ESCREVER UM PROGRAMA
 * QUE CALCULE E ESCREVA:
 * 1) A SOMA DE ELEMENTOS ARMAZENADOS NESTE VETOR QUE SÃO INFERIORES A 15.
 * 2) A QUANTIDADE DE ELEMENTOS ARMAZENADOS NO VETOR QUE SÃO IGUAIS A 15.
 * 3) A MÉDIA DOS ELEMENTOS ARMAZENADOS NO VETOR QUE SÃO SUPERIORES A 15.
 */
package lista04;

import java.text.DecimalFormat;
import java.util.Random;

public class Exer16 {

	public static void main(String[] args) {
		Random gerarNum = new Random();
		DecimalFormat df = new DecimalFormat("###.##");
		
		int vetorA[] = new int[10];
		int menor15[] = new int[vetorA.length];
		int igual15[] = new int[vetorA.length];
		int maior15[] = new int[vetorA.length];
		
		int soma = 0, quantidadeIgual15 = 0, quantidadeMaior15 = 0;
		double mediaMaiorque15, somaMaior15 = 0;
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = gerarNum.nextInt(21) + 1;
			
			if(vetorA[i] < 15) {
				soma += vetorA[i];
				menor15[i] = vetorA[i];
			}
			else if(vetorA[i] == 15) {
				quantidadeIgual15 ++;
				igual15[i] = vetorA[i];
			}
			else {
				somaMaior15 += vetorA[i];
				quantidadeMaior15 ++;
				maior15[i] = vetorA[i];
			}
		}
		
		mediaMaiorque15 = somaMaior15 / quantidadeMaior15;
		System.out.print("Números lidos: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.print("Números Menores que 15: ");
		for(int i = 0; i < vetorA.length; i++) {
			if(menor15[i] == 0) {
				continue;
			}
			System.out.print(menor15[i] + " ");
		}
		
		System.out.println();
		System.out.print("Números iguais a 15: ");
		for(int i = 0; i < vetorA.length; i++) {
			if(igual15[i] == 0) {
				continue;
			}
			System.out.print(igual15[i] + " ");
		}

		System.out.println();
		System.out.print("Números maiores que 15: ");
		for(int i = 0; i < vetorA.length; i++) {
			if(maior15[i] == 0) {
				continue;
			}
			System.out.print(maior15[i] + " ");
		}
		
		System.out.println();
		System.out.println("A soma dos números menores que 15: " + soma);
		System.out.println("Números iguais a 15: " + quantidadeIgual15);
		System.out.println("A média dos números maiores que 15: " + df.format(mediaMaiorque15));
	}

}
