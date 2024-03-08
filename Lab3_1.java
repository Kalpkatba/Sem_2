import java.util.Scanner;
	public class Lab3_1{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter marks of 1st subject : ");
			int a = sc.nextInt();
			System.out.println("Enter marks of 2nd subject : ");
			int b = sc.nextInt();
			System.out.println("Enter marks of 3rd subject : ");
			int c = sc.nextInt();
			System.out.println("Enter marks of 4th subject : ");
			int d = sc.nextInt();
			System.out.println("Enter marks of 5th subject : ");
			int e = sc.nextInt();
			double p = ((a+b+c+d+e)/500.0)*100;
			System.out.println(p);
			if(p>=60)
			{
				System.out.println("First Division");
			}
			else if(p>50 && p<=59)
			{
				System.out.println("Second Division");
			}
			else if(p>40 && p<=49)
			{
				System.out.println("Third Division");
			}
			else {
				System.out.println("Fail !");
			}


		}
	}
