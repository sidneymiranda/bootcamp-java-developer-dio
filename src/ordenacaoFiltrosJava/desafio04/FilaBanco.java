package ordenacaoFiltrosJava.desafio04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilaBanco {

    public static void main(String[] args) {
        int qtdClientes = 0;
        String posicao = "";

        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();

        for(int i = cases; i > 0; i--){
            Scanner sc = new Scanner(System.in);
            qtdClientes = sc.nextInt();

            String[] lista = new String[qtdClientes];

            for(int j = qtdClientes; j > 0; j--){
                Scanner sc2 = new Scanner(System.in);
                posicao = sc2.nextLine();
                lista[j] =  posicao;
            }

            Arrays.stream(lista).sorted().forEach(System.out::println);
        }
    }
}
