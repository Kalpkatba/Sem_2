import java.util.Scanner;
public class Lab5_1{
	public static void main(String[] args) {
		Area ar = new Area();
		double radius;
		Scanner sc = new Scanner(System.in);
		double rad = sc.rad();
		double ans = ar.circle(radius);
		System.out.println(ans);
		
	}
}


class Area{
	double circle(double radius){
		return Math.PI*radius*radius;
	}
}