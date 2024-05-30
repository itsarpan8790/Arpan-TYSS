package MyRandomPractices.Rajnish;

public class MobNoGeneration {
	public static void main(String[] args) {
		double x = Math.random() * 100000000;
		long y = (long) Math.floor(x);
		System.out.println(x);
		System.out.println(y);
		
		String s="98";
		System.out.println(s+y);

	}

}
