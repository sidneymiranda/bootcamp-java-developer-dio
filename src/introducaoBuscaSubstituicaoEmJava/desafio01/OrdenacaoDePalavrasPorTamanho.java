package introducaoBuscaSubstituicaoEmJava.desafio01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class OrdenacaoDePalavrasPorTamanho {

    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var st = new StringTokenizer(br.readLine());
        var cases = Integer.parseInt((st.nextToken()));

        Pattern pattern = Pattern.compile("^[\\w &&[^_]]+$");
        var list = new ArrayList();

        for (int i = 0; i < cases; i++) {
            var line = br.readLine();

            var listkeyworks = Arrays.asList(line.split(" "));

            var totalKeyowrds = listkeyworks.stream().count();

            if (totalKeyowrds >= 1 && totalKeyowrds <= 50) {
                list.addAll(listkeyworks.stream()
                                        .filter(letter -> letter.length() >= 1 && letter.length() <= 50)
                                        .filter(p -> pattern.matcher(p).find())
                                        .sorted(Comparator.comparing(String::length).reversed()
                                                .thenComparing(String::compareTo))
                                        .map(p -> p.concat(" "))
                                        .collect(Collectors.toList()));
                list.add("\n");
            }
        }
        list.forEach(System.out::print);
    }
}