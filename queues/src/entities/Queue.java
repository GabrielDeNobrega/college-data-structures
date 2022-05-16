package entities;

public class Queue {

	private Integer arrayAux = 10;
	private Integer[] queue = new Integer[arrayAux];
	private Integer size = 0;
	private Integer front = 0;
	private Integer rear = 0;

	public void enQueue(Integer data) {
		if (!isFull()) {
			queue[rear] = data;
			rear = (rear + 1) % arrayAux;
			size++;
		} else {
			System.out.println("The queue is full!");
		}

	}

	public Integer deQueue() {
		Integer data = queue[front];
		if (!isEmpty()) {
			front = (front + 1) % arrayAux;
			size--;
		}else {
			System.out.println("The queue is empty!");
		}
		return data;
	}

	public Integer getSize() {
		return size;
	}

	public Boolean isEmpty() {
		return getSize() == 0;
	}

	public Boolean isFull() {
		return getSize() == arrayAux;
	}

	public void show() {
		System.out.print("Elements: ");
		for (int i = 0; i < size; i++) {
			System.out.print(queue[(front + i) % arrayAux] + " ");
		}
	}

}
