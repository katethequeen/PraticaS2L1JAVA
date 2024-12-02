//Scrivere un programma che istanzi un array di 5 interi con valori casuali tra 1 e 10 e lo stampi in console,
// chieda poi all'utente di inserire in numero in una posizione specificata e stampi il nuovo stato dell'array,
// ripetere l'operazione fino a che l'utente non inserisce il valore 0. Gestire eventuali errori dovuti alla violazione
// dei limiti dell'array.
// (Extra: Provare ad usare LogBack per stampare i messaggi di errore).

package it.epicode.esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.Scanner;

public class PrimoEsercizio {
    private static final Logger logger = LoggerFactory.getLogger(PrimoEsercizio.class);
    private int[] numbersArray;
    private Random random;

    public PrimoEsercizio () {
        numbersArray = new int[5];
        random = new Random();
        generateRandomArray();
    }


    public void generateRandomArray() {
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = random.nextInt(10) + 1;
        }
    }

    public void printArray() {
        System.out.println("Stato attuale dell'array: ");
        for(int i : numbersArray) {
            System.out.println(i + " ");
        }
    }

    public void updateArray(int position, int value) {
        try {
            numbersArray[position] = value;
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.error("Indice fuori dai limiti " + position);
            System.out.println("Errore: Indice fuori dai limiti.");
        }
    }
}
