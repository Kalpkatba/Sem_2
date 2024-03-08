import java.util.Scanner;
	public class Lab3_4{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number : ");
			int a = sc.nextInt();
			int count = 0;
			for(int i=1;i<=a;i++)
			{
				if(a%i==0){
					count = count + 1;
				}
			}
			if(count==2){
				System.out.println("Number is Prime.");
			}
			else{
				System.out.println("Number is Not Prime.");
			}
	}

}