package studentdata;

public class Calculate {

	public static void main(String[] args) {
		Calculate c= new Calculate();
		System.out.println(c.addtion(10, 20));
		int res=mul(10,20);
		System.out.println(res);

	}

	public int addtion(int x, int y) {
		System.out.print("this is addtion:");
		return x + y;
	}

	public static int mul(int a, int b) {
		System.out.print("this is mul:");
		return a * b;
	}

}
