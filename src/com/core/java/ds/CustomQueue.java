package com.core.java.ds;

import com.frost.exception.CustomDSException;

public class CustomQueue<T> {

	private Object[] q;
	private int front;
	private int rear;
	private int total;
	private int size;

	public CustomQueue() {
		this.front = 0;
		this.rear = 0;
		this.total = 0;
		this.size = 50;
		this.q = new Object[this.size];
	}

	public CustomQueue(int size) {
		this.front = 0;
		this.rear = 0;
		this.total = 0;
		this.size = size;
		this.q = new Object[this.size];
	}

	public boolean push(T item) throws CustomDSException {
		if (!isFull()) {
			total++;
			q[rear] = item;
			rear = (rear + 1) % size;
			return true;
		} else {
			System.err.println("Queue is Full! Failed to add " + item);
			throw new CustomDSException("Queue is Full! Failed to add " + item);
		}
	}

	@SuppressWarnings("unchecked")
	public T pop() throws CustomDSException {
		if (!isEmpty()) {
			total--;
			T item = (T) q[front];
			front = (front + 1) % size;
			return item;
		} else {
			System.err.println("Queue is Empty!");
			throw new CustomDSException("Queue is Empty!");
		}
	}

	private boolean isEmpty() {
		return total == 0;
	}

	private boolean isFull() {
		return total == size;
	}

}
