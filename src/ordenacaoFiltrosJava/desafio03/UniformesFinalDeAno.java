package ordenacaoFiltrosJava.desafio03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Map.Entry;

public class UniformesFinalDeAno {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int quantidadeDeUniformes = Integer.parseInt(br.readLine());

        Map<String, String> uniformes = new TreeMap();
        String aluno = "";
        String corTamanho = "";

        for (int i = 0; i < quantidadeDeUniformes; i++) {
            aluno = br.readLine();
            corTamanho= br.readLine();
            uniformes.put(aluno, corTamanho);
        }

        Map<String, String> dadosOrdenados = uniformes.entrySet().stream()
                    .sorted(Entry.comparingByKey())
                    .sorted(Entry.comparingByValue())
                    .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, TreeMap::new));

        dadosOrdenados.forEach((key, value) -> System.out.println(value + " " + key));
    }
}
