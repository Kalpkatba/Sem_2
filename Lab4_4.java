import java.util.Scanner;
  public class Lab4_4{
  	public static void main(String[] args) {
  		Scanner sc = new Scanner(System.in);
  		System.out.println("Enter Size of Array : ");
  		int n = sc.nextInt();
  		int[] arr = new int[n];
  		for (int i=0;i<n ;i++ ) {
  			System.out.println("Enter array of "+i);
  			arr[i] = sc.nextInt();
  		}
  		for (int i=0;i<n ;i++ ) {
  			System.out.print(arr[i]);
  		}
  		System.out.println("");
  		for (int i=n-1;i>=0 ;i--) {
  			System.out.print(arr[i]);
  			
  		}
  		System.out.println("");
  	}
  }