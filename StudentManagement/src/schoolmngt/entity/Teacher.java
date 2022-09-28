package entity;

import java.util.Scanner;

public class Teacher extends Person {
    int Id ;
	String gender;
	
	public Teacher(){
		
	}
	Teacher(int Id ,String firstname,String lastname, String city, String gender){
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;
		this.gender = gender;
	}
	

public void insert() {
	
Scanner scanner = new Scanner(System.in);
     System.out.println("Enter Id: ");
    Id = scanner.nextInt();
 
	
	System.out.println("Enter firstname: ");
    firstname = scanner.next();
	 
    System.out.println("Enter lastname:   ");
	lastname = scanner.next();
			 

	System.out.println("Enter city:    ");
	city = scanner.next();
	
	System.out.println("Enter gender:    ");
	gender = scanner.next();
	
	
	
}
public void display() {
	System.out.println(" Id" + Id + 
			" \n " + " firstname" +firstname + 
			" \n "  +  
			" \n lastname :" + lastname + 
			" \n "  + " city : " + city+
			"\n" +"gender"+ gender);
	}


public Teacher searchbyteacherId(Teacher[] array , int Id) {
	
	for(int i = 0 ; i < array.length ; i++) {
		
		if(array[i].Id  == Id)
			return array[i];


	}

return null;



}



public Teacher[] searchByteacherfirstname(Teacher[] array, String firstname) {
	
	Teacher[] arr = new Teacher[array.length];
	
	   for(int i = 0 , j = 0; i< array.length ; i++) {
		   
		   if(array[i].firstname .equals(firstname)) { // tech    0   3   4
			   
			    arr[j] = array[i];
		   }
		   
	   }
	
	
	
	return arr;
	
	
}
public Teacher[] searchByteacherlastname(Teacher[] array, String lastname) {
	
	Teacher[] arr = new Teacher[array.length];
	
	   for(int i = 0 , j = 0; i< array.length ; i++) {
		   
		   if(array[i].lastname .equals(lastname)) { // tech    0   3   4
			   
			    arr[j] = array[i];
		   }
		   
	   }
	
	
	
	return arr;
	
	
}
public Teacher[] searchByteachergender(Teacher[] array, String gender) {
	
	Teacher[] arr = new Teacher[array.length];
	
	   for(int i = 0 , j = 0; i< array.length ; i++) {
		   
		   if(array[i].gender .equals(gender)) { // tech    0   3   4
			   
			    arr[j] = array[i];
		   }
		   
	   }
	
	
	
	return arr;
	
	
}
public Teacher[] searchByteachercity(Teacher[] array, String city) {
	
	Teacher[] arr = new Teacher[array.length];
	
	   for(int i = 0 , j = 0; i< array.length ; i++) {
		   
		   if(array[i].city .equals(city)) { // tech    0   3   4
			   
			    arr[j] = array[i];
		   }
		   
	   }
	
	
	
	return arr;
	
	
}
public void exit() {
	System.out.println("Exit teacher record successfully");
                      }


}
