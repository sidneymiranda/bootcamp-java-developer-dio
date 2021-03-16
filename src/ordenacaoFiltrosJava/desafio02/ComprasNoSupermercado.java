package ordenacaoFiltrosJava.desafio02;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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

        Set<String> lista = new HashSet();

        if(numListas < 100) {
            do{
                Scanner sc = new Scanner(System.in);
                var items = sc.nextLine();
                lista.add(items);
                --numListas;
            } while(numListas > 0);

            lista
                .stream()
                .sorted()
                .forEach(System.out::print);

            scan.close();
        }
    }
}
