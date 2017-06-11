import java.io.Console;
import java.util.HashSet;
import java.util.Set;

public class App {
  // Back-end logic
  public static Set<String> permutationOfString(String inputtedString) {
		Set<String> permutatedInput = new HashSet<String>();
		if (inputtedString == null) {
			return null;
		} else if (inputtedString.length() == 0) {
			permutatedInput.add("");
			return permutatedInput;
		}
  }

  // Front-end logic
  public static void main(String[] args) {
    Console console = System.console();
    System.out.println("Please enter a string.");
    String userInput = console.readLine();
		System.out.println("\nString " + userInput + ":\nPermutations: " + permutationOfString(userInput));
  }
}
