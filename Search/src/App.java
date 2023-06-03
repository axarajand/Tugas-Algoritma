import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {1,10,14,5,7,9,11};
        int cari = 14;
        long waktuMulai = System.nanoTime();
        int hasil = linearSearch(arr, cari);
        long waktuSelesai = System.nanoTime();
        long durasi = waktuSelesai - waktuMulai;
         
        //mengurutkan array
        Arrays.sort(arr);

        //Mencetaak aarray yang telah di urutkan
        System.out.println("Array setelah diurutkan:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        if(hasil != -1){
            System.out.print("Data ditemukan di index ke-" + hasil);
        }else {
            System.out.println("Data tidak ditemukan");
        }
        
        System.out.println("Binary Search membutuhkan waktu :" + durasi + " nano detik");
        System.out.println("Linear Search membutuhkan waktu :" + durasi + " nano detik");
    }

    public static int binarySearch(int[] arr, int cari){
        int low =0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == cari){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] arr, int cari){
        for(int i=0; i< arr.length ; i++) {
            if(arr[i] == cari){
                return i;
            }
        }
        return -1;
    }
}