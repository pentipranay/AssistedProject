//program to demonstrate the workflow of a selection sort algorithm.
package assistedProjects;
import java.util.Arrays;
public class Selection_Sort_Algorithm_35 {
	static void sel_sort(int numArray[]) {
			int n = numArray.length;

			for (int i = 0; i < n - 1; i++) {
				int min_idx = i;
				for (int j = i + 1; j < n; j++)
					if (numArray[j] < numArray[min_idx])
						min_idx = j;

				int temp = numArray[min_idx];
				numArray[min_idx] = numArray[i];
				numArray[i] = temp;
			}
		}

		public static void main(String args[]) {
			int numArray[] = { 1,4,3,2,1,4,3,2 };
			System.out.println("Given Array Elements Are : " + Arrays.toString(numArray));
			sel_sort(numArray);
			System.out.println("Elements obtained after Soorting are : " + Arrays.toString(numArray));
		}
}
