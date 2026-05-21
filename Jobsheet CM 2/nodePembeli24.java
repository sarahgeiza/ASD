public class nodePembeli24 {
    int noAntrian;
    pembeli24 data;
    nodePembeli24 prev;
    nodePembeli24 next;

    public nodePembeli24(nodePembeli24 prev, int noAntrian, pembeli24 data, nodePembeli24 next) {
        this.prev = prev;
        this.noAntrian = noAntrian;
        this.data = data;
        this.next = next;
    }
}
