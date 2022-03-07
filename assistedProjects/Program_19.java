//Program to demonstrate the uses of classes, objects, and the object-oriented pillars in Java.
package assistedProjects;
	
	public class Program_19  extends Parent {
		
		// method overloading
		public int m1(int x,int y) {
			return x+y;
		}
		
		public long m1(long x,long y, long z) {
			return x+y+z;
		}
		
		@Override
		public void m1() {
			System.out.println("hello i am child class methods.");
		}
		
		public static void main(String[] args) {
			Program_19 ob = new Program_19();
			ob.m1();
			
		}
		

	}

	class Parent{
		
		public void m1() {
			System.out.println("Hello i am parent class method");
	}
}
