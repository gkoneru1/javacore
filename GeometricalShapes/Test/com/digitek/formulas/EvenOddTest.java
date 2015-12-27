package com.digitek.formulas;

import  junit.framework.Assert;
import org.junit.Test;

public class EvenOddTest {
    @Test    
	public void testevenNumbers(){
    	EvenOdd eo= new EvenOdd();
    	int evennum= eo.evenNumbers(10);
    	Assert.assertEquals(10, evennum);
		
	}
   public void testoddNumbers(){
	   EvenOdd eo= new EvenOdd();
	   int oddnum= eo.oddNumbers(9);
	   Assert.assertEquals(81, oddnum);
   }
}
