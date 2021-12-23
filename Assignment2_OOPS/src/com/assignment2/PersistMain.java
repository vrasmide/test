package com.assignment2;

public class PersistMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilePersistance fp=new FilePersistance ();
		fp.persist();
		
		DataPersistance dp=new DataPersistance();
		dp.persist();
	}

}

abstract class Persistance{
	abstract void persist();
	
}

class FilePersistance extends Persistance{

	@Override
	void persist() {
		// TODO Auto-generated method stub
		System.out.print("This is from FilePersistance");
	}
	
}

class DataPersistance extends Persistance{

	@Override
	void persist() {
		// TODO Auto-generated method stub
		System.out.println("This is from DataPersistance");
	}
	
}

