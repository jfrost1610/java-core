package com.core.java.ds;

public class CustomDoublyLinkedList<T> {

	private Node<T> head;

	public CustomDoublyLinkedList(T item) {
		this.head = new Node<>();
		this.head.value = item;
		this.head.prev = null;
		this.head.next = null;
	}

	public boolean insertInFront(T item) {

		Node<T> n = new Node<>();
		n.value = item;
		n.prev = null;
		this.head.prev = n;
		n.next = this.head;
		this.head = n;

		return true;

	}

	public boolean insertInRear(T item) {

		Node<T> n = new Node<>();
		n.value = item;
		n.next = null;

		Node<T> last = this.head;
		while (last.next != null) {
			last = last.next;
		}

		last.next = n;
		n.prev = last;

		return true;

	}

	public boolean delete(T item) {

		if (item.equals(this.head.value)) {
			this.head = this.head.next;
			this.head.prev = null;
			return true;
		}

		Node<T> current = this.head.next;
		Node<T> prev = this.head;
		Node<T> next = current.next;

		while (next != null) {
			if (!item.equals(current.value)) {
				prev = current;
				current = next;
				next = next.next;
			} else {
				break;
			}
		}

		if (next != null) {
			prev.next = current.next;
			next.prev = current.prev;
			return true;
		} else if (item.equals(current.value)) {
			prev.next = null;
			return true;
		} else {
			return false;
		}
	}

	public void printAll() {

		Node<T> x = this.head;

		while (x != null) {
			System.out.println(x.value);
			x = x.next;
		}

	}

	class Node<E> {
		private E value;
		private Node<E> next;
		private Node<E> prev;
	}

}
