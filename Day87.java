import java.util.Scanner;

public class Day87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();

        int[] data = new int[n];

        // 1. Mengisi data ke dalam array
        for (int i = 0; i < data.length; i++) {
            System.out.print("Masukkan nilai indeks ke-" + i + ": ");
            data[i] = sc.nextInt();
        }

        System.out.print("\nArray awal: ");
        tampilkanArray(data);

        // 2. Mengubah (update) nilai pada indeks tertentu
        if (data.length > 0) {
            System.out.print("\nMasukkan indeks yang ingin diubah (0 - " + (data.length - 1) + "): ");
            int idxUbah = sc.nextInt();
            if (idxUbah >= 0 && idxUbah < data.length) {
                System.out.print("Masukkan nilai baru: ");
                data[idxUbah] = sc.nextInt();
                System.out.print("Setelah diubah: ");
                tampilkanArray(data);
            } else {
                System.out.println("Indeks tidak valid.");
            }
        }

        // 3. Mencari nilai tertentu dalam array
        System.out.print("\nMasukkan angka yang ingin dicari: ");
        int target = sc.nextInt();
        int posisi = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                posisi = i;
                break;
            }
        }
        if (posisi != -1) {
            System.out.println("Angka " + target + " ditemukan di indeks ke-" + posisi);
        } else {
            System.out.println("Angka " + target + " tidak ditemukan.");
        }

        // 4. Menghapus elemen pada indeks tertentu
        if (data.length > 0) {
            System.out.print("\nMasukkan indeks yang ingin dihapus (0 - " + (data.length - 1) + "): ");
            int idxHapus = sc.nextInt();
            if (idxHapus >= 0 && idxHapus < data.length) {
                int[] arrayBaru = new int[data.length - 1];
                int k = 0;
                for (int i = 0; i < data.length; i++) {
                    if (i == idxHapus) {
                        continue;
                    }
                    arrayBaru[k++] = data[i];
                }
                data = arrayBaru;
                System.out.print("Setelah dihapus: ");
                tampilkanArray(data);
            } else {
                System.out.println("Indeks tidak valid.");
            }
        }

        sc.close();
    }

    // Method bantu untuk mencetak isi array tanpa java.util.Arrays
    public static void tampilkanArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
