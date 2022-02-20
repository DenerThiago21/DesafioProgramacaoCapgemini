package DesafioTres;

import java.util.ArrayList;
import java.util.Scanner;

public class Anagrama {

	public static int qtdAnagramasPares(String s) {
		
		// Array que irá conter as palavras geradas de cada entrada
		/* exemplo a entrada "ovos" irá gerar as seguintes palavras
		 * o - v - o - s
		 * ov - vo - os
		 * ovo - vos
		 */
		ArrayList<String> palavras = new ArrayList<String>();
		/* variável que faz o controle do algoritmo
		 * controla quantas vezes de acordo com o tamanho da 
		 * entrada o algoritmo executará suas verificações
		 */
		int cont = 1;
		int soma = 0;
		
		// enquanto a variável cont for menor que o tamanho da String 
		// s, executa a lógica do algoritmo
		while (cont < s.length()) {
			/* repetição que irá quebrar a String em substrings
			 * e armazena em um array
			 * exemplo: na primeira execução da entrada "ovos"
			 * irá gerar o Array {'o', 'v', 'o', 's'}
			 * na segunda execução irá gerar o Array {'ov', 'vo', 'os'} e assim por diante
			 */
			for (int i = 0; i < s.length(); i++) {
				int end = i + cont;
				if (end > s.length()) {
					break;
				}
				String x = s.substring(i, end);
				palavras.add(x);
			}
			
			/*
			 * com o Array preenchido percorre a primeira posição do array comparando com as demais,
			 * na segunda execução deste laço, irá pegar a segunda posição e comparará com as demais 
			 * e assim por diante.
			 */
			for (int i = 0; i< palavras.size(); i++) {
				for (int j = i+1; j < palavras.size(); j++) {
					String x = palavras.get(i);
					String y = palavras.get(j);
					String z = "";
					
					/*
					 * estes laços fazem a comparação de letras por letras das substrings
					 * fazendo a comparação de uma por uma para verificar se são anagramas
					 */
					for(int k = 0; k < x.length(); k++) {
						for(int l = 0; l < y.length(); l++) {
							String valX = x.substring(k, k+1);
							String valY = y.substring(l, l+1);
						
							/*
							 * este condicional verifica se as letras são iguais durante a comparação,
							 * além do mais se a letra de uma posição da string da primeira 
							 * posição for igual a string da segunda posição são iguais, caso sim
							 * concatena a letra na variavel z e remove da String y a letra
							 */
							if (x.substring(k, k+1).equalsIgnoreCase(y.substring(l, l+1))) {
								z += x.substring(k, k+1);
								y = y.replace(y.substring(l, l+1), "");
								break;
							}
							
						}
					}
					
					/*
					 * compara se a variavel z é igual a string x, caso sim, incrementa-se a variavel
					 * soma, que é a variável que será retornada contendo a resposta. 
					 */
					if (z.equalsIgnoreCase(x)) {
						soma++;
					}
				}
			}	
			palavras = new ArrayList<String>();
			cont++;
		}
		
		return soma;
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("informe uma palavra");
		String s = entrada.nextLine();
		
		int qtd = qtdAnagramasPares(s);
		System.out.println("A quantidade de anagramas pares é: "+qtd);
	}

}
