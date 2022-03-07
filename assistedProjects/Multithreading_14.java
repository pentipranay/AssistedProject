//You are given a project to demonstrate the multithreading with and without synchronization.
package assistedProjects;
public class Multithreading_14 implements Runnable{
	public static void main(String[] args) {
		Multithreading_14 object = new Multithreading_14();
		        Thread threadObject = new Thread(object);
		        // without synchronization
		        threadObject.start();
		        // with synchronization
		        object.m1();
		        
		    }
		    public void run() {
		    	System.out.println("Greetings for the day..");
		        System.out.println("hello..");
		        System.out.println("hi..");
		    }

		    public void m1() {
		    synchronized(this){
		    	for(int i=0;i<10;i++) {
		    		System.out.println(i);
		    	}
		    	
		    }
		
	}

}
