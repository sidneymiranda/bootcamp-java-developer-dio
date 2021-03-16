package fundamentosAritmeticosJava.desafio03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ParesOddPositivesNegativesNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int positives = 0, odd = 0, pares = 0, negatives = 0;

        for (int i = 1; i <= 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            pares = (num % 2 == 0) ? pares +1 : pares;
            odd = (num % 2 != 0) ? odd +1 : odd;
            positives = (num > 0) ? positives +1 : positives;
            negatives = (num < 0) ? negatives +1 : negatives;
        }
        System.out.println(pares+" valor(es) par(es)");
        System.out.println(odd+" valor(es) impar(es)");
        System.out.println(positives+" valor(es) positivo(s)");
        System.out.println(negatives+" valor(es) negativo(s)");
    }
}
