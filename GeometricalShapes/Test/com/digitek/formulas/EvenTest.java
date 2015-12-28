package com.digitek.formulas;

import  junit.framework.Assert;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class EvenTest {
    @Test    
	public void testevenNumbers(){
    	EvenOdd eo= new EvenOdd();
    	List<Integer> myList1 = new ArrayList<Integer>();  //creates an integer arrayList called myList1
    	List<Integer> myList2 = new ArrayList<Integer>();  //creates an integer arrayList called myList2
    	myList1.add(2);  //adding values to the arrayList1
    	myList1.add(4);
    	myList1.add(6);
    	myList1.add(8);
    	myList1.add(10);
    	myList2= eo.evenNumbers(10);  //reads the list returned by the evenNumbers method in the arraList variable mylist2
    	Assert.assertEquals(myList1, myList2); //checks to see if the expected and the actual lists match
		
	}
  
}
