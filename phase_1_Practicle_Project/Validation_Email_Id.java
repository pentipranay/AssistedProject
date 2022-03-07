//Validation of an Email id
package phase_1_Practicle_Project;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Validation_Email_Id {
	public static boolean isValidEmail(String email) {
	String regex = "^(.+)@(.+)$";
	 //initialize the Pattern object
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(email);
	return matcher.matches();
	}
	public static void main(String[] args) {
	List<String> emails = new ArrayList<String>();
	// valid email addresses
	emails.add("Krishnakri@example.com");
	emails.add("Ramarama@example.com");
	emails.add("Ramahari@example.me.org");
	//invalid email addresses
	emails.add("Ban.example.com");
	emails.add("Mahabharat@example.com");
	emails.add("Demo@.example.com");
	for (String value : emails) {
	System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
	}
	System.out.println("Enter any email address to check");
			       Scanner sc = new Scanner(System.in);
			       String input = sc.nextLine();
			       System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
			       
			   }

}
