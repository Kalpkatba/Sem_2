import java.util.Scanner;
public class Lab1_3{
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter Your Name : ");
		String name = s.next();
		System.out.println("Enter Roll no. : ");
		int num = s.nextInt();
		System.out.println("Enter SPI : ");
		double spi = s.nextDouble();

		System.out.println(name);
		System.out.println(num);
		System.out.println(spi);

	}

}