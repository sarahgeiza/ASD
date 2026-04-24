public class Peminjaman25 {
    Mahasiswa25 mhs;
    Buku25 buku;
    int lama;
    int denda;

    Peminjaman25(Mahasiswa25 mhs, Buku25 buku, int lama) {
        this.mhs = mhs;
        this.buku = buku;
        this.lama = lama;
        hitungDenda();
    }

    void hitungDenda() {
        if (lama > 5) {
            int telat = lama - 5;
            denda = telat * 2000;
        } else {
            denda = 0;
        }
    }

    void tampil() {
        int terlambat = 0;
        if (lama > 5) {
            terlambat = lama - 5;
        }
        System.out.println(mhs.nama + " | " + buku.judul + " | Lama: " + lama + " | Terlambat: " + terlambat
                + " | Denda: " + denda);
    }
}
