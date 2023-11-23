package AttMe;

public class QuestaoVerdadeiroFalso extends QuestaoObjetiva {
	private static int ultimaQuestao = 0;
	
	private char alternativaCorretaA;
	private char alternativaCorretaB;
	private char alternativaCorretaC;
	private char alternativaMarcadaA;
	private char alternativaMarcadaB;
	private char alternativaMarcadaC;

	public QuestaoVerdadeiroFalso(String enunciado, String alternativaA, String alternativaB,
			String alternativaC, char alternativaCorretaA, 
			char alternativaCorretaB, char alternativaCorretaC, double pontoMatriz) {
		super(++ultimaQuestao, enunciado, alternativaA, alternativaB, alternativaC, pontoMatriz);

		this.alternativaCorretaA = alternativaCorretaA;
		this.alternativaCorretaB = alternativaCorretaB;
		this.alternativaCorretaC = alternativaCorretaC;
	}

	public void marcarAlternativa(char alternativa,char respostaMarcada) {
		try {
			if(alternativa == 'A') {
				this.alternativaMarcadaA = respostaMarcada;
			} 

			else if(alternativa == 'B') {
				this.alternativaMarcadaB = respostaMarcada;
			}

			else if(alternativa == 'C') {
				this.alternativaMarcadaC = respostaMarcada;
			}
			
			else {
				throw new Exception("Nasdasjodjasodasodjsa");
			}

			super.pontosObtidos = calculaPontosObtidos();

		}
		
		catch (Exception ex){
			System.out.println("Erro :" + ex.getMessage());
		}

	}

	@Override
	public double calculaPontosObtidos() {
		int erros = 0;

		if(alternativaMarcadaA != alternativaCorretaA){
			erros ++;
		}

		if(alternativaMarcadaB != alternativaCorretaB){

			erros ++;
		}

		if(alternativaMarcadaC != alternativaCorretaC){
			erros ++;
		}

		return super.getPontoMatriz() / (erros +1);
	}

	public char getAlternativaCorretaA() {
		return alternativaCorretaA;
	}

	public void setAlternativaCorretaA(char alternativaCorretaA) {
		this.alternativaCorretaA = alternativaCorretaA;
	}

	public char getAlternativaCorretaB() {
		return alternativaCorretaB;
	}
	
	public void setAlternativaCorretaB(char alternativaCorretaB) {
		this.alternativaCorretaB = alternativaCorretaB;
	}
	
	public char getAlternativaCorretaC() {
		return alternativaCorretaC;
	}

	public void setAlternativaCorretaC(char alternativaCorretaC) {
		this.alternativaCorretaC = alternativaCorretaC;
	}

	public char getAlternativaMarcadaA() {
		return alternativaMarcadaA;
	}

	public char getAlternativaMarcadaB() {
		return alternativaMarcadaB;
	}

	public char getAlternativaMarcadaC() {
		return alternativaMarcadaC;
	}

}

