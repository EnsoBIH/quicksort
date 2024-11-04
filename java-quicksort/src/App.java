public class App {
    public static void main(String[] args) throws Exception {
        int[] Array = { 5, 3, 8, 4, 2, 7, 1, 10, 6, 9 };
        quickSort(Array, 0, Array.length - 1);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(Array));
    }

    public static void quickSort(int[] array, int low, int high) {
        int left = low;
        int right = high;
        int pivot = array[(low + high) / 2];
    
        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
    

        if (low < right) {
            quickSort(array, low, right);
        }
        if (left < high) {
            quickSort(array, left, high);
        }
    }
}
