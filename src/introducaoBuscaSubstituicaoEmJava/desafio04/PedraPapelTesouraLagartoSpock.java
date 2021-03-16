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
        regras.put("Tesoura", "lagarto");
        regras.put("Lagarto", "spock");
        regras.put("Lagarto", "papel");
        regras.put("Spock", "tesoura");
        regras.put("Spock", "pedra");
        regras.put("Papel", "pedra");
        regras.put("Papel", "spock");
        regras.put("Pedra", "lagarto");
        regras.put("Pedra", "tesoura");

        Scanner sc = new Scanner(System.in);
        var line = sc.nextLine();

        var primeiro = Arrays.stream(line.split(" ")).findFirst().toString();
        var segundo = line.substring(primeiro.length(), line.length()-1);

        System.out.println(primeiro);
        System.out.println(segundo.trim());

        String resultado = "";

        if(primeiro.equals(segundo)) {
            resultado = "empate";
        } else if(regras.containsKey(primeiro) && regras.containsValue(segundo)) {
            resultado = "Fernanda ";
        } else {
            resultado = "Marcia";
        }

        System.out.println(resultado);

//        var sc = new Scanner(System.in);
//        var casos = sc.nextInt();
//        var resultados = Arrays.asList();
//
//        for (int i = 0; i < casos; i++) {
//            var line = sc.nextLine();
//            var result = line.split(" ");
//
//            System.out.println(result.toString());
//        }
    }
}
