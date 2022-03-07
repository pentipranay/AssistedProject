//Write a program to demonstrate how and when access modifiers are used.
package assistedProjects;

public class AccessSpecifies_2 extends Demo {
     public static void main(String[] args) {
			Demo d= new Demo();
			// Private modifier will be accessed Within the class only
			//System.out.println("private modifier ="+d.b);
			// Only Public Modifier will be Accessed
			System.out.println("public modifier ="+d.a);
			// Only Protected modifier will be Accessed
			System.out.println("protected modifier="+d.c);
			// Only Default modifier will be Accessed
			System.out.println("Defult modifier ="+d.d);

		}
	}

	class Demo {

		public int a = 10;
		private int b = 20;
		protected int c = 30;
		int d = 40;

		private int getName1(int input) {
			return input;

		}

		public int getName2(int input) {
			return input;

		}

		protected int getName3(int input) {
			return input;

		}

		int getName4(int input) {
			return input;
		}
}
