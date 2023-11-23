package AttMe;

public class AnswerDoesNotExist extends Exception{
	@Override
	public String getMessage() {
		return "Esta resposta não existe";
	}
}
