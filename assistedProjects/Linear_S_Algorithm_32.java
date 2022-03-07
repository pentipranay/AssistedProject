//program to demonstrate the workflow of a linear search algorithm.
package assistedProjects;

public class Linear_S_Algorithm_32 {
private static void LinearSearch(int[] arr, int item) {

	        for(int i=0;i < arr.length;i++){
	            if(arr[i] == item)
	            {
	                System.out.println(item + "Find the number index" + i);
	                return;
	            }
	        }
	        System.out.println("Number is not found");

	    }

	    public static void main(String args[]) {
	        int[] arr = {1,4,3,2};

	        int item = 2;
	        LinearSearch(arr, item);
	    }
}
