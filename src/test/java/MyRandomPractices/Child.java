package MyRandomPractices;

public class Child extends Parent{

	public void m1(String s) {
		System.out.println("Hi String method overriden");
	}
	
	
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		Child c=new Child();
		Parent up = new Child();
		System.out.println(up);
		System.out.println(p);
		System.out.println(c);
		
		
		
		
	}
	
}
