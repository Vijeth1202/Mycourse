
//1. WAP to find the duplicates present in an array.

import java.util.Arrays; 
public class Duplicate {
  public static void main(String[] args) 
    {
        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
 
        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if ((my_array[i] == my_array[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+my_array[j]);
                }
            }
        }
    }    
}

				
			

//===================================================================================

//2. WAP to sort an array using Quick Sort Algorithm.




class QuickSort{

	
	static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	
	static int partition(int[] arr, int low, int high)
	{

		
		int pivot = arr[high];

		
		int i = (low - 1);

		for (int j = low; j <= high - 1; j++) {

			if (arr[j] < pivot) {

				
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}

	
	static void quickSort(int[] arr, int low, int high)
	{
		if (low < high) {

			
			int pi = partition(arr, low, high);

			
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	
	static void printArray(int[] arr, int size)
	{
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	
	public static void main(String[] args)
	{
		int[] arr = { 10, 7, 8, 9, 1, 5 };
		int n = arr.length;

		quickSort(arr, 0, n - 1);
		System.out.println("Sorted array: ");
		printArray(arr, n);
	}
}

//==============================================================================================

//3. WAP to sort an array using Bubble Sort Algorithm.



class BubbleSort {
	void bubbleSort(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
				
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	
	public static void main(String args[])
	{
		BubbleSort ob = new BubbleSort();
		int arr[] = { 5, 1, 4, 2, 8 };
		ob.bubbleSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}


//===================================================================================

//4. WAP to sort an array using Selection Sort Algorithm.


import java.util.*;
public class SelectionSort
{
	void sort(int arr[])
	{
		int n = arr.length;

		
		for (int i = 0; i < n-1; i++)
		{
		
			int min_idx = i;
			for (int j = i+1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	
	public static void main(String args[])
	{
		SelectionSort ob = new SelectionSort();
		int arr[] = {64,25,12,22,11};
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}

=================================================================================

5. WAP to sort an array using Merge Sort Algorithm.


class MergeSort {
	
	void merge(int arr[], int l, int m, int r)
	{
		
		int n1 = m - l + 1;
		int n2 = r - m;
                int L[] = new int[n1];
		int R[] = new int[n2];

		
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		

		
		int i = 0, j = 0;
                int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

	
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	
	void sort(int arr[], int l, int r)
	{
		if (l < r) {
			
			int m = l + (r - l) / 2;

			
			sort(arr, l, m);
			sort(arr, m + 1, r);

			
			merge(arr, l, m, r);
		}
	}

	
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	
	public static void main(String args[])
	{
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		printArray(arr);

		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		printArray(arr);
	}
}

===========================================================================================

6. WAP to check whether an array is a subset of another array.


class Subset {

	static boolean isSubset(int arr1[], int arr2[], int m,int n)
	{
		int i = 0;
		int j = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++)
				if (arr2[i] == arr1[j])
					break;

			
			if (j == m)
				return false;
		}

		
		return true;
	}

	
	public static void main(String args[])
	{
		int arr1[] = { 11, 1, 13, 21, 3, 7 };
		int arr2[] = { 11, 3, 7, 1 };

		int m = arr1.length;
		int n = arr2.length;

		if (isSubset(arr1, arr2, m, n))
			System.out.print("arr2[] is "
							+ "subset of arr1[] ");
		else
			System.out.print("arr2[] is "
							+ "not a subset of arr1[]");
	}
}


