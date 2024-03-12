package esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Quante parole vuoi inserire?");

        int nParole = input.nextInt();

        input.nextLine();

        Set<String> paroleInserite = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();

        for (int i = 0; i < nParole; i++) {
            System.out.println("Scrivi la parola da inserire n:" + (i + 1));
            String inputParola = input.nextLine();

            if (!paroleInserite.add(inputParola)) {
                paroleDuplicate.add(inputParola);

            }

        }

        for (String parola : paroleDuplicate) {
            System.out.println("parole duplicate " + parola);
        }
        for (String parola : paroleInserite) {
            System.out.println("Parole inserite " + parola);
        }

        System.out.println("Numero parole distinte " + paroleInserite.size());
    }
}
