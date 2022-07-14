package com.bridzelabz.oops1;

public class Shape {
	  public void area() {
		    System.out.println("The formula for area of ");
		  }
		}
		class Triangle extends Shape {
		  public void area() {
		    System.out.println("Triangle is ½ * base * height ");
		  }
		}
		class Circle extends Shape {
		  public void area() {
		    System.out.println("Circle is 3.14 * radius * radius ");
		  }
		}
		class ShapeTest {
		  public static void main(String[] args) {
		    Shape sh1 = new Shape();  
		    Triangle sh2 = new Triangle();  
		    Circle cir = new Circle();  
		    sh1.area();
		    sh2.area();
		    cir.area();
		   
		  }
		}


