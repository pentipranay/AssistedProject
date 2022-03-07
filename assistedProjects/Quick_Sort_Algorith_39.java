//program to demonstrate the workflow of a quick sort algorithm.
package assistedProjects;

public class Quick_Sort_Algorith_39 {
	int partition(int arr[], int low, int high) {
			int pivot = arr[high];
			int i = (low - 1);
			for (int j = low; j < high; j++) {
				if (arr[j] <= pivot) {
					i++;
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

			int temp = arr[i + 1];
			arr[i + 1] = arr[high];
			arr[high] = temp;

			return i + 1;
		}

		void sort(int arr[], int low, int high) {
			if (low < high) {

				int pi = partition(arr, low, high);

				sort(arr, low, pi - 1);
				sort(arr, pi + 1, high);
			}
		}

		static void printArray(int arr[]) {
			int n = arr.length;
			for (int i = 0; i < n; ++i)
				System.out.print(arr[i] + " ");
			System.out.println();
		}

		public static void main(String args[]) {
			int arr[] = { 1, 4, 3, 2, 1, 4, 3, 2 };
			int n = arr.length;

			Quick_Sort_Algorith_39 ob = new Quick_Sort_Algorith_39();
			ob.sort(arr, 0, n - 1);

			System.out.println("Sorted the Array of Elements are");
			printArray(arr);
		}
}
