package com.digitek.formulas;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area();
		perimeter();
	}
	
	public static void area(){
		double side= 25.5;
		
		double area= Math.pow(side, 2);
		
		System.out.println("area of square is"+" "+area);
	}
	
	public static void perimeter()
	{
		double side=25.5;
		double perimeter= side*4;
		System.out.println("perimeter of square is"+" "+perimeter);
	}
}
