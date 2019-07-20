package com.core.java.ds.test;

import org.junit.Assert;
import org.junit.Test;

import com.core.java.ds.CustomLinkedList;
import com.core.java.ds.DoubleEndedLinkedList;

public class TestLinkedList {

	@Test
	public void testLinkedList() {

		String val1 = "vadsjdvahjdasdbhasd";
		String val2 = "2342424";
		String val3 = "wevfsgvdf";
		String val4 = "sfsdfsfdsdssdf";
		String val5 = "sdffsfsf";
		String val6 = "123423453456";

		CustomLinkedList<String> ll = new CustomLinkedList<>(val1);
		ll.insertInRear(val2);
		ll.insertInFront(val3);
		ll.insertInFront(val4);
		ll.insertInFront(val5);
		ll.insertInRear(val6);

		ll.printAll();

		CustomLinkedList<String>.Node<String> currentNode = ll.getHead();

		Assert.assertEquals(val5, currentNode.getVal());
		currentNode = currentNode.getNext();

		Assert.assertEquals(val4, currentNode.getVal());
		currentNode = currentNode.getNext();

		Assert.assertEquals(val3, currentNode.getVal());
		currentNode = currentNode.getNext();

		Assert.assertEquals(val1, currentNode.getVal());
		currentNode = currentNode.getNext();

		Assert.assertEquals(val2, currentNode.getVal());
		currentNode = currentNode.getNext();

		Assert.assertEquals(val6, currentNode.getVal());
		currentNode = currentNode.getNext();

		Assert.assertNull(currentNode);

	}

	@Test
	public void testDoublyLinkedList() {

		String val1 = "vadsjdvahjdasdbhasd";
		String val2 = "2342424";
		String val3 = "wevfsgvdf";
		String val4 = "sfsdfsfdsdssdf";
		String val5 = "sdffsfsf";
		String val6 = "123423453456";

		DoubleEndedLinkedList<String> ll = new DoubleEndedLinkedList<>(val1);
		ll.insertInRear(val2);
		ll.insertInFront(val3);
		ll.insertInFront(val4);
		ll.insertInFront(val5);
		ll.insertInRear(val6);

		ll.printAll();

		DoubleEndedLinkedList<String>.Node<String> currentNode = ll.getHead();

		Assert.assertEquals(val5, currentNode.getVal());
		currentNode = currentNode.getNext();

		Assert.assertEquals(val4, currentNode.getVal());
		currentNode = currentNode.getNext();

		Assert.assertEquals(val3, currentNode.getVal());
		currentNode = currentNode.getNext();

		Assert.assertEquals(val1, currentNode.getVal());
		currentNode = currentNode.getNext();

		Assert.assertEquals(val2, currentNode.getVal());
		currentNode = currentNode.getNext();

		Assert.assertEquals(val6, currentNode.getVal());
		currentNode = currentNode.getNext();

		Assert.assertNull(currentNode);

	}

}
