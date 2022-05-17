package entities;

import java.util.Scanner;

public class LinkedList {

	Node head;

	public void insert(Integer data) {
		Node node = new Node();
		node.setData(data);

		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.getNext() != null) {
				n = n.getNext();
			}

			n.setNext(node);
		}
	}

	public void insertAtStart(Integer data) {
		Node node = new Node();
		node.setData(data);

		node.setNext(head);

		head = node;
	}

	public void insertAt(Integer index, Integer data, Scanner sc) {
		Integer nOfElements = countElements();
		Node node = new Node();
		node.setData(data);

		if (index == 0) {
			insertAtStart(node.getData());
		} else {

			// criar count para limitar até onde o for vai rodar

			if (head != null && index > 0 && index <= nOfElements) {
				Node n = head;
				for (int i = 0; i < index - 1; i++) {
					n = n.getNext();
				}

				if (n.getNext() != null) {
					node.setNext(n.getNext());
					n.setNext(node);
				} else {
					System.out.println("The index doesn't exist on the list!");
					sc.nextLine();
				}

			} else {
				System.out.println("The list has no head node or the index is out of bounds!");
				sc.nextLine();
			}
		}
	}

	public void deleteAt(Integer index, Scanner sc) {

		if (head == null) {
			System.out.println("This index doesn't exist in the list!");
			sc.nextLine();
		} else if (index == 0 && head != null) {
			head = head.getNext();
		} else if (index != 0) {
			Node n = head;
			Node deletedN = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.getNext();
			}

			if (n.getNext() != null) {
				deletedN = n.getNext();
				n.setNext(deletedN.getNext());
				System.out.println("Delete value: " + deletedN.getData());
				deletedN = null;
			} else {
				System.out.println("There's no node to be delete at chosen index!");
			}
		}
	}

	public Integer countElements() {

		Integer count = 0;
		Node n = head;

		if (n != null) {

			while (n.getNext() != null) {
				n = n.getNext();
				count++;
			}

		}

		return count;

	}

	public void show() {
		Node node = head;

		if (node == null) {
			System.out.println("The list is empty!");
		} else {

			System.out.print("List Elements: ");

			while (node.getNext() != null) {
				System.out.print("[" + node.getData() + "] ");
				node = node.getNext();

			}
			System.out.println("[" + node.getData() + "] ");
		}
	}
}
