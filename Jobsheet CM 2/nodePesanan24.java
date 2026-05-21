public class nodePesanan24 {
    pesanan24 data;
    nodePesanan24 prev;
    nodePesanan24 next;

    public nodePesanan24(nodePesanan24 prev, pesanan24 data, nodePesanan24 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
