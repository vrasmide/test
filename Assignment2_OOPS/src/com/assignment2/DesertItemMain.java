package com.assignment2;

import java.util.Scanner;

public class DesertItemMain {

	public static void main(String[] args) {
		
		Candy cnd=new Candy();
		
		Coockie ck=new Coockie();
		
		IceCream ic=new IceCream();
		
		System.out.println("Press 1 if you are Owner \n Press 2 if you are Customer");
		Scanner s=new Scanner(System.in);
		
		int v=s.nextInt();
		
		if(v==1)
		{
	      System.out.println("Dessert Items \nCandy :"+cnd.getCost()+"\nCoockie: "+ck.getCost()+"\nIcecream:"+ic.getCost());
		}
		else if(v==2)
		{
			System.out.println("\nPlace your order");
		}
	}

}

abstract class DessertItem{
	abstract int getCost();
	
	public static DessertItem getInstance() {
		return null;}}
	class  Candy extends DessertItem {
		public int getCost() {
			
			return (2*60);
		}
		
	}
	class Coockie extends DessertItem{
		public int getCost() {
			return 3*70;
			
		}
	}
	
	class IceCream extends DessertItem{
		public int getCost() {
			return 5;
			
		}
		
	}

