import java.util.Scanner;
public class arrayJadwalKuliah {
    public static void inputJadwal(String[][] jadwal, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nData Jadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah  : ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang             : ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari              : ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam               : ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    public static void tampilSemua(String[][] jadwal, int n) {
        System.out.println("\nSELURUH JADWAL KULIAH");
        for (int i = 0; i < n; i++) {
            System.out.println("Jadwal ke-" + (i + 1));
            System.out.println("Nama MK : " + jadwal[i][0]);
            System.out.println("Ruang   : " + jadwal[i][1]);
            System.out.println("Hari    : " + jadwal[i][2]);
            System.out.println("Jam     : " + jadwal[i][3]);
            System.out.println();
        }
    }

    public static void cariBerdasarkanHari(String[][] jadwal, int n, String hari) {
        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println("Nama MK : " + jadwal[i][0]);
                System.out.println("Ruang   : " + jadwal[i][1]);
                System.out.println("Jam     : " + jadwal[i][3]);
                System.out.println();
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal di hari tersebut.");
        }
    }
    public static void cariBerdasarkanNama(String[][] jadwal, int n, String namaMK) {
        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(namaMK)) {
                System.out.println("Ruang : " + jadwal[i][1]);
                System.out.println("Hari  : " + jadwal[i][2]);
                System.out.println("Jam   : " + jadwal[i][3]);
                System.out.println();
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah jadwal: ");
        int n = Integer.parseInt(sc.nextLine());

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n, sc);

        tampilSemua(jadwal, n);

        System.out.print("Cari jadwal berdasarkan hari: ");
        String hari = sc.nextLine();
        cariBerdasarkanHari(jadwal, n, hari);

        System.out.print("Cari jadwal berdasarkan nama mata kuliah: ");
        String namaMK = sc.nextLine();
        cariBerdasarkanNama(jadwal, n, namaMK);
    }
}

