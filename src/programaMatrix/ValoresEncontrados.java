package programaMatrix;

public class ValoresEncontrados {
	public int linha;
	public int coluna;
	
	public ValoresEncontrados(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
	public String ToString() {
		return linha
				+ "-"
				+ coluna
				+ " ";
	}

}
