package com.digitek.formulas;

import junit.framework.Assert;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class OddTest {
	@Test
	public void testoddNumbers(){
    	EvenOdd eo= new EvenOdd();
    	List<Integer> myList1 = new ArrayList<Integer>();
    	List<Integer> myList2 = new ArrayList<Integer>();
    	myList1.add(1);
    	myList1.add(3);
    	myList1.add(5);
    	myList1.add(7);
    	myList1.add(9);
    	myList1.add(11);
    	 myList2= eo.oddNumbers(12);
    	Assert.assertEquals(myList1, myList2);

}
}