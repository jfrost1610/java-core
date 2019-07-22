package com.core.java.ds;

import java.util.Comparator;

public class CustomBinarySearchTree<T> {

	private Node<T> root;
	private Comparator<T> comparator;

	public CustomBinarySearchTree(Comparator<T> comparator) {
		this.root = null;
		this.comparator = comparator;
	}

	public void insert(T item) {

		Node<T> n = new Node<>();
		n.val = item;
		n.lc = null;
		n.rc = null;

		if (this.root == null) {
			this.root = n;
			return;
		}

		Node<T> p = this.root;
		Node<T> c = this.root;

		while (c != null) {
			p = c;
			if (comparator.compare(item, c.val) < 0) {
				c = c.lc;
			} else {
				c = c.rc;
			}
		}

		if (comparator.compare(item, p.val) < 0) {
			p.lc = n;
		} else {
			p.rc = n;
		}

	}

	public Node<T> findNode(T key) {

		Node<T> n = this.root;

		while (n != null) {
			if (comparator.compare(key, n.val) == 0) {
				break;
			} else if (comparator.compare(key, n.val) < 0) {
				n = n.lc;
			} else {
				n = n.rc;
			}
		}

		return n;
	}

	public void showAll(Node<T> p) {
		Node<T> n = p;
		while (n != null) {
			System.out.println(n.val);
			showAll(n.rc);
			showAll(n.lc);
			break;
		}
	}

	class Node<E> {

		private Node<E> lc;
		private E val;
		private Node<E> rc;

	}

}
