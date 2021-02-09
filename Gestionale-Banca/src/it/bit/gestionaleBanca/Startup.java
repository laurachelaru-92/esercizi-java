package it.bit.gestionaleBanca;


import it.bit.gestionaleBanca.domain.ContoCorrente;


public class Startup {

    public static void main(String[] args) {

        ContoCorrente c = new ContoCorrente();
        c.setSaldo(1000);
        System.out.println(c.getSaldo());
    }
}