import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] mk = {
            "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", " Praktikum Dsar Pemrograman", "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks = {2,2,2,3,2,2,3,2};

        double[] nilaiAngka = new double[mk.length];
        String[] nilaiHuruf = new String[mk.length];
        double [] bobot = new double[mk.length];

        System.out.println("====================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("====================");

        for(int i = 0; i < mk.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK" + mk[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobot[i] = 4.0;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobot[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                bobot[i] = 3.0;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                bobot[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                bobot[i] = 2.0;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                bobot[i] = 3.0;
            } else {
                nilaiHuruf[i] = "E";
                bobot[i] = 0.0;
            }
        }

        System.out.println("===========================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("===========================");
        System.out.printf("%-40s %-12s %-12s %-12s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalBobot = 0;
        int totalSKS = 0;

        for(int i = 0; i < mk.length; i++) {
            System.out.printf("%-40s %-12s %-12s %-12s\n", mk[i], nilaiAngka[i], nilaiHuruf[i], bobot[i]);
            totalBobot += bobot[i] * sks[i];
                totalSKS += sks[i];
        }
        double ip = totalBobot / totalSKS;
        System.out.println("=========================");
        System.out.printf("IP : %.2f\n", ip);
    }
}