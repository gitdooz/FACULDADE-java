package AttRevistaEdicao;

import java.util.ArrayList;

public class Revista {
	private int codigo;
	private String titulo;
	private int reciclagemProduzida;
	private List<Edicao> listaEdicoes;
	
	public Edicao(int codigo, String titulo, int reciclagemProduzida) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.reciclagemProduzida = reciclagemProduzida;
		this.listaEdicoes = new ArrayList<Edicao>();
	}
}
