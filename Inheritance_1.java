package handson;

class child extends Inheritance_1{

	void add() {
		int x=20;
		System.out.println("child");
		System.out.println(x);
		
	}
}
public class Inheritance_1 {
//	Inheritance_1(){
//		System.out.println("p");
//	}
	
	int x=10;
	void add() {
		System.out.println("parent");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Inheritance_1 a=new Inheritance_1();
//		a.add();
//		Inheritance_1 c=new child();
//		c.add();//runtime time polymorphism
		child d;
		d=new child();
		d.add();
	}

}
