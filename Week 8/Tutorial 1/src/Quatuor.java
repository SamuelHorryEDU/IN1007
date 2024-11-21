public class Quatuor {
    private Duet duet1;
    private Duet duet2;

    public Quatuor(Duet d1, Duet d2) {
        duet1 = d1;
        duet2 = d2;
    }

    public Duet getDuet1() {
        return duet1;
    }
    public Duet getDuet2() {
        return duet2;
    }
    public void setDuet1(Duet duet1) {
        this.duet1 = duet1;
    }
    public void setDuet2(Duet duet2) {
        this.duet2 = duet2;
    }
}
