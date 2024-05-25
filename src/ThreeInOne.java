public class ThreeInOne {
    private String s1;

    private String s2;

    private String s3;

    public ThreeInOne(String s1, String s2, String s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public String oneLine() {
        return this.s1 + this.s2 + this.s3;
    }
}
