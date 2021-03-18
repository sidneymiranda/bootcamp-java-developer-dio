package introducaoBuscaSubstituicaoEmJava.desafio03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class ValidadorDeSenhasComRequisitos {
    public final static int MAX = 32;
    public final static int MIN = 6;
    static Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$");

    public static void main(String[] args) throws IOException {
        String senha = "";
        char c;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          while (true) {
            senha = br.readLine();

            if(senha == null) {
                break;
            }
            int maiuscula = 0;
            int minuscula = 0;
            int numero = 0;
            int InvalidCaracter = 0;

            if(senha.length() >= MIN && senha.length() <= MAX){
                for (int i = 0; i < senha.length(); i++) {
                    c = senha.charAt(i);
                    maiuscula = (c >= 'A' && c <= 'Z') ? maiuscula+1 : maiuscula;
                    minuscula = (c >= 'a' && c <= 'z') ? minuscula+1 : minuscula;
                    numero = (c >= '0' && c <= '9') ? numero+1 : numero;
                }
            }

            InvalidCaracter = (!pattern.matcher(senha).find()) ? InvalidCaracter+1 : InvalidCaracter;
            if( maiuscula == 0 || minuscula == 0 || numero  == 0 || InvalidCaracter > 0) { //complete o if de acordo com suas variaveis
                System.out.println("Senha invalida.");
            } else {
                System.out.println("Senha valida.");
            }
        }
        br.close();
    }
}
