package Pertemuan12;

public class Mahasiswa24 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa24() {
    }

    public Mahasiswa24(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.print(nama + "\t");
        System.out.print(nim + "\t\t");
        System.out.print(kelas + "\t");
        System.out.println(ipk);
    }
}
