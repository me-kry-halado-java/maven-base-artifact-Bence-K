package hu.meiit.haladojava.calculator;

public class Kifejezes {
    private final int kifejezesElso;
    private final int kifejezesMmasodik;
    private final char muvelet;

    public Kifejezes(int kifejezesElso, int kifejezesMmasodik, char muvelet) {
        this.kifejezesElso = kifejezesElso;
        this.kifejezesMmasodik = kifejezesMmasodik;
        this.muvelet = muvelet;
    }

    public int getKifejezesElso() {
        return kifejezesElso;
    }

    public int getKifejezesMmasodik() {
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
