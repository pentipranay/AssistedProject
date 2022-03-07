package assistedProjects;

interface First 
{  
    default void show() 
    { 
        System.out.println(" First"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println(" Second"); 
    } 
}  
public class Diamond_20 implements First, Second 
{  
    public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
    	Diamond_20 ob = new Diamond_20 (); 
        ob.show(); 
    } 

}
