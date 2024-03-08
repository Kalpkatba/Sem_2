import java.util.Scanner;
public class Rightpascalstriangle{
	public static void main(String[] args) {
		int rows;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows : ");
		rows = sc.nextInt();
		for (int i= 0; i<= rows-1; i++)
    {
        for (int j=0; j<=i; j++)
      {
        System.out.print("*"+ " ");
      }
        System.out.println();
    }
    for (int i=rows-1; i>=0; i--)
    {
      for(int j=0; j <= i-1;j++)
      {
        System.out.print("*"+ " ");
      }
      System.out.println();
    }
	}
}