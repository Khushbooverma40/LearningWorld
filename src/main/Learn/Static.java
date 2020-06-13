package Learn;


class Emp{
	String name;
	int id;
	static String ceo;
	
	static {
		ceo = "Unknown";
	}
	
	static {
		ceo= "Hello";
	}

	
	public void show() {
		System.out.println("Employee details are " + name + " " + id+ " " + ceo);
	}
}


public class StaticTest() {
	System.out.println("testing conflicts");
}

public class StaticTest2() {
	System.out.println("testing conflicts");
}

public class StaticTest3() {
	System.out.println("testing conflicts");
}

public class StaticTest4() {
	System.out.println("testing conflicts");
}

public class Static {
	public static void main(String[] args) {
		
		Emp Khushi = new Emp();		
		Khushi.name ="Khushi";
		Khushi.id=25;
		
		Emp Hello = new Emp();
		Hello.name ="Hello";
		Hello.id=100;
		
		Khushi.show();
		Hello.show();
		
	}
}
