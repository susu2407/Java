package p281;

class Person { }
class Student extends Person { }
class Resercher extends Person { }
class Professor extends Resercher { }

public class InstanceOfEx {
	static void print(Person p) {
		if(p instanceof Person)
			System.out.print("Preson ");
		if(p instanceof Student)
			System.out.print("Student ");
		if(p instanceof Resercher)
			System.out.print("Resercher ");
		if(p instanceof Professor)
			System.out.print("Professor ");
			
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("new Student() ->\t");
		print(new Student());
		System.out.println("new Resercher() ->\t");
		print(new Resercher());
		System.out.println("new Professor() ->\t");
		print(new Professor());
	}
}
