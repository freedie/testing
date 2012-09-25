public class BubbleSort {

	public static void main(String[] args) {
		int array[] = { 5, 7, 1, 9, 15, 2 };
		bubbleSort(array);
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	}

	public static void bubbleSort(int[] arr) {

		boolean swapped = true;

		int j = 0;

		int tmp;

		while (swapped) {

			swapped = false;

			j++;

			for (int i = 0; i < arr.length - j; i++) {
				if (arr[i] > arr[i + 1]) {
					tmp = arr[i];

					arr[i] = arr[i + 1];

					arr[i + 1] = tmp;

					swapped = true;

				}

			}
		}

	}

}
