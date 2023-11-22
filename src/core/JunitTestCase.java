package core;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

class JunitTestCase {
	@Test 
	public void testPushElementToTop() {
		JStack s1 = new JStack();
		s1.pushEleToTop(1);
		s1.pushEleToTop(2);
		s1.pushEleToTop(3);
		
		assertEquals(3, s1.topStack());
	}
	
	@Test
	public void testLastInFirstOut() {
		JStack s1 = new JStack();
		
		s1.pushEleToTop(1);
		s1.pushEleToTop(2);
		s1.pushEleToTop(3);
		
		assertEquals(3, s1.popEleFromTop());
		assertEquals(2, s1.popEleFromTop());
		assertEquals(1, s1.popEleFromTop());	
	}
	
	@Test
	public void testPushElmToLimitSizeStack() {
		JStack s1 = new JStack();
		
		for (int i = 0; i < 20; i++) {
			s1.pushEleToTop(i);
		}

		assertEquals(10 , s1.getSize());
		assertEquals(true, s1.isFull());
	}
}
