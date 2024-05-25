public class MaxForThreeNumber {

    private int x;

    private int y;

    private int z;

    public MaxForThreeNumber(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int max() {
        return Math.max(Math.max(this.x, this.y), this.z);
    }
}
