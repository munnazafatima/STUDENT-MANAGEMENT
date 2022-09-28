package schoolmngt;

import java.util.Scanner;

import entity.Student;
import entity.Teacher;


public class Menu {
	  static Student S =new Student();
	   static Student[] array =null;
	   
	  static Teacher T =new Teacher();
	   static Teacher[] arr=null;
	   
	public static void options(){
		// CRUD
		int option=0,option1=0,option2=0,num=0,num1=0;
		Scanner scanner = new Scanner(System.in);
	do {
			
			  System.out.println(" 1. Student");
			  System.out.println(" 2. Teacher");
			  System.out.println(" 3. Exit");
			  
			   option = scanner.nextInt();// 1 2 3
			
			 
			switch(option) {
			  case  1:
				  do {
					  System.out.println("1. Insert student record");
				       System.out.println("2. View student records");
				       System.out.println("3. Search student record by roll Number");
				       System.out.println("4. Search student record by First Name");
				       System.out.println("5. Search student record by Last Name");
				       System.out.println("6. Search teacher record by city");
					   System.out.println("7. Exit student portal");
				  
					  
					   option1 = scanner.nextInt();
					   switch(option1) {
					   
					   case 1 :
						      System.out.println("number of records");
							  num = scanner.nextInt();
							   array = new Student[num];
								for(int i=0;i<num;i++) {
									
								array[i]=new Student();
								array[i].insert();
								 System.out.println("----------------------------------");
								}
								break;
					   
					   case 2 :
						   for(int i=0;i<num;i++) {
							   array[i].display();
							   System.out.println("----------------------------------");
						   }
						   break;
						   
					   case 3:
						   System.out.println("Enter Student Roll No : ");
						   int rollno = scanner.nextInt();
							
							Student  std1 = S.searchByStdrollno(array , rollno);
							if(std1 == null) {
								System.out.println(" No such record found");
								System.out.println("--------------------------");
							}
							
							else
								std1.display();
								System.out.println("--------------------------");
		
							break;
							
					   case 4:
						   System.out.println(" Enter student first Name: ");
							String firstname = scanner.next();// 
							
							Student [] std2 = new Student[array.length];
									int result= S. searchByStdfirstname(array , firstname);
									if(result==0) {
										System.out.println(" No such record found");
									}
							
							/*for(int i = 0 ; i < std2.length ; i++) {
								if(std2[i] != null) {
								std2[i].display();
								System.out.println("--------------------------");
								}
								else {
									System.out.println("No record found");
									System.out.println("--------------------------");
								}
								
							}*/
									
		
							break;
					   case 5:
						   System.out.println(" Enter student Last Name: ");
							String lastname = scanner.next();// 
							
							Student [] std3 = new Student[array.length];
									int result1 = S. searchByStdlastname(array , lastname);
									if(result1==0) {
										System.out.println(" No such record found");
									}
							
						/*	for(int i = 0 ; i < std3.length ; i++) {
								if(std3[i] != null) {
								std3[i].display();
								System.out.println("--------------------------");
								}
								else {
									System.out.println("No record found");
									System.out.println("--------------------------");
								}
								
							}*/
		
							break;
					
					   case 6:
						   System.out.println(" Enter student City: ");
							String city = scanner.next();// 
							
							Student [] std4 = new Student[array.length];
									int result2 = S. searchByStdcity(array , city);
									if(result2==0) {
										System.out.println(" No such record found");
									}
							
						/*	for(int i = 0 ; i < std4.length ; i++) {
								if(std4[i] != null) {
								std4[i].display();
								System.out.println("--------------------------");
								}
								else {
									System.out.println("No record found");
									System.out.println("--------------------------");
								}
								
							}*/
		
							break;
							
					   case 7:
						   
						        S.exit();
						        break;
					   }
						   
					   }while(option1 !=7);
						   
				break;
		 case 2	:
			 do {
			   System.out.println("1. Insert teacher record");
		       System.out.println("2. View teacher records");
		       System.out.println("3. Search teacher record by ID Number");
		       System.out.println("4. Search teacher record by First Name");
		       System.out.println("5. Search teacher record by Last Name");
		       System.out.println("6. Search teacher record by Gender");
		       System.out.println("7. Search teacher record by City");
			   System.out.println("8. Exit teacher portal");

             option2 = scanner.nextInt();
			   
				switch(option2){
				
				case 1:
					    System.out.println("number of records");
						num1 = scanner.nextInt();
						arr=new Teacher[num1];
						for(int i=0;i<num1;i++) {
							
							arr[i]=new Teacher();
							arr[i].insert();	
							System.out.println("--------------------------");
						}
						break;
						
				case 2 :
					for(int i=0;i<num1;i++) {
						   arr[i].display();
						   System.out.println("----------------------------------");
					   }
					   break;
					   
				case 3 :
					System.out.println(" enter TeacherId ");
					int Id = scanner.nextInt();
					
					Teacher  tech1 = T.searchbyteacherId(arr , Id);// base address ( address of first element)
				
					if(tech1 == null) {
						System.out.println(" No such record found");
						System.out.println("--------------------------");
					}
					
					else
						tech1.display();
						System.out.println("--------------------------");

					break;
					
					
					
				case 4:
					System.out.println(" enter teacher first Name: ");
					String firstname = scanner.next();// 
					
					Teacher [] teacher1 = new Teacher[arr.length];
							teacher1= T. searchByteacherfirstname(arr , firstname);
					
					for(int i = 0 ; i < teacher1.length ; i++) {
						if(teacher1[i] != null) {
						teacher1[i].display();
						System.out.println("--------------------------");
						}
						else {
							System.out.println("No record found");
							System.out.println("--------------------------");
						}
						
					}

					break;
					
				case 5 :
					System.out.println(" enter teacher last Name: ");
					String lastname = scanner.next();// 
					
					Teacher [] teacher2 = new Teacher[arr.length];
							teacher2= T. searchByteacherlastname(arr , lastname);
					
					for(int i = 0 ; i < teacher2.length ; i++) {
						if(teacher2[i] != null) {
						teacher2[i].display();
						System.out.println("--------------------------");
						}
						else {
							System.out.println("No record found");
							System.out.println("--------------------------");
						}
						
					}
					break;
					
					
				case 6:
					System.out.println(" enter teacher gender: ");
					String gender = scanner.next();// 
					
					Teacher [] teacher3= new Teacher[arr.length];
							teacher3= T. searchByteachergender(arr , gender);
					
					for(int i = 0 ; i < teacher3.length ; i++) {
						if(teacher3[i] != null) {
						teacher3[i].display();
						System.out.println("--------------------------");
						}
						else {
							System.out.println("No record found");
							System.out.println("--------------------------");
						}
						
					}
					break;
					
				case 7: 
					System.out.println(" enter teacher city: ");
					String city = scanner.next();// 
					
					Teacher [] teacher4= new Teacher[arr.length];
							teacher4= T. searchByteachercity(arr , city);
					
					for(int i = 0 ; i < teacher4.length ; i++) {
						if(teacher4[i] != null) {
						teacher4[i].display();
						System.out.println("--------------------------");
						}
						else {
							System.out.println("No record found");
							System.out.println("--------------------------");
						}
						
					}
					break;
					
				case 8:
					  T.exit();
					  break;
					
					
				}
			 }while(option2!=8);
				break;
				
		case 3:
			System.out.println("Exit  Application Successfully");
			System.exit(0);
	    }
		}while(option!=4);

	}
	
}