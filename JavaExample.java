import java.util.Scanner;
class JavaExample
{
  public static void main(String[] args)
  {
    //This represents the number of rows in the pattern
    int numberOfRows;
    System.out.print("Enter the number of rows: ");
    //Getting the number of rows from user
    Scanner sc = new Scanner(System.in);
    numberOfRows = sc.nextInt();

    //This outer loop prints the first half of the pattern
    for (int i= 0; i<= numberOfRows-1; i++)
    {
      //Prints the stars and in between spaces for each row
      for (int j=0; j<=i; j++)
      {
        System.out.print("*"+ " ");
      }
      //new line for next row
      System.out.println();
    }
    //This outer loop prints the second half of the pattern
    for (int i=numberOfRows-1; i>=0; i--)
    {
      //Prints the stars and in between spaces for each row
      //in the second half of the pattern
      for(int j=0; j <= i-1;j++)
      {
        System.out.print("*"+ " ");
      }
      //new line for next row
      System.out.println();
    }
  }
}  