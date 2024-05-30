package MyRandomPractices;

public class MathRandom {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 21; i++) {
			double random = Math.random();
			System.out.println("Random"+random);
			int rand = (int) Math.floor(random*10);
			System.out.println("value"+rand);
		}

	}

}
