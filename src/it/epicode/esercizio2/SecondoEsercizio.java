//Scrivere un programma che permetta di calcolare il numero di km/litro percorsi da un'auto.
//Il programma riceve dall'utente il numero di km percorsi ed i litri di carburante consumati
// e stampa i km/litro percorsi. Gestire per mezzo del try-catch l'eventualità che l'utente inserisca il valore 0
// per il numero di litri consumati e venga generata una eccezione di divisione per zero.
// Provare sia ad utilizzare interi sia double per capire come si comportino.
//(Extra: Provare ad usare LogBack per stampare i messaggi di errore)

package it.epicode.esercizio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecondoEsercizio {
    private static final Logger logger = LoggerFactory.getLogger(SecondoEsercizio.class);

    public double calculateKmPerLiter(int km, int liters) {
        try {
            return (double) km/liters;
        } catch (ArithmeticException e) {
            logger.error("Errore di divisione per 0 con interi: km = " + km + ",liters = " + liters);
            throw e;
        }
    }

    public double calculateKmPerLiter(double km, double liters) {
        if(liters == 0.0) {
            logger.error("Errore di divisione per zero con double");
            return Double.POSITIVE_INFINITY;
        }
        return  km/liters;
    }
}
