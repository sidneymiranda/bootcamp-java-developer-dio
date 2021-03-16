package solucaoDeProblemasComJava.desafio02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class VogaisExtraterrestres {

    public static void main(String[] args) throws IOException {

//        Path path = Paths.get("src/solucaoDeProblemasComJava/desafio02/file.txt");
//        List<String> fileLines = Files.readAllLines(path);


        String path = "src/solucaoDeProblemasComJava/desafio02/file.txt";
//        try {
//            content = Files.lines(Paths.get(path)).collect(Collectors.joining(System.lineSeparator()));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        FileInputStream stream = new FileInputStream(path);
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        String linha = br.readLine();

        List<String> vogais = new ArrayList<>();
        List<String> frases = new ArrayList<>();

        int count = 0;
        while(linha != null) {
            ++count;
            if(count % 2 != 0) {
                vogais.add(linha);
            } else {
                frases.add(linha);
            }
            linha = br.readLine();
        }


//        vogais.forEach(System.out::println);


//    for (String linha : linhasArquivo) {
//            System.out.println( linha );
//        }


//            while() {
//                String vogais = sc.nextLine();
//                String palavra = sc.nextLine();
//                total = 0;
//
//                for (int j = 0; j < palavra.length(); j++){
//                    total = vogais.indexOf(palavra.charAt(j)) > -1 ? total+1 : total;
//                }
//                list.add(total);
//                Scanner resp = new Scanner(System.in);
//            }
//
//            list.forEach(System.out::println);
//            sc.close();
    }
}
