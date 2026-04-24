import java.util.Stack;

public class StackSurat24 {
    Surat24[] stack;
    int size;
    int top;

    public StackSurat24(int size) {
        this.size = size;
        stack = new Surat24[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat24 s) {
        if (!isFull()) {
            top++;
            stack[top] = s;
        } else {
            System.out.println("Stack penuh");
        }
    }

    public Surat24 pop() {
        if (!isEmpty()) {
            Surat24 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong");
            return null;
        }
    }

    public Surat24 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Tidak ada data");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat tidak ditemukan");
        }
    }
}
