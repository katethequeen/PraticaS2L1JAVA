package it.epicode.esercizio3;


import it.epicode.esercizio3.exception.BancaException;

public class Main {
    public static void main(String[] args) {
        ContoCorrente conto1 = new ContoCorrente("Mario", 30.000);

        System.out.println("Primo saldo corrente: " + conto1.restituisciSaldo());

        try {
            conto1.preleva(10.000);
            System.out.println("Saldo corrente dopo prelievo: " + conto1.restituisciSaldo());
        } catch (BancaException e) {
            System.out.println("Errore durante il prelievo " + e);
            e.printStackTrace();
        }

        ContoOnline conto2 = new ContoOnline("Gina", 5.678, 3.000);
        conto2.stampaSaldo();

        try {
            conto2.preleva(1345);
            conto2.stampaSaldo();
        } catch (BancaException e) {
            System.out.println("Errore durante il prelievo: " + e);
            e.printStackTrace();
        }
    }
}
