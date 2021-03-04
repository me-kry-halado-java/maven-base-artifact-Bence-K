package hu.meiit.haladojava.calculator;


public class App {

    private static final Iomuveletek inout = new Iomuveletek();
    private static final InputFeldolgozas feldolgozo = new InputFeldolgozas();
    private static final Muveletek muveletek = new Muveletek();

    public static void main(String[] args) {
        // beolvasas a bemenetrol, feherkarakterek torlese
        String beolvasott = feldolgozo.feherKarEltav(inout.beolvas());

        // eldontes, hogy jo formatum-e, es van-e 0-val osztas
        if (feldolgozo.formatumEllenorzes(beolvasott)) {

            // beolvasott megfelelo formatumu string darabolasa
            Kifejezes kif = feldolgozo.stringFeldarab(beolvasott);

            // eredmeny kiszamolasa
            String eredmeny = muveletek.vegrehajtas(kif);
            inout.kiir(eredmeny);


        } else inout.kiir("-");

    }
}

