package AttRevistaEdicao;

import java.util.Date;

public class Edicao {
	private int numeroEdicao;
	private Date data;
	private int tiragem;
	private int qntdeVendida;
	private boolean reciclou;
	private int qntdeNaoVendidos;
	
	public Edicao(int numeroEdicao, Date data, int tiragem, 
			int qtdeVendida, boolean reciclou) {
		this.numeroEdicao = numeroEdicao;
		this.data = data;
		this.tiragem = tiragem;
		this.qntdeVendida = 0;
		this.reciclou = false;
		this.qntdeNaoVendidos = 0;
	}
	
	public void informaVenda(int qntdeVendida) {
		if (reciclou) {
			this.qntdeVendida += qntdeVendida;
		}
	}
	
	public int obtemReciclagem() {
		if (reciclou = false){
			qntdeNaoVendidos += 1;
		}
		
		return qntdeNaoVendidos;
	}
	
	public void reciclaExemplares() {
		this.reciclou = true;
	}
	
	public int getQntdeVendida() {
		return this.qntdeVendida;
	}
	
	public boolean getReciclou() {
		return this.reciclou;
	}
	
	public int getQntdeNaoVendidos() {
		return this.qntdeNaoVendidos;
	}
	
	public int getNumeroEdicao() {
		return this.numeroEdicao;
	}
	
	public Date getData() {
		return this.data;
	}
	
	public int getTiragem() {
		return this.tiragem;
	}
}



