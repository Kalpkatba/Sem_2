import java.util.*;

 public class Len {
 
    public static void main(String[] args) {
        

        Scanner sc= new Scanner(System.in);

       

        System.out.println("Enter String");

       String a = sc.nextLine();

       String b = "";

       for(int i=(a.length())/2; i<a.length();i++){

        b= b + a.charAt(i);

       }


       System.out.println(b);
        
    }
 }