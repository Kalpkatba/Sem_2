import java.util.Scanner;
 public class ScoreBoard{
 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		int[][] rpo = new int[3][6];
 		for (int i = 0;i<3 ;i++ ) {
 			for (int j = 0;j<6 ;j++ ) {
 				System.out.println("Enter run taken in over number"+(i+1)+"and ball number"+(j+1)+"=");
 				rpo[i][j] = sc.nextInt();
 			}
 		}
 		int tr = 0;
 		for (int i = 0;i<3 ;i++ ) {
 			for (int j = 0;j<6 ;j++) {
 				tr += rpo[i][j];
 			}
 		}
 		double avg = tr/(double)rpo.length;
 		System.out.println("Total runs = "+tr);
 		System.out.println("Average per over = "+avg);
 	}
 }