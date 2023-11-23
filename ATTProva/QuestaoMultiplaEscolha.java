package AttMe;

public class QuestaoMultiplaEscolha extends QuestaoObjetiva {
	private static int ultimaQuestao = 0;
	private char alternativaCorreta;
	private char alternativaMarcada;
	
	public QuestaoMultiplaEscolha(String enunciado, String alternativaA, String alternativaB, String alternativaC, double pontosMatriz, char alternativaCorreta){ 
		super(++ultimaQuestao, enunciado, alternativaA, alternativaB, alternativaC, pontosMatriz);
	
		this.alternativaCorreta = alternativaCorreta;
	}
	
	 public void marcarAlternativa(char alternativaMarcada) {
		 this.alternativaMarcada = alternativaMarcada;
	        super.pontosObtidos = calculaPontosObtidos();
	 }
	 

	public double calculaPontosObtidos() {
		if (alternativaMarcada == alternativaCorreta) {
			return super.getPontoMatriz();
		} 
		
		else{
			return 0;
		}
	}

	public char getAlternativaCorreta() {
		return alternativaCorreta;
	}

	
	public void setAlternativaCorreta(char alternativaCorreta) {
		this.alternativaCorreta = alternativaCorreta;
	}

	public char getAlternativaMarcada() {
		return alternativaMarcada;
	}
}
