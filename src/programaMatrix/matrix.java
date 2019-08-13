package programaMatrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de linhas da matriz:");
	    int linhas = sc.nextInt();
	    
		System.out.println("Digite a quantidade de colunas da matriz:");
		int colunas = sc.nextInt();
		
		int matrix[][] = new int[linhas][colunas];
		
		for (int i = 0; i<linhas; i ++) {
			for (int j = 0; j< colunas; j++) {
				matrix[i][j] = sc.nextInt();
				//System.out.println("outro valor");
			}
			
		}
		
		
		for (int i = 0; i<linhas; i ++) {
			for (int j = 0; j< colunas; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}
		
		System.out.println("Digit o valor a ser encontrado:");
		int valor = sc.nextInt();
		
		/*tentativa por matrix para os valores encontrados
		 * int valoresEncontrados[][] = new int[linhas*colunas+1][2];

		int n = 0;
		
		for (int i = 0; i<linhas; i ++) {
			for (int j = 0; j< colunas; j++) {
				if (matrix[i][j] == valor) {
					valoresEncontrados[n][0] = i;
					valoresEncontrados[n+1][1] = j;
					n++;
				}
			}
		}
		
		for (int i = 0; i<linhas*colunas+1; i ++) {
			for (int j = 0; j< 2; j++) {
				System.out.print(valoresEncontrados[i][j] + " ");
			}
		}
		*/
		
		List<ValoresEncontrados> lista = new ArrayList<>();
		
		for (int i = 0; i<linhas; i ++) {
			for (int j = 0; j< colunas; j++) {
				if (matrix[i][j] == valor) {
					lista.add(new ValoresEncontrados(i,j));
				}
			}
		}
				
		for (ValoresEncontrados e: lista) {
			System.out.println("Position:" + e.ToString());
			
			int co = e.getColuna()-1;
			int co2 = e.getColuna()+1;
			if (co >= 0) {
				System.out.println("Left position: " + matrix[e.getLinha()][e.getColuna() -1]);
			}
			if (co2 <= matrix.length ) {
				System.out.println("Right position: " + matrix[e.getLinha()][co2]);
			}
			
			int li = e.getLinha()-1;
			int li2 = e.getLinha()+1;
			if (li >= 0) {
				System.out.println("Up position: " + matrix[li][e.getColuna()]);
			}
			if (li2 <= matrix.length ) {
				System.out.println("Down position: " + matrix[li2][e.getColuna()]);
			}

		}
		
		
	
		
		
		sc.close();
		
	}

}
