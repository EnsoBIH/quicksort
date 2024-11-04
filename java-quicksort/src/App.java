public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] Array = { 5, 3, 8, 4, 2, 7, 1, 10, 6, 9 };
        quickSort(Array, 0, Array.length - 1);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(Array));
    }

    public static void quickSort(int[] Array, int low, int high) {
        int i, j, w, x;
        i = low;
        j = high;
        x = Array[(low + high) / 2];
        
        do {
            while (Array[i] < x)
                i++;
            while (x < Array[j])
                j--;
            if (i <= j) {
                w = Array[i];
                Array[i] = Array[j];
                Array[j] = w;
                i++;
                j--;
            }
        } while (i <= j);


        if (low < j)
            quickSort(Array, low, j);
        if (i < high)
            quickSort(Array, i, high);
    }
}
