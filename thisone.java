package lab3;

import java.util.Scanner;
public class Lab3Qn4demo {



		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter number of Students:");
			int Snum= sc.nextInt();
			
			int ID;
			String fullname;
			float[][] GPA=new float[Snum][4];
			float sum=0;
			int count=0;
			float average=0;
			int f;
			int i;
			float[][] results=new float[Snum][4];
			
			for( i=1; i<=Snum; i++) {
				System.out.printf("Enter ID for student : ");
				 ID=sc.nextInt();
				sc.nextLine();
				System.out.printf("Enter full name for student : ");
				 fullname=sc.nextLine();
				 String[] names=fullname.split("\\s");
				 	
				 //names
				    String name1=names[0];
					String name2=names[1];
					String name3=names[2];
					String name4=names[3];
					String myname=name1+" "+name2.charAt(0)+" "+name3.charAt(0)+" "+name4.charAt(0);
					System.out.println(myname);
					
				for( f=1; f<=4; f++) {
					System.out.printf("Enter GPA for student %d: ",+1);
					 GPA[i-1][f-1]=sc.nextFloat();
					 sum=sum+GPA[i-1][f-1];
					 count++;
				}
				
				
				average=sum/count;
				results[i-1][0]=ID;
				results[i-1][2]=count;
				results[i-1][3]=average;
				sum=0;
				average=0;
				count=0;
				
			}//end of first loop
			
			System.out.println("ID\t\tName\t\tYears\t\tGPA");
			
			for(i=1; i<=Snum; i++) {
				System.out.printf("%d\t\t%.1f\t\t%.1f",results[i-1][0],results[i-1][2],results[i-1][3]);
				System.out.println("\n");
			//	System.out.println(results[i-1][0] );
				System.out.println(results[i-1][1]);
				System.out.println(results[i-1][2]);
				System.out.println(results[i-1][3]);
				
			}
}
}
	


