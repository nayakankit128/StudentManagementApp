package com.student.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
	
	public static void main(String[] args) throws IOException{
		System.out.println("Wellcome Student Management App");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("PRESS 1 TO ADD STUDENT");
			System.out.println("PRESS 2 TO DELETE STUDENT");
			System.out.println("PRESS 3 TO DISPLAY STUDENT");
			System.out.println("PRESS 4 TO EXIT APP");
			
			int c=Integer.parseInt(br.readLine());
			
			if(c==1) {
				//Add Student 
				
				System.out.println("Enter user name ");
				String name = br.readLine();
				
				System.out.println("Enter user phone ");
				String phone = br.readLine();
				
				System.out.println("Enter user city ");
				String city = br.readLine();
				
				//create student object to store student
				
				StudentField stu = new StudentField(name, phone, city);
				boolean answer=StudentDao.insertStudentToDB(stu);
				
				if(answer) {
					System.out.println("Student add successfully........");
				}else {
					System.out.println("something went wrong.......");
				}
				
				System.out.println(stu);
				
			}else if(c==2) {
				
				System.out.println("Enter Student Id To Delete : ");
				int userId = Integer.parseInt(br.readLine());
				boolean f=StudentDao.deleteStudent(userId);
				
				if(f) {
					System.out.println("Delete successfully...........");
				}else {
					System.out.println("Something went wrong try again.......");
				}
				
			}else if(c==3) {
				
				StudentDao.showAllStudent();
				
			}else if(c==4) {
				break;
			}else {
				
			}
		}
		System.out.println("Thankyou for using my application");
		System.out.println("Bye Bye.....");
	}

}
