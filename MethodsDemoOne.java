package studentdata;

public class MethodsDemoOne {
	public static void main(String[] args) {

		int a=10;
		int b=10;
		System.out.println(a+b); //20
		int addoof=add();
		System.out.println(addoof);
		nameOfstud();
		printInfo();
		
	}
	public static int add() {
		int x=20;
		int y=30;
		System.out.println(x+y); //50
		return 90;
	}
	public static void printInfo() {
		System.out.println("I am dipali-----");
		System.out.println("I am dipali");

	}
	public static String nameOfstud() {
		System.out.println("I am dipali");
		return "dips";
	}

}
