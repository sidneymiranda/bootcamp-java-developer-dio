package fundamentosAritmeticosJava.desafio01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ValorousPositive {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Scanner sc = new Scanner(System.in);
        int count = 0;
        for(int i = 0; i <= 5; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            Double numero = Double.parseDouble((st.nextToken()));
            count = (numero!=0) ? count+1 : count;
//            count = (Integer.parseInt(sc.nextLine())!=0) ? count+1 : count;
        }
        System.out.println(count+" valores positivos");
    }
}
