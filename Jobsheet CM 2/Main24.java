import java.util.Scanner;

public class Main24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLLPembeli24 antrian = new DLLPembeli24();
        DLLPesanan24 daftarPesanan = new DLLPesanan24();
        int pilih;

        do {
            System.out.println("\n===============================");
            System.out.println(" SISTEM ANTRIAN ROYAL DELISH ");
            System.out.println("===============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian & Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("\n=== Tambah Antrian ===");
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP : ");
                    String hp = sc.nextLine();
                    pembeli24 p = new pembeli24(nama, hp);
                    antrian.tambahAntrian(p);
                    break;

                case 2:
                    System.out.println("\n=== Daftar Antrian ===");
                    antrian.cetakAntrean();
                    break;

                case 3:
                    System.out.println("\n=== Hapus Antrian ===");
                    System.out.print("Nomor Antrian : ");
                    int no = sc.nextInt();
                    sc.nextLine();
                    nodePembeli24 keluar = antrian.hapusAntrian(no);

                    if (keluar == null) {
                        System.out.println("Antrian tidak ditemukan");
                    } else {
                        System.out.println("Pembeli dipanggil");
                        System.out.println("Nama : " + keluar.data.namaPembeli);
                        System.out.println("No HP : " + keluar.data.noHp);
                        
                        System.out.println("\nInput Pesanan");
                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nama Pesanan : ");
                        String menu = sc.nextLine();
                        System.out.print("Harga : ");
                        int harga = sc.nextInt();
                        sc.nextLine();
                        
                        pesanan24 ps = new pesanan24(kode, menu, harga);
                        daftarPesanan.tambahPesanan(ps);
                        System.out.println(keluar.data.namaPembeli + " telah memesan " + menu);
                    }
                    break;

                case 4:
                    System.out.println("\n=== Laporan Pesanan ===");
                    daftarPesanan.laporanPesanan();
                    break;
                
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                    
                default:
                    System.out.println("Menu tidak tersedia!");
            }
        } while (pilih != 0);
        
        sc.close();
    }
}