package lab3;
import java.util.Scanner;

public class Lab3Qn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Sc = new Scanner(System.in);
System .out.print("Enter your Email");
String email=Sc.nextLine();

String[] emailsplit = email.split("@");
String[] username = email.split(email,0);

String username1 = email.substring(0,email.indexOf("@"));
System.out.println(username1);


	}

}
