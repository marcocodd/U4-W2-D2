package esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Esercizio2 {

    public static List<Integer> generaNumeriRandomOrdinata(int numeri) {
        List<Integer> listaNumeriRandom = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < numeri; i++) {
            listaNumeriRandom.add(random.nextInt(1, 100));
        }
        Collections.sort(listaNumeriRandom);
        return listaNumeriRandom;
    }

    public static List<Integer> generaListaRandomInversa(List<Integer> listaNumeri) {
        List<Integer> listaConcatenata = new ArrayList<>(listaNumeri);
        Collections.reverse(listaNumeri);
        listaConcatenata.addAll(listaNumeri);

        return listaConcatenata;
    }

    public static List<Integer> generaListaParoOdispari(List<Integer> listaNumeri, boolean pari) {
        List<Integer> pariOdispari = new ArrayList<>();
        for (int numero : listaNumeri) {
            if (numero % 2 == 0 && pari) {
                pariOdispari.add(numero);
            } else if (!pari && numero % 2 != 0) {
                pariOdispari.add(numero);
            }
        }
        return pariOdispari;
    }

    public static void main(String[] args) {

        List<Integer> numeriCasuali = generaNumeriRandomOrdinata(5);
        System.out.println(numeriCasuali);

        List<Integer> listaNumeriOrdinataEInversa = generaListaRandomInversa(numeriCasuali);
        System.out.println(listaNumeriOrdinataEInversa);

        List<Integer> listaNumeriPari = generaListaParoOdispari(numeriCasuali, true);
        List<Integer> listaNumeriDispari = generaListaParoOdispari(numeriCasuali, false);
        System.out.println("Pari " + listaNumeriPari);
        System.out.println("Dispari" + listaNumeriDispari);
    }

}
