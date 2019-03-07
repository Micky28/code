package com.mr.jtest;

import org.junit.Test;

import com.mr.jmain.Check;

import static org.junit.Assert.*;

public class TestCheck {
	@Test
	public void testOddOrEven() {
		Check check = new Check();
		assertEquals("even",check.oddOrEven(10) );
		assertFalse(check.posOrNeg(10));
		assertTrue(check.posOrNeg(-39));
	}
}
