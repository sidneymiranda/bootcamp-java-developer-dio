package introducaoBuscaSubstituicaoEmJava.desafio01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class OrdenacaoDePalavrasPorTamanho {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var sc = new Scanner(System.in);
        var casos = sc.nextInt();

        Pattern pattern = Pattern.compile("[a-zA-Z0-9_]");
        String[] texto = new String[casos];


        for (int i = 0; i < casos; i++) {
            texto[i] = scanner.nextLine();

            var espacos = Arrays.stream(texto[i].split(" ")).count() -1;
            var palavras = texto[i].split(" ", 50);

            if (espacos < 50 && palavras.length > 0 && palavras.length <= 50) {

                Arrays.asList(palavras).stream()
                        .filter(p -> pattern.matcher(p).find())
                        .sorted((o1, o2) -> {
                            if (o1.length() == o2.length()) {
                                return o1.compareTo(o2);
                            } else if (o1.length() > o2.length()) {
                                return -1;
                            }
                            return 1;
                        })
                       .map(p -> p.concat(" "))
                       .collect(Collectors.toList())
                       .forEach(System.out::print);
            }
        }
    }
}