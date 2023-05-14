public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        bubbleSort(arr, "desc");
        System.out.println("Array setelah diurutkan:");
        printArray(arr);

        int[] arr2 = { 64, 34, 25, 12, 22, 11, 90 };
        insertionSort(arr2, "desc");
        System.out.println("Array 2 setelah diurutkan:");
        printArray(arr2);

        int[] arr3 = { 64, 34, 25, 12, 22, 11, 90 };
        selectionSort(arr3, "asc");
        System.out.println("Array 3 setelah diurutkan:");
        printArray(arr3);
    }

    public static void insertionSort(int[] arr, String param) {
        int n = arr.length;
        if (param == "asc") {
            for (int i = 1; i < n; i++) {
                int key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }
        } else if (param == "desc") {
            for (int i = 1; i < n; i++) {
                int key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] < key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }
        }
    }

    public static void selectionSort(int arr[], String param) {
        int pos;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            pos = i;
            if (param == "asc") {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[pos]) {
                        pos = j;
                    }
                }
            } else if (param == "desc") {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > arr[pos]) {
                        pos = j;
                    }
                }
            }
            temp = arr[i];
            arr[pos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void bubbleSort(int[] arr, String param) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (param == "asc") {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Tukar element arr[j] dengan arr[j + 1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            } else if (param == "desc") {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] < arr[j + 1]) {
                        // Tukar element arr[j] dengan arr[j + 1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
