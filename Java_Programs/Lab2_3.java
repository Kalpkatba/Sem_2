import java.util.Scanner;
public class Lab2_3{
	public static void main(String[] args) {
		System.out.println("Enter A for Addition, B for Substraction, C for Multiplication, D for Division, E for Modulo :");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		System.out.println("Enter 1st Number : ");
		double a = sc.nextDouble();
		System.out.println("Enter 2nd Number : ");
		double b = sc.nextDouble();
		switch(c){
			case'A':{
			System.out.println(a+b);
			break;
		}
		case'B':{
			System.out.println(a-b);
			break;
		}
		case'C':{
			System.out.println(a*b);
			break;
		}
		case'D':{
			System.out.println(a/b);
			break;
		}
		case'E':{
			System.out.println(a%b);
			break;
		}

		}
	}
}