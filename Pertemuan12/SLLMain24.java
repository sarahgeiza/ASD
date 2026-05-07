package Pertemuan12;

public class SLLMain24 {
    public static void main(String[] args) {
        SingleLinkedList24 sll = new SingleLinkedList24();

        Mahasiswa24 mhs1 = new Mahasiswa24("21212203", "Dirga", "4D", 3.6);
        Mahasiswa24 mhs2 = new Mahasiswa24("22212202", "Cintia", "3C", 3.5);
        Mahasiswa24 mhs3 = new Mahasiswa24("23212201", "Bimon", "2B", 3.8);
        Mahasiswa24 mhs4 = new Mahasiswa24("24212200", "Alvaro", "1A", 4.0);

        sll.print();
        sll.addFirst(mhs1);
        sll.print();
        sll.addLast(mhs4);
        sll.print();
        sll.insertAfter("Dirga", mhs2);
        sll.inesrtAt(2, mhs3);
        sll.print();

    }
}
