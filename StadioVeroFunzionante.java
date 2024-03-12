import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class StadioVeroFunzionante {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        // risposta rispetto a se vuole utilizzare il software o no
        String risposta;

        // risposta rispetto a quale operazione vuole effettuare
        String ripostaOperazione;

        // generatore random di sabati e domenica fino ad un massimo di 4
        int sabati = random.nextInt(4) + 1;
        int domeniche = random.nextInt(4) + 1;

        // costo biglietti
        int costoBigliettiSabato = 20;
        int costoBigliettiDomeniche = 15;

        // arraylist per memorizzare totale di persone ogni sabato e domenica
        ArrayList<Integer> personeSabati = new ArrayList<>();
        ArrayList<Integer> personeDomeniche = new ArrayList<>();

        // arraylist per memorizzare totale di incassi ogni sabato e domenica
        ArrayList<Integer> incassiTotaleSabati = new ArrayList<>();
        ArrayList<Integer> incassiTotaleDomeniche = new ArrayList<>();

        // aggiunge il numero di persone per singolo sabato
        for (int i = 0; i < sabati; i++) {
            int personeSabato = random.nextInt(54732);
            personeSabati.add(personeSabato);
            // calcola l'incasso totale per ogni sabato
            int incassoSabato = costoBigliettiSabato * personeSabati.get(i);
            incassiTotaleSabati.add(incassoSabato);
        }

        // aggiunge il numero di persone per singola domenica
        for (int i = 0; i < domeniche; i++) {
            int personeDomenica = random.nextInt(54732);
            personeDomeniche.add(personeDomenica);
            // calcola l'incasso totale per ogni sabato
            int incassoDomenica = costoBigliettiDomeniche * personeDomeniche.get(i);
            incassiTotaleDomeniche.add(incassoDomenica);
        }

        // ciclo di inizializzazione del software
        for (int i = 1; i > 0;) {
            do {
                System.out.println("vuoi utilizzare il software?");
                risposta = sc.nextLine();
                if (risposta.equals("no")) {
                    i--;
                    break;
                }
                System.out.println("che operazione vuoi fare?");
                ripostaOperazione = sc.nextLine();
                // minimo spettatori
                if (ripostaOperazione.equals("minimo spettatori")) {
                    System.out.println("il minimo di spettatori di sabato è stato : " + Collections.min(personeSabati));
                    System.out.println(
                            "il minimo di spettatori di domenica è stato : " + Collections.min(personeDomeniche));
                    // massimo spettatori
                } else if (ripostaOperazione.equals("massimo spettatori")) {
                    System.out
                            .println("il massimo di spettatori di sabato è stato : " + Collections.max(personeSabati));
                    System.out.println(
                            "il massimo di spettatori di domenica è stato :" + Collections.max(personeDomeniche));
                    // minimo incassi
                } else if (ripostaOperazione.equals("minimo incassi")) {
                    System.out.println(
                            "il minimo di incassi di sabato è stato :" + Collections.min(incassiTotaleSabati));
                    System.out.println(
                            "il minimo di incassi di domenica è stato :" + Collections.min(incassiTotaleDomeniche));
                    // massimo incassi
                } else if (risposta.equals("massimo incassi")) {
                    System.out
                            .println("Il massimo di incassi sabato è stato :" + Collections.max(incassiTotaleSabati));
                    System.out.println(
                            "Il massimo di incassi domenica è stato :" + Collections.max(incassiTotaleDomeniche));

                }

            } while (risposta.equals("si"));
        }

    }
}