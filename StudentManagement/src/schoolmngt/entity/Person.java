package entity;

public abstract class Person {
	public String firstname;
	public String lastname;
	public String city;
	
	public abstract void insert();
	public abstract void display();
	
	Person(){
		
	}
	Person(String firstname,String lastname,String city ){
		
		this.firstname =firstname;
		this.lastname = lastname;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", city=" + city + "]";
	}
	

}
