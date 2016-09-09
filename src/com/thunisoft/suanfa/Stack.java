package com.thunisoft.suanfa;

public class Stack {

	Object[] data;
	int maxSize;
	int top;

	public Stack(int maxSize) {
		this.maxSize = maxSize;
		data = new Object[maxSize];
		top = -1;
	}


	public int getSize() {
		return maxSize;
	}


	public int getElementCount() {
		return top+1;
	}


	public boolean isEmpty() {
		return top == -1;
	}


	public boolean isFull() {
		return top + 1 == maxSize;
	}


	public boolean push(Object data) {
		if (isFull()) {
			System.out.println("栈已满!");
			return false;
		}
		this.data[++top] = data;
		return true;
	}


	public Object pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("栈已空!");
		}
		return this.data[top--];
	}

	public Object peek() {
		return this.data[top];
	}

	public static void main(String[] args) throws Exception {
		Stack stack = new Stack(1000);
		stack.push(new String("1"));
		System.out.println("~~~~~"+stack.getElementCount());
		stack.push(new String("2"));
		stack.push(new String("3"));
		stack.push(new String("4"));
		stack.push(new String("5"));
		System.out.println(stack.peek());

		while (stack.top >= 0) {
			System.out.println(stack.pop());
		}
	}
}