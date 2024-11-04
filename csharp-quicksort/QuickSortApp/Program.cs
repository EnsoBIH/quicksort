using System;

public class Program
{
    public static void Main(string[] args)
    {
        var arr = new int[] { 10, 7, 8, 9, 1, 5 };
        quickSort(arr, 0, arr.Length - 1);
        Console.WriteLine("Sorted array: ");
        foreach (var item in arr)
        {
            Console.Write(item + " ");
        }
    }

    public static void quickSort(int[] arr, int low, int high)
    {
        int left = low;
        int right = high;
        int pivot = arr[(low + high) / 2];

        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }


        if (low < right) {
            quickSort(arr, low, right);
        }
        if (left < high) {
            quickSort(arr, left, high);
        }
    }
}