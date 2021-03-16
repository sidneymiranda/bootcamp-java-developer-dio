package ordenacaoFiltrosJava.desafio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UniformesFinalDeAno {
    public static void main(String[] args) {
    List<String> uniformes = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

//    UNIFORMES
    Scanner sca = new Scanner(System.in);
    int qtdUniformes = sca.nextInt();

    for(int i = 0; i < qtdUniformes; i++) {
//      CAPTURA O NOME
        String nome = sc.nextLine();
        sb.append(nome);
        sb.append(" ");

        //      CAPTURA A COR E O TAMANHO
        String corTamanho = sc.nextLine();
        sb.append(corTamanho);

        uniformes.add(sb.toString());
    }

        uniformes.stream()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
