import java.util.Scanner;
 public class Lab4_3{
 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		int[] arr = new int[4];
 		int sum = 0;
 		double avg = 0;
 		for (int i=0;i<4 ;i++ ) {
 			System.out.println("Enter number in array "+i);
 			arr[i] = sc.nextInt();
 		}
 		for (int i=0;i<4 ;i++ ) {
 			System.out.print(arr[i]);
 			sum = sum+arr[i];
 			
 		}
 		avg = sum/4;
 		System.out.println("Average is :"+avg);

 	}
 }