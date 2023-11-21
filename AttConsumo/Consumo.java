package AttConsumo;

import java.util.Date;

public class Consumo {
	
	private static int ultimoId = 0;
	
	private int idConsumo;
	private Date data;
	private char tipoConsumo;
	private char tipoCliente;
	private double valorConsumo;
	private double valorConta;
	
	public Consumo(double valorConsumo) {
		this.idConsumo = ++ultimoId; 
		this.data = new Date();
		this.tipoConsumo = 'C';
		this.tipoCliente = 'P';
		this.valorConsumo = valorConsumo;
		this.fechaConta(valorConsumo);
	}
	
	public Consumo(double valorConsumo, char tipoCliente) {
		this.idConsumo = ++ultimoId; 
		this.data = new Date();
		this.tipoConsumo = 'P';
		this.tipoCliente = tipoCliente ;
		this.valorConsumo = valorConsumo;
		this.fechaConta(this.valorConsumo, this.tipoCliente);
	}
	
	public void fechaConta(double valorConsumo) {
		this.valorConta = valorConsumo * 1.1;
	}
	
	public void fechaConta(double valorConsumo, char tipoCliente) {
		if (this.tipoCliente == 'F'){
			this.valorConta = valorConsumo - 10;
		}
		
		if(this.tipoCliente == 'A') {
			if(this.valorConsumo <= 30) {
				this.valorConta = valorConsumo - 3;
			}
			else {
				this.valorConsumo = valorConsumo - 5;
			}
		}
	}

	public int getIdConsumo() {
		return idConsumo;
	}

	public Date getData() {
		return data;
	}

	public char getTipoConsumo() {
		return tipoConsumo;
	}

	public char getTipoCliente() {
		return tipoCliente;
	}

	public double getValorConsumo() {
		return valorConsumo;
	}

	public double getValorConta() {
		return valorConta;
	}

	@Override
	public String toString() {
		return "Consumo [idConsumo=" + idConsumo + ", data=" + data + ", tipoConsumo=" + tipoConsumo + ", tipoCliente="
				+ tipoCliente + ", valorConsumo=" + valorConsumo + ", valorConta=" + valorConta + "]";
	}
	
	
	
	
	
	
}
