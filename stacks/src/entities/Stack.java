package entities;

public class Stack {

	Integer[] stack = new Integer[5];
	Integer top = -1;

	public void push(Integer data) {
		if (top == stack.length - 1) {
			System.out.println("The stack is full.");
		} else {
			top++;
			stack[top] = data;
		}

	}

	public Integer pop() {
		if (isEmpty()) {
			System.out.println("The stack is empty.");
			return null;
		} else {
			Integer data;
			data = stack[top];
			stack[top] = null;
			top--;
			return data;
		}

	}

	public Integer peek() {
		if (isEmpty()) {
			System.out.println("There is no peek.");
			return null;
		} else {
			Integer data;
			data = stack[top];
			return data;
		}
	}

	public Integer size() {
		return top + 1;
	}

	public Boolean isEmpty() {
		if (top < 0) {
			return true;
		}
		return false;
	}

	public void show() {
		for (Integer number : stack) {
			System.out.println(number + " ");
		}
	}

}
