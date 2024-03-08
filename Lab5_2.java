import java.util.Scanner;
public class Lab5_2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the hour for the first time:");
    int h1 = sc.nextInt();
    System.out.println("Enter the minute for the first time:");
    int m1 = sc.nextInt();
    Time t1 = new Time(h1, m1);

    System.out.println("Enter the hour for the second time:");
    int h2 = sc.nextInt();
    System.out.println("Enter the minute for the second time:");
    int m2 = sc.nextInt();
    Time t2 = new Time(h2, m2);

    Time totalTime = t1.addTime(t2);
        System.out.println("Total Time : " + totalTime);
	}
}


   class Time{
  	int hr;
  	int min;
    
  	public Time(int hr,int min){
  		this.hr = hr;
  		this.min = min;
  		
  	}
    public Time addTime(Time other) {
        int totalMin = this.min + other.min;
        int carryHr = totalMin / 60;
        int newMin = totalMin % 60;
        int newHr = this.hr + other.hr + carryHr;
        return new Time(newHr, newMin);
    }
    public String toString() {
        return String.format("%02d:%02d", hr, min);
  }
}