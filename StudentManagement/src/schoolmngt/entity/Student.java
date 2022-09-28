package entity;

import java.util.Scanner;




 
public class Student extends Person {
	 int rollno;
	
	String course;
	int phoneno;
	
	

	Student(int rollno,String firstname,String lastname,String course,int phoneno,String city ){
		this.rollno = rollno;
		this.firstname =firstname;
		this.lastname = lastname;
		this.course = course;
		this.phoneno = phoneno;
		this.city = city;
	}
 
public Student() {
		// TODO Auto-generated constructor stub
	}

public void insert() {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter rollnumber: ");
    rollno = scanner.nextInt();
	 

	System.out.println("Enter firstname:  ");
    firstname = scanner.next();
		 

	System.out.println("Enter lastname:   ");
	lastname = scanner.next();
			 

	System.out.println("Enter course:    ");
	course = scanner.next();
				 

	System.out.println("Enter phoneno:   ");
    phoneno = scanner.nextInt();
					 
    System.out.println("Enter City:       ");
    city = scanner.next();
					 
                     }

public void display() {
	System.out.println(" rollno" +rollno + 
	" \n "  + "Firstname : " + firstname  + 
	" \n lastname :" + lastname + 
	" \n "  + " course : " + course   + 
	" \n phoneno :" + phoneno + " \n  city : " +
	 city);
}

public Student searchByStdrollno(Student[] array , int rollno) {
	
	for(int i = 0 ; i < array.length ; i++) {
		
		if(array[i].rollno  == rollno)//110
			return array[i];
}




return null;



}
public int searchByStdfirstname(Student[] array, String firstname) {
	
	Student[] arr = new Student[array.length];
	int count =0;
	
	   for(int i = 0 , j = 0; i< array.length ; i++) {
		   
		   if(array[i].firstname .equals(firstname)) { // tech    0   3   4
			   
		//	    arr[j] = array[i];
			  array[i].display();
			    count=+1;
		   }
		   
	   }
	
	
	
	return count;
	
	
}
  
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", course=" + course + ", phoneno=" + phoneno + "]";
}

public int  searchByStdlastname(Student[] array, String lastname) {
	
	Student[] arr = new Student[array.length];
	int count = 0;
	
	   for(int i = 0 , j = 0; i< array.length ; i++) {
		   
		   if(array[i].lastname .equals(lastname)) { // tech    0   3   4
			   
			   array[i].display();
			   count = +1;
		   }
		   
	   }
	
	
	
	return count;
	
	
}
public  int searchByStdcity(Student[] array, String city) {
	
	Student[] arr = new Student[array.length];
	int count =0;
	   for(int i = 0 , j = 0; i< array.length ; i++) {
		   
		   if(array[i].city .equals(city)) { // tech    0   3   4
			   
			    array[i].display();
			    count = +1;
		   }
		   
	   }
	
	
	
	return count;
	
	
}
        public void exit() {
	System.out.println("Exit Student record successfully");
                       }
}
