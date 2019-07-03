package ch1;
class Factorial{
	public static int factorial(int n) {
		if (n<=1) return 1;
		else return n*factorial(n-1);
	}
}
public class Recurson {
	public void recurse(int count) {
		if(count<=0) {
			System.out.println(".");
		}
		else {
			System.out.println(count+"*");
			recurse(count-1);
		}
	}
	public static void main(String[] args) {
		Recurson r = new Recurson();
		r.recurse(10);
		int result;
		Factorial f = new Factorial();
		result = f.factorial(5);
		System.out.println(result);
		
		
	}
}
