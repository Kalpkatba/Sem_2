import java.util.Scanner;
  public class Lab4_2{
  	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);

  		System.out.println("Enter String : ");
  		String st =  sc.next();
  		for (i=0;i<st.lenght();i++) {
  			char ch = sc.next().charAt(i);
  		}
  		if (ch<='A' && ch>='Z') {
  			System.out.println("Vovels");
  			
  		}
  		else{
  			System.out.println("Conconents");
  			
  		}
  	}


  }