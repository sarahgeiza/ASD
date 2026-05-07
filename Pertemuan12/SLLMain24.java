package Pertemuan12;

import java.util.Scanner;
public class SLLMain24 {
    public static void main(String[] args) {
        SingleLinkedList24 sll = new SingleLinkedList24();
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nData ke-" + (i+1));

            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("Nama: ");
            String nama = sc.nextLine();
            
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();

            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa24 mhs = new Mahasiswa24(nim, nama, kelas, ipk);
            sll.addLast(mhs);
        }
        
        System.out.println("\n=== Hasil Linked List ===");
        sll.print();
    }
}
