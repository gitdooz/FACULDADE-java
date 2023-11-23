package AttMe;

public abstract class QuestaoObjetiva implements IQuestao {
	
	private int idQuestao;
	private String enunciado;
	private String alternativaA;
	private String alternativaB;
	private String alternativaC;
	private double pontoMatriz;
	protected double pontosObtidos;
	
	public QuestaoObjetiva(int idQuestao, String enunciado, String alternativaA, String alternativaB,String alternativaC, double pontoMatriz){

		this.idQuestao = idQuestao;
		this.enunciado = enunciado;
		this.alternativaA = alternativaA;
		this.alternativaB = alternativaB;
		this.alternativaC = alternativaC;
		this.pontoMatriz = pontoMatriz;
	}

	public int getIdQuestao() {
		return idQuestao;
	}

	public void setIdQuestao(int idQuestao) {
		this.idQuestao = idQuestao;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getAlternativaA() {
		return alternativaA;
	}

	public void setAlternativaA(String alternativaA) {
		this.alternativaA = alternativaA;
	}

	public String getAlternativaB() {
		return alternativaB;
	}

	public void setAlternativaB(String alternativaB) {
		this.alternativaB = alternativaB;
	}

	public String getAlternativaC() {
		return alternativaC;
	}

	public void setAlternativaC(String alternativaC) {
		this.alternativaC = alternativaC;
	}

	public double getPontoMatriz() {
		return pontoMatriz;
	}

	public void setPontoMatriz(double pontoMatriz) {
		this.pontoMatriz = pontoMatriz;
	}

	public double getPontosObtidos() {
		return pontosObtidos;
	}

	public void setPontosObtidos(double pontosObtidos) {
		this.pontosObtidos = pontosObtidos;
	}
	
	
}
