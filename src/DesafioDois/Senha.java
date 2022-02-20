package DesafioDois;

import java.util.Scanner;

public class Senha {
	public static int senhaSegura(String senha) {
		int tamanho = senha.length();
		int atingirMinimo = 0;
		int qtdCaracteres = 0;
		boolean contemDigito = false, contemMaiusculo = false, contemMinusculo = false, contemEspecial = false;
		
		/*
		 * verifica se o tamanho da senha é menor que o minime exigido
		 * e faz um calculo de quantos caracteres faltam para chegar ao minimo
		 */
		if (tamanho < 6) {
			atingirMinimo = 6 - tamanho;
		}
		
		/*
		 * Laço de repetição que lê cada caractere da senha e o
		 * compara com a tabela ASCII para saber se atende aos requisitos
		 */
		for(int i = 0; i < senha.length(); i++) {
			char caractere = senha.charAt(i);
			int caractereASCII = (int) caractere;
			
			/*
			 * comparação do caractere com os códigos ASCII referente aos digitos.
			 */
			if (caractereASCII >= 48 && caractereASCII <= 57) {
				contemDigito = true;
			}
			
			/*
			 * comparação do caractere com os códigos ASCII referente aos caracteres especiais.
			 */
			if (caractereASCII == 33 || 
					(caractereASCII >= 35 && caractereASCII <= 38) || 
					(caractereASCII >= 40 && caractereASCII <= 43) || 
					caractereASCII == 45 || caractereASCII == 64 || 
					caractereASCII == 94) {
				contemEspecial = true;
			}
			
			/*
			 * comparação do caractere com os códigos ASCII referente aos caracteres maiusculos.
			 */
			if (caractereASCII >= 65 && caractereASCII <= 90) {
				contemMaiusculo = true;
			}
			
			/*
			 * comparação do caractere com os códigos ASCII referente aos caracteres minusculos.
			 */
			if (caractereASCII >= 97 && caractereASCII <= 122) {
				contemMinusculo = true;
			}
		}
		
		int cont = 0;
		
		/*
		 * as comparações a seguir definem qual tipo de caractere possui a senha
		 * e faz um incremento na variavel cont, caso não atenda àquele requisito
		 */
		if (!contemMinusculo) {
			cont++;
		}
		if (!contemDigito) {
			cont++;
		}
		if (!contemMaiusculo) {
			cont++;
		}
		if (!contemEspecial) {
			cont++;
		}
		
		/*
		 * faz as comparações de tamanho e de caracteres que faltam para atingir
		 * o minimo de segurança e retorna este valor.,
		 */
		if (tamanho < 6) {			
			tamanho = tamanho + cont;
			int minimo = tamanho - 6;
			if(minimo < 0) {
				minimo = minimo * - 1;
				atingirMinimo = cont+minimo;
			} else  {
				atingirMinimo = cont;
			} 
		} else {
			atingirMinimo = cont;
		}
		return atingirMinimo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("informe a senha: ");
		
		String senha = s.nextLine();
		int minimoParaSeguro = senhaSegura(senha);
		
		System.out.println("o minimo para atingir segurança é: " + minimoParaSeguro + " caracteres");

	}

}
