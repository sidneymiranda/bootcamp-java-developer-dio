package ordenacaoFiltrosJava.desafio02;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;
import java.util.stream.Collectors;

public class ComprasNoSupermercado {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int quantidade = ler.nextInt();
        ler.nextLine(); //para limpar o Scanner

        List<String> lista = new Vector<>();

        for (int i=0; i<quantidade; i++){
            lista.add(ler.nextLine());
        }

        lista.forEach(valor -> {
            System.out.println(Arrays.stream(valor.split(" ")).collect(Collectors.toSet()).stream().sorted().collect(Collectors.joining(" ")));
        }) ;
    }
}
