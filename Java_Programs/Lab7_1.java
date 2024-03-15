import java.util.Scanner;
abstract class Vegetable{
	String name_of_veg;
	String color_of_veg;

	Vegetable(String name_of_veg,String color_of_veg){
		this.name_of_veg = name_of_veg;
		this.color_of_veg = color_of_veg;
	}
	abstract public String toString();
}
class Potato extends Vegetable{
	Potato(String name_of_veg,String color_of_veg){
		super(name_of_veg,color_of_veg);
	}
	public toString(){
		return "name_of_veg : "+super.name_of_veg+"color_of_veg"+super.color_of_veg;
	}
}
class Brinjal extends Vegetable{
	Brinjal(String name_of_veg, String color_of_veg){
		super(name_of_veg,color_of_veg);
	}
	public toString(){
		return "name_of_veg : "+super.name_of_veg+"color_of_veg"+super.color_of_veg;
	}
}
class Tomato extends Vegetable{
	Tomato(String name_of_veg,String color_of_veg){
		super(name_of_veg,color_of_veg);
	}
	@Override
	public toString(){
		return "name_of_veg : "+super.name_of_veg+"color_of_veg"+super.color_of_veg;
	}

}
public class Lab7_1{
	public static void main(String[] args) {
		Potato p1 = new Potato("Potato","Yellow");
		Tomato t1 = new Tomato("Tomato","Red");
		Brinjal b1 = new Brinjal("Brinjal","Purple");
		System.out.println(p1);
	}
}
