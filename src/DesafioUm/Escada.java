package DesafioUm;

import java.util.Scanner;

public class Escada {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("informe um valor para n");
		int n = s.nextInt();
		
		// cria uma matriz para preenchimento dos "*"
		String [][] matriz = new String[n][n];
		
		/* Preenche a matriz, percorre-se a primeira linha e vai preenchendo
		 * as colunas de trás para frente 
		 * */
		for(int linha = 0; linha < matriz.length; linha++) {
			int numeroDegrau = matriz.length - linha - 1;
			for(int coluna = numeroDegrau; coluna < matriz.length; coluna++) {
				matriz[linha][coluna] = "*";
			}
		}

		/* Utiliza-se outros dois laços para percorrer a matriz
		 * onde se tem o valor nulo, coloca-se um espaço vaizio
		 * e então imprime as linhas, uma por uma.
		 */
		for(int linha = 0; linha < matriz.length; linha ++) {
			String saida = "";
			for(int coluna = 0; coluna < matriz.length; coluna++) {
				if(matriz[linha][coluna] == null) {
					matriz[linha][coluna] = " ";
				}
				saida += matriz[linha][coluna];
			}
			System.out.println(saida);
		}
	}
}
