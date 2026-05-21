public class DLLPembeli24 {
    nodePembeli24 head;
    nodePembeli24 tail;
    int nomor = 1;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAntrian(pembeli24 pembeli) {
        nodePembeli24 newNode = new nodePembeli24(tail, nomor++, pembeli, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + (nomor-1));
    }

    public void cetakAntrean() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

       nodePembeli24 current = head;
        System.out.println("\n==================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("==================================");
        System.out.printf("%-12s %-15s %-15s\n", "No Antrian", "Nama", "No HP");
        System.out.println("==================================");
        while (current != null) {
            System.out.printf("%-12d %-15s %-15s\n", current.noAntrian, current.data.namaPembeli, current.data.noHp);
            current = current.next;
        }
        System.out.println();
    }

    public nodePembeli24 hapusAntrian(int nomorCari) {
        if (isEmpty()) {
            return null;
        }

        nodePembeli24 current = head;
        while (current != null) {
            if (current.noAntrian == nomorCari) {
                if (current == head && current == tail) {
                    head = tail = null;
                } else if (current == head) {
                    head = head.next;
                    head.prev = null;
                } else if (current == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public String getNamaPembeli(int noAntrian) {
        nodePembeli24 current = head;
        while (current != null) {
            if (current.noAntrian == noAntrian) {
                return current.data.namaPembeli;
            }
            current = current.next;
        }
        return null;
    }
}

