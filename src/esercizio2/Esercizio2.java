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
        Collections.reverse(listaNumeri);
        return listaNumeri;
    }

    public static void main(String[] args) {

        List<Integer> numeriCasuali = generaNumeriRandomOrdinata(30);
        System.out.println(numeriCasuali);

    }
}
