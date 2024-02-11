package package1;

public class classA {
	
	int RollNO;
	int Age;
	
	public void display1() {
		System.out.println("Welcome to all of you");
		
	}
	
	public void display2() {
		System.out.println("Automation is very easy");
		
	}

	public static void main(String[] args) {
		classA abc = new classA();
		
		abc.display1();
		int a=abc.RollNO=33;
		System.out.println("RollNO="+a);
		
		abc.display2();
		int b=abc.Age=25;
		System.out.println("Age="+b);
		
		// TODO Auto-generated method stub

	}

}
