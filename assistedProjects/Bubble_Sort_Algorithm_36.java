//program to demonstrate the workflow of a bubble sort algorithm.
package assistedProjects;

public class Bubble_Sort_Algorithm_36 {
  public static void main(String[] args)
		{

			int[] arr = { 1, 4, 3, 2 ,1, 4, 3, 2};
			bubbleSort(arr);
			for (int i = 0; i < arr.length; i++)
			{

				System.out.println(arr[i]);
			}
		}

		public static void bubbleSort(int[] arr)
		{
			int len = arr.length;
			int temp = 0;
			for (int i = 0; i < len; i++)
			{
				for (int j = 1; j < (len); j++) 
				{
					if (arr[j - 1] > arr[j])
					{
						temp = arr[j - 1];
						arr[j - 1] = arr[j];
						arr[j] = temp;

					}

				}
		}
	}
}
