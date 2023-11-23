package AttMe;


	public class QuestaoProporcional extends QuestaoObjetiva {
		private static int ultimaQuestao = 0;
		private double alternativaPesoA;
		private double alternativaPesoB;
		private double alternativaPesoC;
		private double alternativaMarcadaPeso;



		public QuestaoProporcional(String enunciado, String alternativaA, String alternativaB,
				String alternativaC, double pontoMatriz, double pontosObtidos,double alternativaPesoA,
				double alternativaPesoB, double alternativaPesoC , double alternativaMarcadaPeso ){
			super(++ultimaQuestao, enunciado, alternativaA, alternativaB, alternativaC, pontoMatriz, pontosObtidos);
			
			this.alternativaPesoA =alternativaPesoA;
			this.alternativaPesoB =alternativaPesoB;
			this.alternativaPesoC =alternativaPesoC;

		}

		public void marcaAlternativa(char alternativaMarcada) {
	        this.alternativaMarcadaPeso = alternativaMarcada;
	        super.pontosObtidos = calculaPontosObtidos();
	    } 


		@Override
		public double calculaPontosObtidos() {
			
			if(alternativaMarcadaPeso == 'A') {
				return super.getPontoMatriz() * alternativaPesoA;
			}

			else if(alternativaMarcadaPeso == 'B') {
				return super.getPontoMatriz() * alternativaPesoB;
			}

			else{
				return super.getPontoMatriz() * alternativaPesoC;

			}
		}

		public double getAlternativaPesoA() {
			return alternativaPesoA;
		}



		public void setAlternativaPesoA(double alternativaPesoA) {
			this.alternativaPesoA = alternativaPesoA;
		}

		public double getAlternativaPesoB() {
			return alternativaPesoB;
		}

		public void setAlternativaPesoB(double alternativaPesoB) {
			this.alternativaPesoB = alternativaPesoB;
		}


		public double getAlternativaPesoC() {
			return alternativaPesoC;
		}

		public void setAlternativaPesoC(double alternativaPesoC) {
			this.alternativaPesoC = alternativaPesoC;
		}



		public double getAlternativaMarcadaPeso() {
			return alternativaMarcadaPeso;
		}


}
