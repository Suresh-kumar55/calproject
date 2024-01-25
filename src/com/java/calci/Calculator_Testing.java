package com.java.calci;

import org.junit.Assert;
import org.junit.Test;


public class Calculator_Testing {
     
	@Test
	public void testSum() {
		Calculator cal =new Calculator();
		int resl = cal.add(2, 2);
		if(resl !=4) {
			Assert.fail();
		}
	}
	@Test
	public void testMinus() {
		Calculator cal =new Calculator();
		Assert.assertEquals(3,cal.sub(5, 2));
		
		}
	@Test
	public void testMulti() {
		Calculator cal =new Calculator();
		Assert.assertEquals(18,cal.mul(6, 3));
	}
	@Test
	public void testDiv() {
		Calculator cal =new Calculator();
		Assert.assertEquals(2,cal.div(6, 3));
	}	
}
