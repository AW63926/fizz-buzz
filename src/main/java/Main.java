import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FizzBuzz realFizz = new FizzBuzz();
		
		System.out.println("Enter an integer");
		int userNumber = input.nextInt();
		System.out.println(realFizz.getResult(userNumber));

	}

}
