// Write program to read,write and append a file
package assistedProjects;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Program_21 {
public void writeOrAppendDataIntoFile() {
			FileWriter fstream = null;
			try {
				fstream = new FileWriter("E:\\Creating file\\2file.txt", true);
				BufferedWriter fbw = new BufferedWriter(fstream);
				Scanner sc = new Scanner(System.in);
				System.out.println("Please enter the fileData");
				String s = sc.nextLine();
				fbw.write(s);
				fbw.newLine();
				fbw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		public void readFileData() {

			try {
				BufferedReader in = new BufferedReader(new FileReader("E:\\Creating file\\2file.txt"));
				String str;

				while ((str = in.readLine()) != null) {
					System.out.println(str);
				}
				System.out.println(str);
			} catch (IOException e) {
			}

		}
		public static void main(String[] args) {
			
			Program_21 object = new Program_21();
			object.writeOrAppendDataIntoFile();
			object.readFileData();
			
		}
}
