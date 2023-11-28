package Simulado;

public class ImpressoraLazer extends Impressora{
	private static int id = 0;
	
	private char tipo;
	private int temperatura;
	
	public ImpressoraLazer(char tipo, int temperatura, String modelo) {
		super(modelo);
		this.tipo = tipo;
		this.temperatura = temperatura;
	}
	
	@Override
	public void ligaDesliga() {
		this.ligada = !ligada;
		if(ligada == true) {
			ajustarTemperatura(30);
		}
		else {
			ajustarTemperatura(0);
		}
	}
	
	public void ajustarTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
}

