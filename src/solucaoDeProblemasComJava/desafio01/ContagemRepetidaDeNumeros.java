package solucaoDeProblemasComJava.desafio01;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class ContagemRepetidaDeNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

//declare as variaveis corretamente e continue a sua solução

        ArrayList<Integer> list = new ArrayList<>();

        int num =sc.nextInt();
        while(num-->0)
            list.add(sc.nextInt());

        SortedMap<Integer, Integer> listMap = new TreeMap<>();
        list.forEach(id -> listMap.compute(id, (k ,v) -> (v == null ? 1 : v +1)));


        listMap.forEach((key, value) -> System.out.printf("%d aparece %d vez(es)\n", key, value));

        sc.close();
    }
}
