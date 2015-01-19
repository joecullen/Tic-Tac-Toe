import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {

		System.out.println("hello, what is your name?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		scanner.close();
		System.out.println(name);
		
	}

}
