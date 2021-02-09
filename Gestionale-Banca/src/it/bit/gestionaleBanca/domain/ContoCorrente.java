package it.bit.gestionaleBanca.domain;


public class ContoCorrente {

    
    public ContoCorrente() {

    }

  
    private double saldo = 100;

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double newSaldo) {
        if(newSaldo < 0) {
            System.out.println("Operazione non consentita");
        } else {
            this.saldo = newSaldo;
        }
    }

}


