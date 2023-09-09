package handson;

class A{
	private int a;
	 A(int a) {
		this.a=a;
	}
	public int get() {
		
		return a;	
	}
}
public class enc {

	public static void main(String[] args) {
		A a=new A(10);
//		a.set(10);
		System.out.println(a.get());
	}

}
