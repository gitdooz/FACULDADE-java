package questoes;

public abstract class QuestaoObjetiva implements IQuestoes{
	private static int ultimaQuestao = 0;

	private int idQuestao;
	private String enunciado;
	private String alternativaA;
	private String alternativaB;
	private String alternativaC;
	private double pontoMatriz;
	protected double pontosObtidos;
	
	public QuestaoObjetiva(int idQuestao, String enunciado, String alternativaA, 
			String alternativaB,String alternativaC, double pontoMatriz, double pontosObtidos){

		this.idQuestao = ultimaQuestao ++;
		this.enunciado = enunciado;
		this.alternativaA = alternativaA;
		this.alternativaB = alternativaB;
		this.alternativaC = alternativaC;
		this.pontoMatriz = pontoMatriz;
		this.pontosObtidos = pontosObtidos;
	}
	
    public static int getUltimaQuestao() {
		return ultimaQuestao;
	}

	public static void setUltimaQuestao(int ultimaQuestao) {
		QuestaoObjetiva.ultimaQuestao = ultimaQuestao;
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

	public int getIdQuestao() {
		return idQuestao;
	}

	public double getPontosObtidos() {
        return pontosObtidos;
    }

	
}
