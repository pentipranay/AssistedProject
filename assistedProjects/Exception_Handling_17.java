//You are given a project to demonstrate a program implementing the concept of exception handling available in Java and the custom exception handlers.
package assistedProjects;

public class Exception_Handling_17 {
	
		 String getString(String s) {
			return s.concat("test"); 
		}
		
		    public static void main(String args[])
		    {
		    	Exception_Handling_17 ob = new Exception_Handling_17();
		    	try {
		    		ob.getString(null);
		    		
		    	}
		    	catch (Exception e) {
		    		System.out.println(e);
				}
		    	finally {
					System.out.println("Hello i am finally block i will always execute");
				}
		    }
}
