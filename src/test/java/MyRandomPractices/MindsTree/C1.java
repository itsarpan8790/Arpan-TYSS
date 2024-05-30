package MyRandomPractices.MindsTree;

public class C1 {
	private static String name;
	private static int cost;
	private static int number;

	public C1(String name, int cost, int number) {
		super();
		this.name = name;
		this.cost = cost;
		this.number = number;
	}

	public static void display(String name,int cost,int number) {

//		C1.name = "Honda";
//		C1.cost = 120;
//		C1.number = 9866;
		C1.setName(name);
		C1.setCost(cost);
		C1.setNumber(number);
		System.out.println(name);
		System.out.println(cost);
		System.out.println(number);

	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		C1.name = name;
	}

	public static int getCost() {
		return cost;
	}

	public static void setCost(int cost) {
		C1.cost = cost;
	}

	public static int getNumber() {
		return number;
	}

	public static void setNumber(int number) {
		C1.number = number;
	}
	
	
}
