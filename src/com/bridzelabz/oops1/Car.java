package com.bridzelabz.oops1;

abstract class Car {
	 abstract void brand();
	 void accelerate() {
		 
		System.out.println("Car is accelerating");
	}
}
	class Baleno extends Car {
		void brand()
		{
			System.out.println("Brand name is Baleno");
		}
	}
	
	class Breeza extends Car {
		void brand(){
			System.out.println("Brand name is Breeza");
			}
	}
	class Main {
		public static void main(String[] args) {
			Baleno bn = new Baleno();
			bn.brand();
			bn.accelerate();
			Breeza bz = new Breeza();
			bz.brand();
			bz.accelerate();
		}
	}


