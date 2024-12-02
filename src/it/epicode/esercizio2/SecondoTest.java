package it.epicode.esercizio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;
import java.util.Scanner;

public class SecondoTest {
    private static final Logger logger = LoggerFactory.getLogger(SecondoTest.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        SecondoEsercizio car = new SecondoEsercizio();

        while(true) {
            System.out.println("Prova con interi");
            System.out.println("Inserisci il numero di km percorsi: (0 per uscire");
            int km = scanner.nextInt();

            if(km == 0) {
                break;
            }

            System.out.println("Inserisci il numero di litri consumati:");
            int liters = scanner.nextInt();

            try {
                double kmPerLiter = car.calculateKmPerLiter(km, liters);
                System.out.println("Km/Liter percorsi: " + kmPerLiter);
            } catch (ArithmeticException e) {
                System.out.println("Errore divisione per zero!");
            }

            System.out.println("Prova con i double");
            System.out.println("Inserisci il numero di km percorsi: (double): ");
            double kmDouble = scanner.nextDouble();

            System.out.println("Inserisci il numero di litri consumati: (double): ");
            double literDouble = scanner.nextDouble();

                double kmPerLiterDouble = car.calculateKmPerLiter(kmDouble, literDouble);
            if(Double.isInfinite(kmPerLiterDouble)) {
                System.out.println("Errore di divisione per zero con i double");
                logger.error("Errore divisione per zero con double: km = " + kmDouble + ", liters = " + literDouble);
            } else {
                System.out.println("Km/liter percorsi (double): " + kmPerLiterDouble);
            }


        }
        scanner.close();
    }
}
