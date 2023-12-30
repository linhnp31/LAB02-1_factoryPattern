package factoryPattern;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		System.out.println("Enter your choice of ice cream");
		System.out.println("1-Vanilla,\n2-Chocolate,\n3-Exit");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine();
		System.out.println("\nEnter your choice of toppings");
		String topping = scanner.nextLine();
		
		iceCream icream = null;
		while(!choice.equalsIgnoreCase("3")) {
			icream = IceCreamFactory.makeIceCream(choice);
			icream.setToppings(topping);
			icream.prepare();
			
			System.out.println("\nEnter your choice of ice cream again:");
			choice = scanner.nextLine();
			if(!choice.equalsIgnoreCase("3")) {
				System.out.println("Enter your choice of topping:");
				topping = scanner.nextLine();
			}
		}
		System.out.println("\nThank you!!!");
	}
}
