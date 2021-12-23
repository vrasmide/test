package com.Lambda;


public class Orders_2ndQN {
	interface Orders1{
		public void greater(int x, int y);
	}
	public static void main(String args[]) {
	
	Orders1 o= (x,y)->{
		if(x>y)
		{
			System.out.println("NOT ACCEPTED");
		}else
		{
			System.out.println("ACCEPTED");
		}
		
	};
	o.greater(10000, 45000);
	
	}
}
 