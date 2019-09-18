/*
 * GERAR ALEATORIAMENTE UM VETOR 'A' COM 10 ELEMENTOS INTEIROS E IGUAIS 
 * A 0 E 1, SUGESTÃO: A[I] = MATH.ROUND(MATH.RANDOM() * 1);
 * PEDE-SE PARA IMPLEMENTAR UM PROGRAMA QUE DETERMINE O PERCENTUAL
 * DE NÚMEROS 0'S E 1'S EXISTENTES NO VETOR 'A'. 
 * */
package lista04;

import java.util.Random;

public class Exer22 {

	public static void main(String[] args) {
		
		Random gerarNum = new Random();
		
		int vetorA[] = new int[10];
		
		
		int porcentagem0, porcentagem1;
		int numero0 = 0, numero1 = 0;
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = gerarNum.nextInt(2);
			
			if(vetorA[i] == 0) {
				numero1 ++;
				
			}else {
				numero0 ++;
				
			}
		}
		
		System.out.print("Números lidos: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		
		System.out.println();
		porcentagem0 = (numero1 * 100) / vetorA.length;
		porcentagem1 = (numero0 * 100) / vetorA.length;
		
		System.out.println(porcentagem0 + "% são 0's");
		System.out.println(porcentagem1 + "% são 1's");
	
		

	}

}
