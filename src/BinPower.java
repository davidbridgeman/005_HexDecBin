import java.util.Scanner;

public class BinPower {
	
	Scanner input = new Scanner(System.in);
	
	public BinPower() {
		
	}
	
	public void setBinary() {
		
		double exp = 2;
		double base;
		int ans = 0;
		double answer;
		String name = "";
		
		System.out.println("Hello Java student! What is your name?");
		name = input.nextLine();
		System.out.println("Thanks for using my program, " + name + "!");
		
		System.out.println(name + ", what base number do you want to enter?");
		base = input.nextDouble();
		System.out.println(name + ", you entered " + base);
		
		System.out.println(name + ", what binary exponent do you want to enter?");
		exp = input.nextDouble();
		System.out.println(name + ", you entered " + exp);
		
		ans = (int) Math.pow(base, exp);
		System.out.println("Answer is: " + ans);
		
	}

}
