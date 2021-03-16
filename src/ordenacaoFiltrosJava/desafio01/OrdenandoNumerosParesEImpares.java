package ordenacaoFiltrosJava.desafio01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrdenandoNumerosParesEImpares {

    public static void main(String[] args) throws IOException {
        List<Integer> numeros = new ArrayList();
        Scanner num = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        int linhas = num.nextInt();

        if(linhas > 1 && linhas < 10000){
            for(int i = 0; i < linhas; i++){
                numeros.add(sc.nextInt());
            }
        }
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .forEach(System.out::println);

        numeros.stream()
                .filter(n -> n % 2 != 0)
                .sorted(Comparator.comparingInt(Integer::intValue).reversed())
                .forEach(System.out::println);
    }
}
