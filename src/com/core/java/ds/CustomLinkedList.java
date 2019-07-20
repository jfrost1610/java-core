package com.core.java.ds;

public class CustomLinkedList<T> {

	private Node<T> head;

	public CustomLinkedList() {
		this.head = null;
	}

	public CustomLinkedList(T item) {

		Node<T> n = new Node<>();
		n.val = item;
		n.next = null;

		this.head = n;

	}

	public boolean insertInFront(T item) {

		Node<T> n = new Node<>();
		n.val = item;

		if (this.head == null) {
			n.next = null;
			this.head = n;
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

		if (this.head == null) {
			this.head = n;
			return true;
		}

		Node<T> x = this.head;
		while (x.next != null) {
			x = x.next;
		}

		x.next = n;
		return true;
	}

	public boolean delete(T item) {

		if (item.equals(this.head.val)) {
			this.head = this.head.next;
			return true;
		}

		Node<T> x = this.head;
		Node<T> y = this.head.next;

		while (y != null) {
			if (item.equals(y.val)) {
				break;
			} else {
				x = x.next;
				y = y.next;
			}
		}

		if (y != null) {
			x.next = y.next;
			return true;
		} else {
			return false;
		}
	}

	public void printAll() {
		Node<T> x = this.head;
		while (x != null) {
			System.out.println(x.val);
			x = x.next;
		}
	}

	public Node<T> getHead() {
		return head;
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
