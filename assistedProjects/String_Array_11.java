// Write a program to search String entered by a user from the Array of Strings
package assistedProjects;
import java.util.Arrays;
import java.util.Scanner;
public class String_Array_11 {	
		public static void main(String agrs[]) {
			
			String[] array = {"Ramu","Suddu","Mani","Pardhu"};
			Scanner sc = new Scanner(System.in);
			System.out.println("Please ente string : ");
			String input = sc.next();
			if(Arrays.asList(array).contains(input)) {
				
				System.out.println("true");
				
			}
			else {
				System.out.println("false");
			}
			
		}
}
