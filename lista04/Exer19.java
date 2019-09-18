/*
 * LER AS DUAS NOTAS BIMESTRAIS PARA UM CONJUNTO DE 10 ALUNOS.
 * ARMAZENAR AS NOTAS INFORMADAS EM DOIS VETORES 'NOTA1' E ' NOTA2'
 * DO TIPO REAL. ESCREVA UM PROGRAMA QUE CALCULE A M�DIA ARITM�TICA 
 * SIMPLES DAS NOTAS INFORMADAS ARMAZENANDO O RESULTADO EM UM VETOR 
 * 'RESULTADO' DE MESMO TIPO E TAMANHO AO MOSTRAR OS RESULTADOS
 * EXIBIR A SITUA��O DE CADA ALUNO. SE A M�DIA CALCULADA FOR SUPERIOR 
 * OU IGUAL A 7 O ALUNO ESTAR� 'APROVADO', CASO CONTR�RIO, A SITUA��O
 * DO ALUNO SER� 'REPROVADO'.
 */

package lista04;

import java.text.DecimalFormat;
import java.util.Random;

public class Exer19 {

	public static void main(String[] args) {
		Random gerarNota = new Random();
		DecimalFormat df = new DecimalFormat("#.#");
		
		double nota1[] = new double[10];
		double nota2[] = new double[nota1.length];
		double media[] = new double[nota1.length];
		String aprovadoOuReprovado[] = new String[nota1.length];
		
		for(int i = 0; i < 10; i++) {
			nota1[i] = gerarNota.nextDouble() * 10;
			nota2[i] = gerarNota.nextDouble() * 10;
			media[i] = (nota1[i] + nota2[i]) / 2;
			if(media[i] >= 7) {
				aprovadoOuReprovado[i] = "APROVADO!";
			}else {
				aprovadoOuReprovado[i] = "REPROVADO!";
			}
			
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Notas Aluno" + (i + 1) + ": " + df.format(nota1[i]) + " / " + df.format(nota2[i]));
		}
		System.out.println();
		for(int i = 0; i < 10; i++) {
			System.out.println("M�dia Aluno" + (i + 1) + ": " + df.format(media[i]) + "   Situa��o: " + aprovadoOuReprovado[i]);
		}

	}

}
