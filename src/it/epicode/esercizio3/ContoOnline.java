package it.epicode.esercizio3;

import it.epicode.esercizio3.exception.BancaException;

public class ContoOnline extends ContoCorrente{
    private double maxPrelievo;

    public ContoOnline(String titolare, double saldo, double maxPrelievo) {
        super(titolare, saldo);
        this.maxPrelievo = maxPrelievo;
    }

    public void stampaSaldo() {
        System.out.println("Titolare " + titolare + " - Saldo: " + saldo + " - Num. movimenti: " + nMovimenti + " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
    }

    public void preleva(double x) {
        if(x <= maxPrelievo) {
            super.preleva(x);
        } else if(x > maxPrelievo) {
            throw new BancaException("Il prelievo non è disponibile");
        }
    }
}
