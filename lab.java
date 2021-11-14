package lab3;

import java.util.Scanner;

public class lab {

	public class Student {
		
		int ID, rank;
		String fullname, email;
		float gpa;
		private Scanner scan;
		
		Student(int ID, String name, String email, float gpa) {
			this.ID = ID;
			this.fullname = name;
			this.email = email;
			this.gpa = gpa;
		}
		
		 //FORMAT STUDENT NAME
		 String getFormattedFullname(String fullname) {
			int space = fullname.indexOf(' '),
			    lastSpace = fullname.lastIndexOf(' ');
			
			String first_name = fullname.substring(0, space);
			char first_name_initial = first_name.toUpperCase().charAt(0);
			
			String middle_name = fullname.substring(space+1);
			char middle_name_initial = middle_name.toUpperCase().charAt(0);
			
			String surname = fullname.substring(lastSpace+1).toUpperCase();
			
			return first_name_initial+". "+middle_name_initial+". "+surname;
		}
		
		 //RETRIEVE UNIVERSITY NAME
		 String retriveUniversityName(String emailAddress) {
			int hashIndex = emailAddress.indexOf('@'),
				dotIndex = emailAddress.indexOf('.');
			
			String university_name = emailAddress.substring(hashIndex+1, dotIndex);
			
			return university_name.toUpperCase();
		}

		public void main(String[] args) {
			scan = new Scanner(System.in);
			int i;
			float highGpa = 0.0f;
			
			System.out.print("Enter no. of student: ");
			int no = scan.nextInt();
			Student[] student = new Student[no];
			
			System.out.println();
			for(i = 0; i < student.length; i++) {
				System.out.printf("STUDENT %d DETAILS:\n", i+1);	
				
				System.out.print("Enter student ID: ");
				int ID = scan.nextInt();
				
				scan.nextLine();
				System.out.print("Enter student fullname: ");
				String name = scan.nextLine();
				
				System.out.print("Enter student email: ");
				String email = scan.nextLine();
				
				System.out.print("Enter student GPA: ");
				float gpa = scan.nextFloat();
				
				student[i] = new Student(ID, name, email, gpa);
				System.out.printf("\n");
			}
			
			
			//PRINT STUDENT DETAILS
			System.out.printf("SUMMARY RESULTS\n", i+1);	
			for(i = 0; i < student.length; i++) {
				if(student[i].gpa > highGpa || student[i].gpa == highGpa) {
					highGpa = student[i].gpa;
					student[i].rank = 1;
				}
			    highGpa = (float)highGpa;
				student[i].rank = 2;
			}
			
			for(i = 0; i < student.length; i++) {
				System.out.printf("STUDENT %d\n", i+1);	
				
				System.out.println("ID: "+ student[i].ID);
				System.out.println("Name: "+ student[i].getFormattedFullname(student[i].fullname));
				System.out.println("Rank: "+ student[i].rank);
				System.out.println("University: "+ student[i].retriveUniversityName(student[i].email));
				
				System.out.printf("\n");
			}

		}
	}
}


