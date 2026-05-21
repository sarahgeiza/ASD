public class DLLPesanan24 {
    nodePesanan24 head;
    nodePesanan24 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahPesanan(pesanan24 pesanan) {
        nodePesanan24 newNode = new nodePesanan24(tail, pesanan, null);
        if (isEmpty()) { 
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void sorting() {
        if (head == null) {
            return;
        }

        nodePesanan24 i;
        nodePesanan24 j;

        for (i = head; i.next != null; i = i.next) {
            for (j = i.next; j != null; j = j.next) {
                if (i.data.namaPesanan.compareToIgnoreCase(j.data.namaPesanan) > 0 ) {
                    pesanan24 temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
    }

    public void laporanPesanan() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan");
            return;
        }
        sorting();
        nodePesanan24 current = head;
        int total = 0;
        System.out.println("\n==================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("==================================");
        System.out.printf("%-15s %-20s %-10s\n", "Kode Pesanan", "Nama Pesanan", "Harga");
        System.out.println("==================================");
        while (current != null) {
            System.out.printf("%-15d %-20s Rp%-10d\n", current.data.kodePesanan, current.data.namaPesanan, current.data.harga);
            total += current.data.harga;
            current = current.next;
        }
        System.out.println("==================================");
        System.out.printf("Total Pendapatan : Rp%d\n", total);
        System.out.println();
    }
}