/*
 * LER UM VETOR 'A' COM 20 ELEMENTOS. SEPARAR OS ELEMENTOS PARES E �MPARES
 * DE 'A' UTILIZANDO APENAS UM VETOR EXTRA 'B'. SUGEST�O:
 * NO �NICIO DO VETOR 'B' ARMAZENE OS ELEMENTOS PARES DE 'A' E NAS POSI��ES
 * RESTANTES DO VETOR 'B' ARMAZENE OS ELEMENTOS DE 'A' QUE S�O �MPARES.
 */
package lista04;

import java.util.Random;

public class Exer31 {

	public static void main(String[] args) {
		Random gerarNum = new Random();
		
		int vetorA[] = new int[20];
		int vetorB[] = new int[vetorA.length];
		int j = vetorA.length - 1;
		int l = 0;
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = gerarNum.nextInt(101) + 1;
			
			if(vetorA[i] % 2 == 0) {
				vetorB[l] = vetorA[i];
				l++;
			}
			else {
				vetorB[j] = vetorA[i];
				j--;
			}
			
			
		} 
		
		System.out.print("N�meros lidos: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.print("VetorB: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
	}

}
