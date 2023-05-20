public class App {
	public static void main(String args[]) {
		int arr[] = {20, 30, 10, 15, 5};

		System.out.print("Sebelum Diurutkan : ");
		printArray(arr);

		System.out.print("Sesudah Diurutkan : ");
        sort(arr);
		printArray(arr);
	}

	static void sort(int arr[]) {
		int n = arr.length;
        
		// Membangun heap (menyusun ulang array)
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapShort(arr, n, i);
        }

		// Satu per satu ekstrak elemen dari heap
		for (int i = n - 1; i >= 0; i--) {
			// Pindahkan root saat ini ke akhir
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// panggil max heapShort pada heap yang dikurangi
			heapShort(arr, i, 0);
		}
	}

	// Untuk menimbun subtree yang di-root dengan simpul i yang mana
    // indeks dalam arr[]. n adalah ukuran tumpukan
	static void heapShort(int arr[], int n, int i) {
		int largest = i; // Inisialisasi terbesar sebagai root
		int l = 2 * i + 1; // kiri = 2*i + 1
		int r = 2 * i + 2; // kanan = 2*i + 2

		// Jika leftc child lebih besar dari root
		if (l < n && arr[l] > arr[largest]) {
			largest = l;
        }

		// Jika right child lebih besar dari yang terbesar sejauh ini
		if (r < n && arr[r] > arr[largest]) {
			largest = r;
        }

		// Jika terbesar bukan root
		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			heapShort(arr, n, largest);
		}
	}

	// Fungsi untuk mencetak array
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i) {
			System.out.print(arr[i] + " ");
        }
		System.out.println();
	}
}

