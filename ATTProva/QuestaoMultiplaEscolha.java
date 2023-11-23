package questoes;

public class QuestaoMultiplaEscolha extends QuestoesObjetivas {
	private char alternativaCorreta;
	private char alternativaMarcada;
	
	public QuestaoMultiplaEscolha(int idQuestao, String enunciado, String alternativaA, String alternativaB, String alternativaC,double pontosMatriz, char alternativaCorreta) 
	{ super(idQuestao, enunciado, alternativaA, alternativaB, alternativaC, pontosMatriz, pontosMatriz);
	
	this.alternativaCorreta = alternativaMarcada;
	}

	 public void marcarAlternativa(char alternativaMarcada) {
	        this.alternativaMarcada = alternativaMarcada;
	        super.pontosObtidos = calcularPontosObtidos();
	    }
	 

	public double calcularPontosObtidos() {
		if (alternativaMarcada == alternativaCorreta) {
            return super.getPontoMatriz();
        } else {
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
