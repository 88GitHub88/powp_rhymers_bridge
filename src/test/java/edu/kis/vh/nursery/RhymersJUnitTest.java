package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	@Test
	public void testCountIn() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		int testValue = 4;
		rhymer.countIn(testValue);

		int result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheck() {

		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		boolean result = rhymer.callCheck();
		Assert.assertEquals(true, result);

		rhymer.countIn(888);

		result = rhymer.callCheck();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertEquals(false, result);
			rhymer.countIn(888);
		}

		boolean result = rhymer.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testPeekaboo() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = rhymer.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);

	}

	@Test
	public void testCountOut() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}



	@Test
	public void testFIFOCountOut() {
		FIFORhymer rhymer = new FIFORhymer();
		final int EMPTY_STACK_VALUE = -1;




		int testValue = 4;
		rhymer.countIn(testValue);

		int result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}


	@Test
	public void testHanoiCountIn() {
		HanoiRhymer hanoiRhymer = new HanoiRhymer();
		int testValue = 4;
		hanoiRhymer.countIn(testValue);

		int result = hanoiRhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testPushIntLinkedList() {
		IntLinkedList intLinkedList = new IntLinkedList();
		int testValue = 4;
		intLinkedList.push(testValue);

		Assert.assertEquals(testValue, intLinkedList.top());
	}

	@Test
	public void testIsEmptyIntLinkedList() {
		IntLinkedList intLinkedList = new IntLinkedList();

		Assert.assertTrue(intLinkedList.isEmpty());
	}

	@Test
	public void testIsFullIntLinkedList() {
		IntLinkedList intLinkedList = new IntLinkedList();

		Assert.assertFalse(intLinkedList.isFull());
	}

	@Test
	public void testTopIntLinkedList() {
		IntLinkedList intLinkedList = new IntLinkedList();
		int testValue = 4;
		intLinkedList.push(testValue);

		Assert.assertEquals(testValue, intLinkedList.top());
	}

	@Test
	public void testPopIntLinkedList() {
		IntLinkedList intLinkedList = new IntLinkedList();
		int testValue = 4;
		int testValue1 = 7;
		intLinkedList.push(testValue);
		intLinkedList.push(testValue1);
		intLinkedList.pop();


		Assert.assertEquals(testValue, intLinkedList.top());
	}


}


