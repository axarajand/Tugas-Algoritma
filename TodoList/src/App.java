import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class App {
    public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in);
		ArrayDeque<String> daftar = new ArrayDeque<String>();
		String choice = null;

        do {
            // Display the Menu
            System.out.println("=== Aplikasi Todo List ===");
            System.out.println("1. Tambah Todo ");
            System.out.println("2. Lihat Todo ");
            System.out.println("3. Keluar ");
            System.out.print("Pilih Menu (1/2/3) : ");
            choice = input.nextLine();
            
            // Choice
            switch(choice) {
                case "1":        
                    System.out.print("Masukan Todo Baru : ");
                    daftar.add(input.nextLine());
                    System.out.println("Todo Berhasil Ditambahkan!");
                    System.out.println();
                    break;
                case "2":
                    System.out.println("Todo List : ");
                    daftar.forEach((list) -> System.out.println(list));
                    System.out.println();
                    break;
                case "3":
                    System.out.println("Anda Berhasil Keluar!");
                    System.exit(0);
            }
        } while ( Integer.parseInt(choice) > 0 );
    }
}


