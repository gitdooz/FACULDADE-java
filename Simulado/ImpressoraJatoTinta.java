package Simulado;

public class ImpressoraJatoTinta extends Impressora{
	private static int id = 0;
	
	private int numCartuchos;
	private boolean cartuchosAlinhados;
	
	public ImpressoraJatoTinta(int numCartuchos, String modelo) {
		super(modelo);
		this.numCartuchos = numCartuchos;
		this.cartuchosAlinhados = false;
	}
	
	@Override
	public void ligaDesliga() {
		this.ligada = !ligada;
	}
	
	public String alinharCartuchos() {
		this.cartuchosAlinhados = true;
	}
}
