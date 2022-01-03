package com.assignment1;

public class AddressConstructor {
	
	int street,zip;
	String city, state,country;
	
	public AddressConstructor(int street, int zip, String city, String state, String country) {
		super();
		this.street = street;
		this.zip = zip;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public int getStreet() {
		return street;
	}
	public void setStreet(int street) {
		this.street = street;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void display() {
		System.out.println("street:"+street+" city:"+city+
				" state:"+state+" zip:"+zip+" country:"+country );
	}


}
