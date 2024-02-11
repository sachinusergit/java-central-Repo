package package3;

//((((10+2)+2)-2)*2)/2)

public class classC {
	public int sum(int a, int b) {
		return (a+b);
	}
	
	public int subtract(int c, int d) {
		return (c-d );
	}
	public int Multiply(int e, int f) {
		return (e*f);
		
	}
	
	public int division(int g, int h) {
		return (g/h);
	

}
	
	public static void main(String[] args) {
		classC calculate = new classC();
		int s1 = calculate.sum(10, 2);
		int s2 = calculate.sum(s1, 2);
		int s3 = calculate.subtract(s2, 2);
		int s4 = calculate.Multiply(s3, 2);
		int s5 = calculate.division(s4, 2);
		
		System.out.println("result is "+s5);
		
		
		
		
		
		
		
	}
}

}
