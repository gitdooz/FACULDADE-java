package questoes;

public class QuestaoVerdadeiroFalso extends QuestoesObjetivas {


	private char alternativaCorretaA;
	private char alternativaCorretaB;
	private char alternativaCorretaC;
	private char alternativaMarcadaA;
	private char alternativaMarcadaB;
	private char alternativaMarcadaC;
	
	public QuestaoVerdadeiroFalso(int idQuestao, String enunciado, String alternativaA, String alternativaB,
			String alternativaC, double pontoMatriz, double pontosObtidos) {
		super(idQuestao, enunciado, alternativaA, alternativaB, alternativaC, pontoMatriz, pontosObtidos);
	
	}
	@Override
	public double calcularPontosObtidos() {
		// TODO Auto-generated method stub
		return 0;
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
