package selfPractise;

public class SortingEx1_Comparable implements Comparable<SortingEx1_Comparable> {
	String name;
	int age;

	public SortingEx1_Comparable(String name, int age) {
		this.name = name;
		this.age = age;

	}

	@Override
	public int compareTo(SortingEx1_Comparable s) {
		if (this.age > s.age)
			return 1;
		else if (this.age < s.age)
			return -1;
		else
			return 0;
		
		
	}
	@Override
	public String toString() {
		return name+" "+age;
		
	}

}
