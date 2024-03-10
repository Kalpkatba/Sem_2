import java.util.Scanner;
public class Lab3_3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number : ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number : ");
		int b = sc.nextInt();
		System.out.println("ENter 3rd Number : ");
		int c = sc.nextInt();

		if(a>b)
		{
			if(a>c)
			{
				System.out.println("1st is largest.");
			}
			else{
				System.out.println("3rd is largest.");
			}
		}
		else{
			if(b>c)
			{
				System.out.println("2nd is largest.");
			}
			else{
				System.out.println("3rd is largest.");
			}
		}

	}
}