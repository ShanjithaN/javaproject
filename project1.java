package day6program;
import java.util.Scanner;
public class Student {
			public static void main(String[] args) {
			   Scanner scan =new Scanner(System.in);
			   System.out.println("Enter a Name of Student:");
			   String name=scan.nextLine();
			   System.out.println("Enter a Id of the Student:");
			   int id=scan.nextInt();
			   scan.nextLine();
			   System.out.println("Enter a Grade of the Student:");
			   String grade=scan.nextLine();
			System.out.println("Name of the Student1:" +name );
			System.out.println("Id of the Student1:" +id );
			System.out.println("Grade of the Student1:" +grade );
			System.out.println("Enter the Details of the student:");
			String details=scan.nextLine();
			if(details.equals(name)) {
				System.out.println("NAME OF THE STUDENT1:"+name); 
				System.out.println("ID OF THE STUDENT1:"+id);
				System.out.println("GRADE OF THE STUDENT1:"+grade);
			}
			else{

				System.out.println("YOU HAVE ENTERED AN INVALID STUDENT DETAILS");
			}
			String[] numbers= {"Student1","Student2","Student3"};
			ArrayList <String> arrlist =new ArrayList<>();
			System.out.pritnln(arrlist.set(2,Student4));
			arrlist.remove(1);
			}
}