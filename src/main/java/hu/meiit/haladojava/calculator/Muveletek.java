package hu.meiit.haladojava.calculator;

public class Muveletek {


    public String vegrehajtas(Kifejezes kif) {
        String eredmeny = null;
        switch (kif.getMuvelet()) {
            case "+":
                eredmeny = String.valueOf(kif.getKifejezesElso() + kif.getKifejezesMmasodik());
                break;
            case "-":
                eredmeny = String.valueOf(kif.getKifejezesElso() - kif.getKifejezesMmasodik());
                break;
            case "/":
                eredmeny = String.valueOf(kif.getKifejezesElso() / kif.getKifejezesMmasodik());
                break;
            case "*":
                eredmeny = String.valueOf(kif.getKifejezesElso() * kif.getKifejezesMmasodik());
                break;
            default:
                break;
        }

        return eredmeny;
    }
}
