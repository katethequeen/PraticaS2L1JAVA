package it.epicode.esercizio1;




import java.util.Scanner;

public class PrimoTest {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            PrimoEsercizio arrayDiNumeri = new PrimoEsercizio();
            boolean continua = true;

            while (continua) {
                arrayDiNumeri.printArray();

                System.out.println("Inserire un numero. (0 per concludere il processo)");
                int value = scanner.nextInt();
                if(value == 0) {
                    continua = false;
                    break;
                }

                System.out.println("Inserisci la posizione dove inserire il numero scelto: (da 0 a 4)");
                int position = scanner.nextInt();

                arrayDiNumeri.updateArray(position, value);
            }
            scanner.close();
    }
}
