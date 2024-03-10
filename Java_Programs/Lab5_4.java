import java.util.Scanner;
   	class Lab5_4{
    	int accountNo;
    	String userName;
    	String email;
    	String accountType;
    	Double accountBalance;

   	Lab5_4(int accountNo,String userName, String email,String accountType,Double accountBalance){
    		this.accountNo = accountNo;
        	this.userName = userName;
        	this.email = email;
        	this.accountType = accountType;
        	this.accountBalance = accountBalance;
    	}
    void getAccountDetails(){
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Your Account Number : ");
    	this.accountNo = sc.nextInt();
    	System.out.println("Enter Your UserName : ");
    	this.userName = sc.next();
    	System.out.println("Enter Your Email : ");
    	this.email = sc.next();
    	System.out.println("Enter Your AccountType : ");
    	this.accountType = sc.next();
    	System.out.println("Enter Your Account Balance : ");
    	this.accountBalance = sc.nextDouble();
}
    void displayAccountDetails(){
       	System.out.println("Your Account Number : "+this.accountNo);
   		System.out.println("Your UserName : "+this.userName);
   		System.out.println("Your Email : "+this.email);
   		System.out.println("Your AccountType : "+this.accountType);
   		System.out.println("Your Account Balance : "+this.accountBalance);
       }
 public static void main(String[] args) {
 	Lab5_4 Acc = new Lab5_4(0,"","","",0.0);
 	// Acc.getAccountDetails();
 	Acc.getAccountDetails();
 	Acc.displayAccountDetails();
 	
   }
   Scanner closed;
   }	
 	  //   public displayAccountDetails(){
    // 	System.out.println("Your Account Number : "+accountNo);
    // 	System.out.println("Your UserName : "+userName);
    // 	System.out.println("Your Email : "+email);
    // 	System.out.println("Your AccountType : "+accountType);
    // 	System.out.println("Your Account Balance : "+accountBalance);

    // }