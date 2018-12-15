package pl.coderslab.java.worshop1.task1;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int number = -1;
        int attempts = 0;

        if(args.length > 0 && args [0].equals("iddqd")) { // DOOM GOD MODE
            System.out.println((String.format("*** wylosowana liczba: %d ***", randomNumber)));
        }

        do {
            number = getNumber("Zganij liczbę od 1 do 100! ");
            if (number > randomNumber) {
                System.out.print("Za dużo! ");
            } else if (number < randomNumber) {
                System.out.print("Za mało! ");
            }
            attempts++;
        } while (randomNumber != number);
        {
            System.out.print(String.format("Zgadłeś w %d próbach!", attempts));
        }
    }

    static int getNumber(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("To nie jest liczba! ");
            System.out.print(prompt);
        }
        return scanner.nextInt();
    }
}
