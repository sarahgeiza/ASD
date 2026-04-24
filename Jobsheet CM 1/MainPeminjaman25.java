import java.util.Scanner;

public class MainPeminjaman25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa25[] mhs = {
                new Mahasiswa25("22001", "Andi", "Teknik Informatika"),
                new Mahasiswa25("22002", "Budi", "Teknik Informatika"),
                new Mahasiswa25("22003", "Citra", "Sistem Informasi Bisnis")
        };
        Buku25[] buku = {
                new Buku25("B001", "Algoritma", 2020),
                new Buku25("B002", "Basis Data", 2019),
                new Buku25("B003", "Pemrograman", 2021),
                new Buku25("B004", "Fisika", 2024),
        };
        Peminjaman25[] data = {
                new Peminjaman25(mhs[0], buku[0], 7),
                new Peminjaman25(mhs[1], buku[1], 3),
                new Peminjaman25(mhs[2], buku[2], 10),
                new Peminjaman25(mhs[2], buku[3], 6),
                new Peminjaman25(mhs[0], buku[1], 4),
        };
        int pilih;

        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Bedasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa: ");
                    for (int i = 0; i < mhs.length; i++) {
                        mhs[i].tampil();
                    }
                    break;

                case 2:
                    System.out.println("\nDaftar Buku: ");
                    for (int i = 0; i < buku.length; i++) {
                        buku[i].tampil();
                    }
                    break;

                case 3:
                    System.out.println("\nData Peminjaman: ");
                    for (int i = 0; i < data.length; i++) {
                        data[i].tampil();
                    }
                    break;

                case 4:
                    for (int i = 1; i < data.length; i++) {
                        Peminjaman25 temp = data[i];
                        int j = i;
                        while (j > 0 && data[j - 1].denda < temp.denda) {
                            data[j] = data[j - 1];
                            j--;
                        }
                        data[j] = temp;
                    }
                    System.out.println("\nSetelah Diurutkan (Denda terbesar): ");
                    for (int i = 0; i < data.length; i++) {
                        data[i].tampil();
                        ;
                    }
                    break;

                case 5:
                    for (int i = 1; i < data.length; i++) {
                        Peminjaman25 temp = data[i];
                        int j = i;
                        while (j > 0 && data[j - 1].mhs.nim.compareTo(temp.mhs.nim) > 0) {
                            data[j] = data[j - 1];
                            j--;
                        }
                        data[j] = temp;
                    }
                    System.out.print("Masukkan NIM: ");
                    String cari = sc.next();
                    int kiri = 0;
                    int kanan = data.length - 1;
                    boolean ketemu = false;

                    while (kiri <= kanan) {
                        int tengah = (kiri + kanan) / 2;
                        if (data[tengah].mhs.nim.equals(cari)) {
                            data[tengah].tampil();
                            ketemu = true;
                            break;
                        } else if (data[tengah].mhs.nim.compareTo(cari) < 0) {
                            kiri = tengah + 1;
                        } else {
                            kanan = tengah - 1;
                        }
                    }
                    if (!ketemu) {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;

                case 0:
                    System.out.println("Keluar");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih != 0);
    }
}