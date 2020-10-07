package kr.itedu.ex10.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import kr.itedu.ex10.Calc;

class CalcTest {

	@Test
	void test() {
		int n1 = 10;
		int n2 = 15;
		int result = Calc.sum(n1, n2);
		assertEquals(n1 + n2, result);
		
			n1 = 10;
			n2 = 10;
			result = Calc.sum(n1, n2);
		assertEquals(n1 + n2, result);
		
			n1 = 17;
			n2 = 24;
			result = Calc.sum(n1, n2);
		assertEquals(n1 + n2, result);
	}
}
