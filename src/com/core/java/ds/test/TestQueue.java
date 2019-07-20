package com.core.java.ds.test;

import org.junit.Assert;
import org.junit.Test;

import com.core.java.ds.CustomQueue;
import com.frost.exception.CustomDSException;

public class TestQueue {

	@Test
	public void testQueue() throws CustomDSException {

		String val1 = "aqdafa";
		String val2 = "23523";
		String val3 = "acsd234";
		String val4 = "fef63";
		String val5 = "15hjkhj";

		CustomQueue<String> q = new CustomQueue<>(5);

		q.push(val1);
		q.push(val2);
		q.push(val3);
		q.push(val4);
		q.push(val5);

		Assert.assertEquals(val1, q.pop());
		Assert.assertEquals(val2, q.pop());
		Assert.assertEquals(val3, q.pop());
		Assert.assertEquals(val4, q.pop());
		Assert.assertEquals(val5, q.pop());

		q.push(val1);
		q.push(val2);
		q.push(val3);
		q.push(val4);
		q.push(val5);

		Assert.assertEquals(val1, q.pop());
		Assert.assertEquals(val2, q.pop());
		Assert.assertEquals(val3, q.pop());
		Assert.assertEquals(val4, q.pop());
		Assert.assertEquals(val5, q.pop());

	}

	@Test(expected = CustomDSException.class)
	public void testQueueFull() throws CustomDSException {

		CustomQueue<String> q = new CustomQueue<>(5);

		q.push("aqdafa");
		q.push("afss");
		q.push("34gfreh");
		q.push("sgdfs345");
		q.push("sghdf45");
		q.push("ewfdsg3453");

	}

	@Test(expected = CustomDSException.class)
	public void testQueueEmpty() throws CustomDSException {

		CustomQueue<String> q = new CustomQueue<>(3);

		q.push("aqdafa");
		q.push("afss");
		q.push("34gfreh");

		q.pop();
		q.pop();
		q.pop();
		q.pop();

	}

}
