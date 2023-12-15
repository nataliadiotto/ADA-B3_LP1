package Lista04;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> votacao = new HashMap<>();

        System.out.println("Insira o nome de três candidatos: ");
        for (int i = 0; i < 3; i++) {
            String candidato = sc.nextLine();
            votacao.put(candidato, 0);
        }

        System.out.println("\nInsira o nome do candidato para votar: ");

        for (int i = 0; i < 10; i++) {
            System.out.printf("Voto %d: ", (i + 1));
            String votoCandidato = sc.nextLine();

            if (votacao.containsKey(votoCandidato)) {
                votacao.put(votoCandidato, votacao.get(votoCandidato) + 1);
            } else {
                System.out.println("Voto nulo.");
            }
        }

        Integer votosVencedor = 0;
        String vencedor = "";
        Double porcentagem = 0.0;

        for (Map.Entry<String, Integer> entry : votacao.entrySet()) {
            String candidato = entry.getKey();
            Integer votos = entry.getValue();
            porcentagem = (double)((votos / 10.0) * 100);

            if (votos > votosVencedor) {
                vencedor = candidato;
                votosVencedor = votos;
            }
        }

        System.out.printf("%nResultado %n" +
                "Vencedor: %s com %.2f%% dos votos", vencedor, porcentagem);


        sc.close();

        }


    }



