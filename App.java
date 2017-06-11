import java.io.Console;

public class App {
  // Front-end logic
  public static void main(String[] args) {
    Console console = System.console();
    System.out.println("Please enter a string.");
    String userInput = console.readLine();
		System.out.println("\nString " + userInput + ":\nPermutations: " + permutationOfString(userInput));
  }
}
