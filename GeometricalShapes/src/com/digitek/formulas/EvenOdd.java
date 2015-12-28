package com.digitek.formulas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);         //calls scanner class to take input from user keyboard
		System.out.println("enter the number:");  //prompts the user to enter a number
		int input=s.nextInt();                    //stores the number entered by the user into the variable input
		
		evenNumbers(input);  //calls the method evenNumbers
		System.out.println();  
		oddNumbers(input);  //calls the method oddNumbers
	}
	public static ArrayList<Integer> evenNumbers(int n){   //method to find odd numbers with return type arrayList
		System.out.println("The even numbers are"+" ");
		List<Integer> myList = new ArrayList<Integer>();    //initializing a integer arrayList
		for(int i=1;i<=n;i++){ //for loop to iterate the i value from 1 to n
			if(i%2==0){			   //if statement to check if number is even
				myList.add(i);  //if the statement is true it will add the value i to the list myList
			}
		}
		System.out.println(myList);		//it will print the elements in myList
		return (ArrayList<Integer>) myList;  //gives myList as the return type when this method is called
	
	}
	public static ArrayList<Integer> oddNumbers(int n){  //method to find odd numbers with return type arrayList
		System.out.println("The odd numbers are"+" ");
		List<Integer> myList = new ArrayList<Integer>();  //initializing a integer arrayList
		for(int i=1;i<=n;i++){    //for loop to iterate the i value from 1 to n
			if(i%2==1){            //if statement to check if number is odd
				myList.add(i);  //if the statement is true it will add the value i to the list myList
			}
		
	}
		System.out.println(myList);	//it will print the elements in myList
		return (ArrayList<Integer>) myList; //gives myList as the return type when this method is called
}
	
}