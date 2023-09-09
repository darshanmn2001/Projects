package handson;
abstract class Aaa1{
	abstract void ab();
	
	void a() {
		System.out.println("a");
	}
	
}
class xyz extends abst
{
	
}
abstract class abst extends Aaa1{
	 void ab() {
		System.out.println("ab");
	}
		 
	public static void main(String[] args) {
		abst a=new xyz();
		a.ab();
		a.a();
	}

}
