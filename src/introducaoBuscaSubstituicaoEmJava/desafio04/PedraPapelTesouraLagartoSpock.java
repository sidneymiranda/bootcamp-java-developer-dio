package introducaoBuscaSubstituicaoEmJava.desafio04;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PedraPapelTesouraLagartoSpock {

    public static void main(String[] args) {

        Map<String, String> regras = new HashMap<>();
        regras.put("Tesoura", "papel");
        regras.put("Papel", "pedra");
        regras.put("Pedra", "lagarto");
        regras.put("Lagarto", "spock");
        regras.put("Spock", "tesoura");
        regras.put("Tesoura", "lagarto");
        regras.put("Lagarto", "papel");
        regras.put("Papel", "spock");
        regras.put("Spock", "pedra");
        regras.put("Pedra", "tesoura");

        String vencedor;

        var sc = new Scanner(System.in);
        var casos = sc.nextInt();
        var resultados = Arrays.asList();

        for (int i = 0; i < casos; i++) {
            var line = sc.nextLine();
            var result = line.split(" ");

            System.out.println(result.toString());
        }
    }
}
