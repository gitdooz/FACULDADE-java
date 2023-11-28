package Simulado;

public abstract class Impressora implements IEquipamento{
	private static int ultimoId = 0;
	private int id;
	private String modelo;
	protected boolean ligada;
	
	public Impressora(String modelo) {
		this.id = ++ultimoId;
		this.modelo = modelo;
		this.ligada = false;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isLigada() {
		return ligada;
	}
	
	public void getId(int id) {
		this.id = id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}
