package hu.meiit.haladojava.calculator;

public class Kifejezes {
    private final double kifejezesElso;
    private final double kifejezesMmasodik;
    private final char muvelet;

    public Kifejezes(int kifejezesElso, int kifejezesMmasodik, char muvelet) {
        this.kifejezesElso = kifejezesElso;
        this.kifejezesMmasodik = kifejezesMmasodik;
        this.muvelet = muvelet;
    }

    public double getKifejezesElso() {
        return kifejezesElso;
    }

    public double getKifejezesMmasodik() {
        return kifejezesMmasodik;
    }

    public String getMuvelet() {
        return String.valueOf(muvelet);
    }

    @Override
    public String toString() {
        return "Kifejezes{" +
                "kifejezes_elso=" + kifejezesElso +
                ", kifejezes_masodik=" + kifejezesMmasodik +
                ", muvelet=" + muvelet +
                '}';
    }
}
