package introducaoBuscaSubstituicaoEmJava.desafio03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidadorDeSenhasComRequisitos {
    public final static int MAX = 32;
    public final static int MIN = 6;

    public static void main(String[] args) throws IOException {

    int maiuscula = 0;
    int minuscula = 0;
    int numero = 0;

    String  senha = "";
    char c;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    StringTokenizer st = new StringTokenizer(br.readLine());
//    senha = st.nextToken();

        while (true) {
            if(senha == null) {
                break;
            }
            senha = br.readLine();


            if(senha.length() >= MIN && senha.length() <= MAX){
                for (int i = 0; i < senha.length(); i++) {
                    c = senha.charAt(i);

                    maiuscula = (c >= 'A' && c <= 'Z') ? maiuscula+1 : maiuscula;
                    minuscula = (c >= 'a' && c <= 'z') ? minuscula+1 : minuscula;
                    numero = (c >= '0' && c <= '9') ? numero+1 : numero;
                }
            }

            if( maiuscula == 0 || minuscula == 0 || numero  == 0) { //complete o if de acordo com suas variaveis
                System.out.println("Senha invalida.");
            } else {
                System.out.println("Senha valida.");
            }
        }
        br.close();
    }
}
