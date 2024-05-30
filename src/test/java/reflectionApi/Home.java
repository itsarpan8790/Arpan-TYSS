package reflectionApi;

import java.lang.reflect.Method;

public class Home {
	public static void main(String[] args) {
		Test t = new Test();
		Class clazz = t.getClass();
		System.out.println(clazz.getSimpleName());

		Method[] methodz = clazz.getDeclaredMethods();
		for (Method m : methodz) {
			System.out.println(m.getName());
		}
/**
 * All scopes are visible here
 */
	}

}
