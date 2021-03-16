package ordenacaoFiltrosJava.desafio02;

import java.io.IOException;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class ComprasNoSupermercado {

    public static void main(String[] args) throws IOException {


        Scanner scan = new Scanner(System.in);
        int numListas = scan.nextInt();

        Set<String> lista = null;

        if(numListas < 100) {
            do{
                Scanner sc = new Scanner(System.in);
                String items = sc.nextLine();

                if(items.length() < 1000 ){
                    lista = new HashSet<>();
                    lista.add(items);
                }
                --numListas;
            } while(numListas > 0);
            scan.close();

            assert lista != null;
            lista.stream()
                .map(String::toLowerCase)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toCollection(LinkedHashSet::new))
                .forEach(System.out::println);

        }
    }
}
