package com.assignment2;

//import com.assignment2.Animal.Dog;

	public class Singleton{
		public static void main(String args[]) {
			DataBase db1;
			db1=DataBase.getInstance();
			db1.getConnection();
		}
		
	}
	class DataBase
	{
		private static DataBase dbo;
		
		private DataBase() {
			
		}

		public static DataBase getInstance()
		{
			if(dbo==null)
				dbo=new DataBase();
			return dbo;
			
			
		}
		public void getConnection() {
		System.out.print("DataBase connected");
		}
	}
	