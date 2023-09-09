package handson;

class Aa{
	Aa(){
		System.out.println("AA");
	}
	Aa(int a){
		System.out.println("A");
	}
	 void a() {
		 System.out.println("a");
	 }
}

public class assd extends Aa{
	public static void main(String[] args) {		
		assd x=new assd();
		x.a();
				
	}

}
