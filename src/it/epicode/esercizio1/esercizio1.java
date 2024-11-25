package it.epicode.esercizio1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class esercizio1 {
    private int[] array;
    private Random random;
    private Scanner scanner;

    public esercizio1() {
        random = new Random();
        scanner = new Scanner(System.in);
        array = new int[5];
        inizializzaArray();
    }

    public void inizializzaArray(){
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }
    }

    public void run() {
        while (true) {
            System.out.println("L'array corrente è: " + Arrays.toString(array));

            System.out.println("Inserisci un numero, 0 se vuoi uscire");
            int numero = scanner.nextInt();
            if(numero == 0) {
                break;
            }

            System.out.println("Inserisci una posizione 0-4: ");
            int posizione = scanner.nextInt();

            //Gestione errori
            try {
                array[posizione] = numero;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posizione non valida, riprova!");
            }
        }

        scanner.close();
        System.out.println("Programma terminato");
    }

}
