//driver class
//Program to demonstrate on CRUD operations using JDBC;
package org.sjcem.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.sjcem.entities.Student;
import org.sjcem.service.StudentService;
import org.sjcem.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		int choice;
		StudentService service = new StudentServiceImpl();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the choice: "
		+"\n1. Retrieve with Specific Student"
		+"\n2. Retrieve all"
		+"\n3. Delete"
		+"\n4. Insert"
		+"\n5. Update"
		+"\n-1. Exit");
			
		choice = sc.nextInt();
		switch(choice) {
			case 1: 
				{
					System.out.println("Enter the roll no: ");
					Student student;
					try {
						student = service.getStudent(sc.nextInt());
					} catch (Exception e) {
						student = null;
					}
					if(student != null)
						System.out.println(student);
					else
						System.out.println("data not found");
					break;
				}
			case 2:
				{
					List<Student> students = new ArrayList<>();
					for(Student stu: students) {
						System.out.println(stu);
					}
					break;
				}
			case 3: 
				{
					System.out.println("Enter the rollno for delete: ");
					boolean result = service.deleteStudent(sc.nextInt());
					if(result)
						System.out.println("Deleted");
					else
						System.out.println("details not found");
					break;
				}
			case 4:
				{
					System.out.println("Enter the details of student: ");
					Student student = new Student(sc.nextInt(), sc.next());
					if(service.addStudent(student))
						System.out.println("added");
					else
						System.out.println("details not found");
					break;
				}
			case 5:
			{
				System.out.println("Enter the rollno for which you want to update the data: ");
				Student student = new Student();
				student.setRollno(sc.nextInt());
				System.out.println("Enter the updated details: ");
				sc.nextLine();
				student.setName(sc.nextLine());
				Student s = service.updateStudent(student);
				if(s != null)
					System.out.println("updated");
				else
					System.out.println("Student not found");
				break;
			}
			case -1:
				{
					System.out.println("Thank you!");
					break;
				}
			default:
				System.out.println("Invalid choice");
				break;
				
		}
		} while(choice > 0);
	}

}
