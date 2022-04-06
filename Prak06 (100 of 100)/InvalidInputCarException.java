public class InvalidInputCarException extends java.lang.Exception {
	private int input;
	public InvalidInputCarException(int input) {
		this.input = input;
	}
	public String getMessage() {
		return ("Input " + this.input + " diluar range");
	}
}
