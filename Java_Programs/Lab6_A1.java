import java.util.Scanner;
class Student{
	int id_no,no_of_subjects_regidtered = 6;
	String[] subject_code = {123hs134,445ce43,948ff30,453j56j,34543hnm,54342j5k};
	String[] subject_credits = {6,6,5,5,2,2};
	String[] grade_obtained;
	double spi;
	Student(String[] grade_obtained,double spi){
		this.grade_obtained = grade_obtained;
		this.spi = spi;
	}
	void calculate_spi(){
		Scanner sc = sc.grade_obtained();
		String[] grade_obtained = sc.next();
		
	}
	public class Lab6_A1{
		public static void main(String[] args) {
		Student std = new Student();
		std.calculate_spi();
			
		}
	}
