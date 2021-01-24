package utility;

// Type your code
public class StringMethod {
	String input;
	
	public String toLower(String input) {
		return input.toLowerCase();
	}
	public String toUpper(String input) {
		return input.toUpperCase();
	}
	public String firstChar(String input) {
		return Character.toString(input.charAt(0));
	}
	public String length(String input) {
		return String.valueOf(input.length());
	}
	public String trim(String input) {
		return input.trim();
	}
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}	
}
