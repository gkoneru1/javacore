package com.digitek.formulas;

public class Rectangle {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area();
		perimeter();
	}
	
	public static void area(){
		int l= 25;
		int w= 20;
		int area= l*w;
			
			System.out.println("area of Rectangle is"+" "+area);
		}
		
	
	public static void perimeter(){
		double l= 25.5;
		double w= 20.3;
		double perimeter= 2*l+2*w;
			System.out.println("perimeter of Rectangle is"+" "+perimeter);
		}

}


