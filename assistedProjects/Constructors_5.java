// Write a program to demonstrate the use of Constructors and its types
package assistedProjects;
public class Constructors_5 {
		int id;
		String name;
		Constructors_5(){
			int id;
			String name;
			}
		void display() {
			System.out.println(id+" "+name);
			}
		Constructors_5(int arg,String arg1)
		{
		id=arg;
		name=arg1;
		}
		public static void main(String[] args){
			Constructors_5 a=new Constructors_5();
			Constructors_5 b=new Constructors_5();
			a.display();
			b.display();
			Constructors_5 c=new Constructors_5(1,"Sanjay");
			Constructors_5 d=new Constructors_5(2,"Srikanth");
			c.display();
			d.display();
		}
}
