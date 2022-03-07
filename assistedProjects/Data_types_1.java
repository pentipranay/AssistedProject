//Write a program which will take a string as input and will convert it into other primitive data types.
package assistedProjects;
import java.util.Scanner;
public class Data_types_1 {
	public static void main(String[] arg) {
		
			String s="5678";
			Integer j=Integer.valueOf(s);
			System.out.println(j);
			int k=Integer.parseInt(s);
			System.out.println(k);
			String s1="5645.774543D";
			Double d2=Double.parseDouble(s1);
			System.out.println(d2);
			String s3="4.6f";
			Float f1=Float.parseFloat(s3);
			System.out.println(f1);
		}
}
