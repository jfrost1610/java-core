package com.core.java.ds;

import com.frost.exception.CustomDSException;

public class CustomStack<T> {

	private Object[] s;
	private int top;
	private int size;

	public CustomStack() {
		this.top = -1;
		this.size = 50;
		this.s = new Object[this.size];
	}

	public CustomStack(int size) {
		this.top = -1;
		this.size = size;
		this.s = new Object[this.size];
	}

	public boolean push(T item) throws CustomDSException {
		if (!isFull()) {
			s[++top] = item;
			return true;
		} else {
			System.err.println("Stack is Full! Failed to push " + item);
			throw new CustomDSException("Stack is Full! Failed to push " + item);
		}
	}

	@SuppressWarnings("unchecked")
	public T pop() throws CustomDSException {
		if (!isEmpty()) {
			return (T) s[top--];
		} else {
			System.err.println("Stack is Empty!");
			throw new CustomDSException("Stack is Empty!");
		}

	}

	private boolean isEmpty() {
		return top == -1;
	}

	private boolean isFull() {
		return top == size - 1;
	}

}
