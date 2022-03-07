// write a program to demonstrate different methods of different return types
package assistedProjects;

public class Methods_4 {
	public void m1(String name) {
		System.out.println("UpperCase is :" + name.toUpperCase());
	}

	public int m2(int x, int y) {
		return x + y;
	}

	public double m3(double x, double y) {
		return x + y;
	}

	public String m4(String s1, String s2) {
		return s1 + s2;
	}

	public static void main(String args[]) {
		Methods_4 object = new Methods_4();
		object.m1("pranay");
		System.out.println(object.m2(3, 5));
		System.out.println(object.m3(8, 7));
		System.out.println(object.m4("abc", "def"));
    }
}
