public class SortingTechniques {

    public static void main(String[] args) {
        int[] arr = { 7, 4, 1, 5, 3 };

        // Bubble sort on a copy
        int[] arrForBubble = arr.clone();
        bubbleSort(arrForBubble, arrForBubble.length); // ✅ call the method

        System.out.print("Bubble sort: ");
        for (int num : arrForBubble) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Selection sort on a fresh copy and print
        int[] arrForSelection = arr.clone();
        selectionSort(arrForSelection, arrForSelection.length);

        System.out.print("Selection sort: ");
        for (int num : arrForSelection) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
