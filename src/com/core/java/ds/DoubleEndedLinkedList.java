package com.core.java.ds;

public class DoubleEndedLinkedList<T> {

	private Node<T> head;
	private Node<T> tail;

	public DoubleEndedLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public DoubleEndedLinkedList(T item) {

		Node<T> n = new Node<>();
		n.val = item;
		n.next = null;

		this.head = n;
		this.tail = n;
	}

	public boolean insertInFront(T item) {

		Node<T> n = new Node<>();
		n.val = item;

		if (isEmpty()) {
			n.next = null;
			this.head = n;
			this.tail = n;
			return true;
		}

		n.next = this.head;
		this.head = n;
		return true;

	}

	public boolean insertInRear(T item) {

		Node<T> n = new Node<>();
		n.val = item;
		n.next = null;

		if (isEmpty()) {
			this.head = n;
			this.tail = n;
			return true;
		}

		this.tail.next = n;
		this.tail = n;
		return true;

	}

	public void printAll() {
		Node<T> x = this.head;
		while (x != null) {
			System.out.println(x.val);
			x = x.next;
		}
	}

	private boolean isEmpty() {
		return head == null;
	}

	public Node<T> getHead() {
		return head;
	}

	public Node<T> getTail() {
		return tail;
	}

	public class Node<E> {

		private E val;
		private Node<E> next;

		public E getVal() {
			return val;
		}

		public Node<E> getNext() {
			return next;
		}

	}

}
