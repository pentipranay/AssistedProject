//You are given a project to demonstrate the uses of try-catch blocks in Java.
package assistedProjects;
public class Try_Catch_15{
	public static void main(String[] args) {  
		 String s=null;
	        try  
	        {  
	        System.out.println(s.concat("test"));
	        int value=50/0;
	        }  
	        catch(ArithmeticException e)  
	        {  
	            System.out.println(e.getMessage());  
	        }  
	        catch (NullPointerException e) {
	        	System.out.println(e);
			}
	    }  
}
