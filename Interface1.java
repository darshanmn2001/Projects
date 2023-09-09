package handson;

interface AAa{
	 void a();
}
interface B{
	void b();
}
class C implements AAa,B{
	public void a() {
		System.out.println("a");
}
	public void b() {
		System.out.println("b");
}
}
public class Interface1 {
	public static void main(String[] args) {		
		C x=new C();
		x.a();
				
	}

}
