public class BubbleSort {

	public static void main(String[] args) {
		int array[] = { 5, 7, 1, 9, 15, 2 };
		int array2[] = { 5, 7, 1, 9, 15, 2, 12 };
		arrayMax(array);
		arrayMin(array);
		arrayMiddle(array);
		arrayMiddle(array2);
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
	
	public static void arrayMax(int [] arr){
		bubbleSort(arr);
		System.out.println(arr[arr.length-1]);
	}
	
	public static void arrayMin(int [] arr){
		bubbleSort(arr);
		System.out.println(arr[0]);
	}
	
	public static void arrayMiddle(int [] arr){
		bubbleSort(arr);
		if(arr.length%2==0)
			System.out.println("Array doesn't contain an odd number of elements");
		else
			System.out.println(arr[arr.length/2-1]);
	}
}

//comment
