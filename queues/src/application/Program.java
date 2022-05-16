package application;

import java.util.Scanner;

import entities.Queue;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue queue = new Queue();
		Integer choice = 0;
		Integer number = null;

		while (choice != 6) {

			clearScreen();

			System.out.println("*** Menu ****");
			System.out.println("[01] - Display queue.");
			System.out.println("[02] - Enqueue.");
			System.out.println("[03] - Dequeue.");
			System.out.println("[04] - Fullness of the queue.");
			System.out.println("[05] - Display number of elements.");
			System.out.println("[06] - Exit.");

			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				queue.show();
				sc.nextLine();
				break;
			case 2:
				System.out.print("Insert a number: ");
				number = sc.nextInt();
				sc.nextLine();
				queue.enQueue(number);
				number = null;
				sc.nextLine();
				break;
			case 3:
				queue.deQueue();
				sc.nextLine();
				break;
			case 4:
				System.out.println("Is the queue empty? " + queue.isEmpty());
				sc.nextLine();
				break;
			case 5:
				System.out.println("Number of elements: " + queue.getSize());
				sc.nextLine();
				break;
			case 6:
				System.out.println("Closing the program.");
				choice = 6;
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
