
package it.epicode.esercizio3;

import it.epicode.esercizio3.exception.BancaException;

public class ContoCorrente {
    String titolare;
    int nMovimenti;
    final int maxMovimenti = 50;
    double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    public void preleva(double x) {
        if(nMovimenti < maxMovimenti) saldo = saldo - x;
        else saldo = saldo - x - 0.50;

        if(saldo < 0) {
            throw  new BancaException("Il conto è in rosso");
        }
        nMovimenti++;
    }

    public double restituisciSaldo() {
        return saldo;
    }
}
