package com.mr.alice;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestDivisor {
	
	@Test
	public void check() {
		List<Integer> list = new ArrayList(Arrays.asList(2,5));
		assertEquals(list, Divisor.findDivisors(10));
		//assertEquals(1,Divisor.findDivisors(0));
	}
	
}
