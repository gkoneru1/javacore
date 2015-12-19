package com.digitek.formulas;
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
	public static void evenNumbers(int n){
		System.out.println("The even numbers are"+" ");
		for(int i=1;i<=n;i++){    //for loop to iterate the i value from 1 to 50
			if(i%2==0){			   //if statement to check if number is even
				
				System.out.print(i+",");  //if the statement is true it will print the value i
			}
				
		}
	
	}
	public static void oddNumbers(int n){
		System.out.println("The odd numbers are"+" ");
		for(int i=1;i<=n;i++){    //for loop to iterate the i value from 1 to 50
			if(i%2==1){            //if statement to check if number is odd
				System.out.print(i+",");  //if the statement is true it will print the value i
			}
		
	}
}
}