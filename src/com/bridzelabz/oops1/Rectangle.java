package com.bridzelabz.oops1;
class Rectangle
{
 int length;
 int breadth;
 public Rectangle(int p, int q)
 {
 length=p;
 breadth=q;
}
 	int area()
 	{
 		return(length*breadth);
 	}
}
	class Cuboid extends Rectangle
	{
		int height;
		public Cuboid(int p, int q, int r){
			super(p,q);
			height=r;
	}
		int volume()
		{
			return(length*breadth*height);
}
}
	class Test
{
		public static void main(String args[])
		{
			Cuboid c1=new Cuboid(15,10,8);
			c1.volume();
			//System.out.println("The Area of Rectangle:"+area);
			System.out.println("The Volume of Cuboid:"+c1.volume());
}
}
