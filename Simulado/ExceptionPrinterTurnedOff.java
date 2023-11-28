package Simulado;

public class ExceptionPrinterTurnedOff extends Exception{
	@Override
	public String getMessage() {
		return "Impressora desligada";
	}
}
