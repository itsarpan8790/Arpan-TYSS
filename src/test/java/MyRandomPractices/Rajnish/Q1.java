package MyRandomPractices.Rajnish;

import java.util.ArrayList;

public class Q1 {

	String name;
	String gender;
	int age;

	public Q1(String n, String g, int a) {
		name = n;
		gender = g;
		age = a;
	}

	public String toString() {
		return name + " " + gender + " " + age;
	}

	public static void main(String[] args) {
		ArrayList<Q1> al = new ArrayList<Q1>();
		ArrayList<Q1> al2 = new ArrayList<Q1>();
		ArrayList<String> al3 = new ArrayList<String>();

		Q1 ob1 = new Q1("Arpan", "male", 30);
		Q1 ob2 = new Q1("Raj", "male", 28);
		Q1 ob3 = new Q1("Sim", "female", 25);
		Q1 ob4 = new Q1("Arpan", "male", 34);
		Q1 ob5 = new Q1("Raj", "female", 34);
		al.add(ob1);
		al.add(ob2);
		al.add(ob3);
		al.add(ob4);
		al.add(ob5);

		for (Q1 a : al) {
			if (al3.contains(a.name)) {

			} else {
				al2.add(a);
				al3.add(a.name);
			}
		}

		for (Q1 a : al2) {
			System.out.println(a);
		}

	}

}
