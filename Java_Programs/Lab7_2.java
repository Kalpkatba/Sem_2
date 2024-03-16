interface A{
	int vk = 18;
	public void A();
}
interface A1 extends A{
	int abd = 17;
	public void A1();

}
interface A2 extends A{
	int r = 45;
	public void A2();

}
interface A12 extends A1,A2{
	int d = 7;
	public void A12();

}
 class B implements A12{
 	public void A(){
 		System.out.println("Virat Kohli : "+vk);
 	}
 	public void A1(){
 		System.out.println("Abrahim Benjimin Deviliers : "+abd);
 	}
 	public void A2(){
 		System.out.println("Rohit Sharma : "+r);
 	}
 	public void A12(){
 		System.out.println("MSD : "+d);
 	}



 }
 public class Lab7_2{
 	public static void main(String[] args) {
 		B b1 = new B();
 		b1.A(); 
 		b1.A1();
 		b1.A2();
 		b1.A12();		
 	}
 }