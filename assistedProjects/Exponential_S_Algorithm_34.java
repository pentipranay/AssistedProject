//program  to demonstrate the workflow of an exponential search algorithm.
package assistedProjects;
import java.util.Arrays;
import java.util.Scanner;
public class Exponential_S_Algorithm_34 {
public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int[] arr = { 1, 4, 3, 2 };
			Arrays.sort(arr);
			System.out.println("Sorting the Array elements are :" + Arrays.toString(arr));
			System.out.println("Find the Value: ");
			int searchElement = sc.nextInt();
			int index = exponentialSearch(arr, searchElement);
			if (index != -1) {
				System.out.println("Searching the number " + arr[index] + " Find at index level " + index);
			} else {
				System.out.println("Searching the Number" + searchElement + " Not find in the Array list");
			}
			sc.close();
		}

		private static int exponentialSearch(int[] arr, int searchElement) {
			int bound = 1;
			while (bound < arr.length && arr[bound] < searchElement) {
				bound *= 2;
			}
			return binarySearch(arr, bound / 2, Integer.min(bound + 1, arr.length), searchElement);
		}

		private static int binarySearch(int[] arr, int start, int end, int searchElement) {
			if (start > end) {
				return -1;
			}
			int middle = (start + end) / 2;
			if (searchElement == arr[middle]) {
				return middle;
			}
			if (searchElement < arr[middle]) {
				return binarySearch(arr, start, middle - 1, searchElement);
			} else {
				return binarySearch(arr, middle + 1, end, searchElement);
			}
	  }
}
