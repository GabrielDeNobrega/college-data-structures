package application;

import java.util.Scanner;

import entities.Stack;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack();
		Integer choice = 0;
		Integer number = null;

		while (choice != 7) {

			clearScreen();

			System.out.println("*** Menu ****");
			System.out.println("[01] - Display stack.");
			System.out.println("[02] - Push stack.");
			System.out.println("[03] - Pop stack.");
			System.out.println("[04] - Peek stack.");
			System.out.println("[05] - Fullness of the stack.");
			System.out.println("[06] - Display number of elements.");
			System.out.println("[07] - Exit.");

			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				stack.show();
				sc.nextLine();
				break;
			case 2:
				System.out.print("Insert a number: ");
				number = sc.nextInt();
				sc.nextLine();
				stack.push(number);
				number = null;
				sc.nextLine();
				break;
			case 3:
				stack.pop();
				sc.nextLine();
				break;
			case 4:
				System.out.println(stack.peek());
				sc.nextLine();
				break;
			case 5:
				System.out.println("Is the stack empty? " + stack.isEmpty());
				sc.nextLine();
				break;
			case 6:
				System.out.println(stack.size());
				sc.nextLine();
				break;
			case 7:
				System.out.println("Closing the program.");
				choice = 7;
				break;
			default:
				System.out.println("Choose a valid option.");
				sc.nextLine();
				break;
			}

		}

		sc.close();

	}

	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

}
