package introducaoBuscaSubstituicaoEmJava.desafio05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.function.Function;
import java.util.regex.Pattern;

public class AtalhosParaOWebloggerBrasil {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static int MIN = 1;
    static int MAX = 50;
    static Pattern PATTERN = Pattern.compile("^[\\p{Punct}\\w\\s\\d]+$");
    public static void main(String[] args) throws IOException {

        var entrada = in.readLine();
        var text = "";

        if (entrada != null){
            var qtd = Arrays.asList(entrada).stream().count();
            if(qtd >= MIN && qtd <= MAX){
                text = Arrays.asList(entrada).stream()
    //                        .filter(p -> PATTERN.matcher(p).find())
                            .map(p -> (Function<String, String>)s -> s.replace("_","<i>")
                                    .replace("<i> ","</i> ")
                                    .replace("*","<b>")
                                    .replace("<b> ", "</b> ")
                                    .replace("<b>.", "</b>."))
                            .reduce(Function::andThen)
                            .orElse(Function.identity())
                            .apply(entrada);
            }
        }
        Arrays.asList(text).forEach(System.out::print);
        System.out.println("\n");
    }
}
