package com.core.java.ds.test;

import org.junit.Assert;
import org.junit.Test;

import com.core.java.ds.CustomStack;
import com.frost.exception.CustomDSException;

public class TestStack {

	@Test
	public void testStack() throws CustomDSException {

		String val1 = "1234";
		String val2 = "235435";
		String val3 = "d";

		CustomStack<String> s = new CustomStack<>(3);
		s.push(val1);
		s.push(val2);
		s.push(val3);

		Assert.assertEquals(val3, s.pop());
		Assert.assertEquals(val2, s.pop());
		Assert.assertEquals(val1, s.pop());

	}

	@Test(expected = CustomDSException.class)
	public void testStackFull() throws CustomDSException {

		CustomStack<String> s = new CustomStack<>(3);

		s.push("1234");
		s.push("235435");
		s.push("d");
		s.push("qedasfew");
	}

	@Test(expected = CustomDSException.class)
	public void testStackEmpty() throws CustomDSException {

		CustomStack<String> s = new CustomStack<>(3);

		s.push("1234");
		s.push("235435");
		s.push("d");

		s.pop();
		s.pop();
		s.pop();
		s.pop();
	}

}
