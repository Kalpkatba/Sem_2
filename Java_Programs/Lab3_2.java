import java.util.Scanner;
public class Lab3_2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String : ");
		 
		String st = sc.next();

		String rev = "";
		for (int i = st.length()-1;i>=0;i--) {
			rev = rev+st.charAt(i);
		}
		if(st.equals(rev))
		{
			System.out.println("String is Palindrome");
		}
		else{
			System.out.println("String is not Palidrome");
		}
	}
}