package fundamentosAritmeticosJava.desafio05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ConsumoMedioAutomovel {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int km = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        double distancia = Double.parseDouble(st.nextToken());

        System.out.printf("%.3f km/l", km / distancia);
    }
}
