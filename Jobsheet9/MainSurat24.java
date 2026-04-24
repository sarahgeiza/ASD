import java.util.Scanner;

public class MainSurat24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat24 stack = new StackSurat24(5);
        int pilih;

        do {
            System.out.println("\nMenu: ");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ") ;
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = sc.nextInt();

                    Surat24 s = new Surat24(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    break;
                
                    case 2:
                        Surat24 proses = stack.pop();
                        if (proses != null) {
                            System.out.println("Memproses surat izin dari " + proses.namaMahasiswa);
                        }
                        break;

                    case 3:
                        Surat24 lihat = stack.peek();
                        if (lihat != null) {
                            System.out.println("Surat terakhir dari " + lihat.namaMahasiswa);
                        }
                        break;

                    case 4:
                        System.out.print("Masukkan nama mahasiswa: ");
                        String cari = sc.nextLine();
                        stack.cariSurat(cari);
                        break;
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
