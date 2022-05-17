package application;

import java.util.Scanner;

import entities.LinkedList;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		Integer choice = 0;
		Integer number = null;
		Integer index = null;

		while (choice != 6) {

			clearScreen();

			System.out.println("*** Menu ****");
			System.out.println("[01] - Display linked list.");
			System.out.println("[02] - Insert node at the start.");
			System.out.println("[03] - Insert node at the end.");
			System.out.println("[04] - Insert node at specific index.");
			System.out.println("[05] - Delete node at specific index.");
			System.out.println("[06] - Exit.");

			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				list.show();
				sc.nextLine();
				break;
			case 2:
				System.out.print("Insert a number: ");
				number = sc.nextInt();
				sc.nextLine();
				list.insertAtStart(number);
				number = null;
				sc.nextLine();
				break;
			case 3:
				System.out.print("Insert a number: ");
				number = sc.nextInt();
				sc.nextLine();
				list.insert(number);
				number = null;
				sc.nextLine();
				break;
			case 4:
				System.out.print("Where do you want a new node (index)? ");
				index = sc.nextInt();
				System.out.print("Insert a number: ");
				number = sc.nextInt();
				list.insertAt(index, number, sc);
				number = null;
				index = null;
				sc.nextLine();
				break;
			case 5:
				System.out.print("What is the index you wish to delete? ");
				index = sc.nextInt();
				list.deleteAt(index, sc);
				index = null;
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
