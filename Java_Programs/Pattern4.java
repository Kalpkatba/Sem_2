/*
             * 
           * * 
         * * * 
       * * * *
     * * * * *
*/
import java.util.Scanner;
	public class Pattern4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i=5;i>=1;i--) {
			for (int k=0;k<=5-i;k++) {
				System.out.println(" ");
				
			}
			for (int j=5;j>=i;j--) {
				System.out.print("* ");
				
			}

			
			
		}
		
	}
}