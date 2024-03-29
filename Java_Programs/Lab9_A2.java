class Abc extends Thread{
	int start;

	public Abc(int a){
		a = start;
	}

	public void rub(){
		try{
			for (int i=start; i<=20;i+=2 ) {
			System.out.println(i+" ");
			Thread.sleep(500);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
public class Lab9_A2{
	public static void main(String[] args) {
		Thread even = new Abc(2);
		Thread odd = new Abc(1);

		even.start();
		odd.start();
	}
}