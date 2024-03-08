import java.util.Scanner;
  public class Lab4_7{
  	public static void main(String[] args) {
  		Scanner sc = new Scanner(System.in);
  		String st = "stream";
  		for (int i=0;i<st.length() ;i++ ) {
  			for (int j=0;j<=i ;j++ ) {
  				 char ch = st.charAt(j);
  				System.out.print(ch);

  				
  			}
  			System.out.println("");
  			
  		}
 	}
 }