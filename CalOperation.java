package studentdata;

public class CalOperation {

	public static void main(String[] args) {
		Calculate c1= new Calculate();
		int rest=c1.addtion(10, 40);
		System.out.println(rest);
		
		rest=c1.mul(90,20);
		System.out.println(rest);
		
		CalOperation cc= new CalOperation();
		System.out.println("fghj="+cc.sub(20,1));
		

	}
	
	public int sub(int x, int y) {
		return x-y;
		
	}

}
