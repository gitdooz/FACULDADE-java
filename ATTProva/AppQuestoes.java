package AttMe;

import java.util.Scanner;

public class AppQuestoes {
	static Scanner input = new Scanner(System.in);

	static QuestaoMultiplaEscolha questaoME = null;
	static QuestaoVerdadeiroFalso questaoVF = null;
	static QuestaoProporcional questaoRP = null;

	public static void main(String[] args) {
		int opcao = 0;
		do {
			System.out.println("\n*** Seletor de Opções ***\n");
			System.out.println("1 - Inserir questão de múltipla escolha");
			System.out.println("2 - Inserir questão de verdadeiro ou falso");
			System.out.println("3 - Inserir questão de resposta proporcional");
			System.out.println("4 - Marcar a questão de múltipla escolha");
			System.out.println("5 - Marcar a questão de verdadeiro ou falso");
			System.out.println("6 - Marcar a questão de resposta proporcional");			
			System.out.println("0 - Finalizar");
			System.out.print("\nOpção: ");
			opcao = input.nextInt();
			switch (opcao) {
			case 1: 
				inserirQuestaoME();
				break;
			case 2: 
				inserirQuestaoVF();
				break;
			case 3: 
				inserirQuestaoRP();
				break;
			case 4: 
				marcarQuestaoME();
				break;
			case 5: 
				marcarQuestaoVF();
				break;
			case 6: 
				marcarQuestaoRP();
				break;
			case 0: 
				break;
			default:
				System.out.println("Opção inválida");
			}
			if (opcao == 0) {
				break;
			}
		} while (true);
		System.out.println("Programa finalizado");
		input.close();
	}
	
	public static void inserirQuestaoME() {
		if (questaoME != null) {
			System.out.println("--- Questão de Múltipla Escolha já criada ---");
			return;
		}
		
		System.out.println("\n*** Cadastrar Questão de Múltipla Escolha ***\n");
		System.out.print("Enunciado da questão: ");
		String enunciado = input.nextLine(); 
		
		System.out.print("Alternativa A: ");
		String alternativaA = input.nextLine();
		
		System.out.print("Alternativa B: ");
		String alternativaB = input.nextLine();
		
		System.out.print("Alternativa C: ");
		String alternativaC = input.nextLine();
		
		System.out.print("Quantidade de pontos da Questão: ");
		double pontosMatriz = input.nextDouble();
		
		System.out.print("Alternativa Correta: ");
		char alternativaCorreta = input.nextLine().charAt(0);
		
		questaoME = new QuestaoMultiplaEscolha(enunciado, alternativaA, alternativaB, alternativaC, pontosMatriz, alternativaCorreta);
		System.out.println("\n--- Questão Cadastrada ---\n");
	}
	
	public static void inserirQuestaoVF() {
		if (questaoVF != null) {
			System.out.println("--- Questão de Verdadeiro ou Falso já criada ---");
			return;
		}
		
		System.out.println("\n*** Cadastrar Questão de Verdadeiro ou Falso ***\n");
		System.out.print("Enunciado da questão: ");
		String enunciado = input.nextLine(); 
		
		System.out.print("Alternativa A: ");
		String alternativaA = input.nextLine();
		
		System.out.print("Alternativa B: ");
		String alternativaB = input.nextLine();
		
		System.out.print("Alternativa C: ");
		String alternativaC = input.nextLine();
		
		System.out.print("Alternativa correta A: ");
		char alternativaCorretaA = input.nextLine().charAt(0);
		
		System.out.print("Alternativa correta B: ");
		char alternativaCorretaB = input.nextLine().charAt(0);
		
		System.out.print("Alternativa correta C: ");
		char alternativaCorretaC = input.nextLine().charAt(0);
		
		System.out.print("Quantidade de pontos da Questão: ");
		double pontosMatriz = input.nextDouble();
	
		questaoVF = new QuestaoVerdadeiroFalso(enunciado, alternativaA, alternativaB, alternativaC, alternativaCorretaA, alternativaCorretaB, alternativaCorretaC, pontosMatriz);
		System.out.println("\n--- Questão Cadastrada ---\n");
	}

	public static void inserirQuestaoRP() {
		System.out.println("\n*** Cadastrar Questão de Resposta Proporcional ***\n");
		System.out.print("Enunciado da questão: ");
		String enunciado = input.nextLine(); 
		
		System.out.print("Alternativa A: ");
		String alternativaA = input.nextLine();
		
		System.out.print("Alternativa B: ");
		String alternativaB = input.nextLine();
		
		System.out.print("Alternativa C: ");
		String alternativaC = input.nextLine();
		
		System.out.print("Quantidade de pontos da Questão: ");
		double pontosMatriz = input.nextDouble();
		
		questaoRP = new QuestaoProporcional(enunciado, alternativaA, alternativaB, alternativaC, pontosMatriz);
		System.out.println("\n--- Questão Cadastrada ---\n");
	}
	
	public static void marcarQuestaoME() {
		/*
		 Criticar se a questão já foi criada. Se não, informar e retornar ao menu.
		 Mostrar a questão
		 Receber apenas as letras A, B ou C correspondente a alternativa considera como correta
		 Marca a questão
		 Calcular e mostrar a pontuação obtida.
		*/
	}	

	public static void marcarQuestaoVF() {
		/*
		 Criticar se a questão já foi criada. Se não, informar e retornar ao menu.
		 Mostrar a questão
		 Receber apenas as letras V ou F para cada alternativa
		 Marca a questão
		 Calcular e mostrar a pontuação obtida.
		*/
	}	

	public static void marcarQuestaoRP() {
		/*
		 Criticar se a questão já foi criada. Se não, informar e retornar ao menu.
		 Mostrar a questão
		 Receber apenas as letras A, B ou C correspondente a alternativa considera como correta
		 Marca a questão
		 Calcular e mostrar a pontuação obtida.
		*/
	}
}
