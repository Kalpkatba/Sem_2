import java.util.Scanner;
class Member{
	String name;
	int age;
	String phonenum;
	String add;
	double salary;
	Member(String name, int age,String phonenum,String add,double salary){
		this.name = name;
		this.age = age;
		this.phonenum = phonenum;
		this.add = add;
		this.salary = salary;
	}
	void printdetails(){
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
		System.out.println("Phone Num : "+this.phonenum);
		System.out.println("Address : "+this.add);
		System.out.println("Salary : "+this.salary);
	}
}
    class Manager extends Member{
    	String department;
    	Manager(String name, int age,String phonenum,String add,double salary,String department){
    		super(name,age,phonenum,add,salary);
    		this.department = department;
    	}
    	void printdetails(){
    		super.printdetails();
    		System.out.println("Department : "+this.department);
    	}

    }
    class Employee extends Member{
    	String specialization;

    	Employee(String name, int age,String phonenum,String add,double salary,String specialization){
    		super(name,age,phonenum,add,salary);
    		this.specialization = specialization;
    	}
    	void printdetails(){
    		super.printdetails();
    		System.out.println("Specialization : "+this.specialization);

    	} 

    }
	public class Lab6_B3{
	public static void main(String[] args) {
		Employee e1 = new Employee("kalp",18,"85940338","wfsdvwv",20000,"Backend");
		Manager m1 = new Manager("Harsh",34,"34535655","sfgdffgds",400000,"Backend");
		e1.printdetails();
		m1.printdetails();

		
	}

}