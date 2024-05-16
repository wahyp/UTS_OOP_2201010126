/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplikasihotel;

/**
 *I Dewa Gede Wahyu Putra Perdana (2201010126)
 * 14-05-2024
 * @author dewaa
 */


import java.util.Scanner;

public class AplikasiHotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManajerHotel manajer = new ManajerHotel(10);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Kamar");
            System.out.println("2. Tampilkan Kamar");
            System.out.println("3. Ubah Kamar");
            System.out.println("4. Hapus Kamar");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Mengkonsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nomor Kamar: ");
                    int nomorKamar = scanner.nextInt();
                    scanner.nextLine();  // Mengkonsumsi newline
                    System.out.print("Masukkan Tipe Kamar: ");
                    String tipeKamar = scanner.nextLine();
                    manajer.tambahKamar(new Kamar(nomorKamar, tipeKamar));
                    break;
                case 2:
                    manajer.tampilkanKamar();
                    break;
                case 3:
                    System.out.print("Masukkan Nomor Kamar yang ingin diubah: ");
                    int nomorKamarUbah = scanner.nextInt();
                    scanner.nextLine();  // Mengkonsumsi newline
                    System.out.print("Masukkan Tipe Kamar baru: ");
                    String tipeKamarBaru = scanner.nextLine();
                    System.out.print("Apakah Kamar Terisi (true/false): ");
                    boolean terisiBaru = scanner.nextBoolean();
                    manajer.ubahKamar(nomorKamarUbah, tipeKamarBaru, terisiBaru);
                    break;
                case 4:
                    System.out.print("Masukkan Nomor Kamar yang ingin dihapus: ");
                    int nomorKamarHapus = scanner.nextInt();
                    manajer.hapusKamar(nomorKamarHapus);
                    break;
                case 5:
                    System.out.println("Keluar dari aplikasi.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}


