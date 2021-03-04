package hu.meiit.haladojava.calculator;

import java.util.regex.Pattern;

public class InputFeldolgozas {


    // megnezzuk, hogy szamMUVELETszam alaku-e, a 0val osztas is hiba
    protected boolean formatumEllenorzes(String s) {
        return Pattern.matches(
                "[0-9]+\\+[0-9]+" +
                        "|[0-9]+\\-[0-9]+" +
                        "|[0-9]+\\*[0-9]+" +
                        "|[0-9]+\\/[1-9]+",
                s);
    }

    // eltavolitjuk a feherkaraktereket ha vannak
    protected String feherKarEltav(String s) {
        return s.replaceAll("\\s", "");
    }

    // feldarabolom a stringet tombbre  + - / * vagyok menten
    protected Kifejezes stringFeldarab(String s) {
        String[] reszek = s.split("\\+|\\-|\\*|\\/");
        return new Kifejezes(
                stringToInt(reszek[0]),
                stringToInt(reszek[1]),
                stringToChar(muveletKivalasztas(s))
        );
    }

    // szamMUVELETJELszam-bol kiszedi a szamokat
    protected String muveletKivalasztas(String s) {
        return s.replaceAll("\\d", "");
    }

    // sztring intre konvertalas
    protected int stringToInt(String s) throws NumberFormatException {
        return Integer.valueOf(s);
    }

    // sztring char-ra konvertalas
    protected char stringToChar(String s) {
        return s.charAt(0);
    }
}
