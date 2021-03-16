package fundamentosAritmeticosJava.desafio04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ContagemDeCedulas {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int valor = Integer.parseInt(st.nextToken());
        int[] cedulas = {100,50,20,10,5,2,1};

        System.out.println(valor);
        for (int cedula : cedulas) {
            System.out.println(valor / cedula + " nota(s) de R$ " + cedula);
            valor %= cedula;
        }
    }
}
