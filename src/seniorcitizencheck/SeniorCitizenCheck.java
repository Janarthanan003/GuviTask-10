package seniorcitizencheck;
import java.util.Scanner;
public class SeniorCitizenCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the age: ");
		sc.close();
		int age =sc.nextInt();
		if(age>=60) {
		System.out.println("You are a senior citizen");
	}
	else {
		System.out.println("You are not a senior citizen");
	}
	}
}