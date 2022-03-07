//program to demonstrate the working of Innerclasses
package assistedProjects;

public class Inner_Class_7a {
 private String msg="Welcome to Java"; 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}
	 } 
	 private String msg1="Inner Classes";
	 void display1(){
		 class Inner{
			 void msg(){
				 System.out.println(msg);
			 }
		 }
		  Inner l=new Inner();  
		  l.msg();  
	 } 
public static void main (String [] args){
	Inner_Class_7a obj=new Inner_Class_7a();
	Inner_Class_7a.Inner ic=obj.new Inner();  
	ic.hello();
	obj.display1();
	AnonymousInnerClass aic=new AnonymousInnerClass(){
		public void display() {
			System.out.println("Anonymous Inner Class");
		}};
		aic.display();
}
}
abstract class AnonymousInnerClass {
	 public abstract void display();
}
