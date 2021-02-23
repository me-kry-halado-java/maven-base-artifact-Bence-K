package hu.meiit.haladojava.calculator;

import java.util.Scanner;

public class Iomuveletek {

    public String beolvas() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public void kiir(String s) {
        System.out.print(s);
    }
}
