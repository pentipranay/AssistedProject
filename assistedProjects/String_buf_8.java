//Write a program to create Strings and display the conversion of String to StringBuffer and StringBuilder
package assistedProjects;
public class String_buf_8 {
public static void main(String args[]) {
		
		String s = "Rama";
		StringBuffer sb = new StringBuffer(s);
		sb.append("Chandra");
		System.out.println(sb);
		
		String s1 = " rao";
		StringBuilder sb1 = new StringBuilder(s1);
		System.out.println(sb1);
	}
}
