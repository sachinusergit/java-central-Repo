package package4;

public class ClassD {
	String color;
	int age;
	
	void intObj(String c, int a ) {
		color = c;
		age = a;
		
	}
	
	void display() {
		System.out.print(color+ " " +age);
	}
	
	
	public static void main(String[] args) {
		ClassD animal = new ClassD();
		animal.intObj("red",20);
		animal.display();

				
		
	}
	

}
