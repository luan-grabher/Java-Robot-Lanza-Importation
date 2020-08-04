package packTeste;

import lanza_importacao.Lanza_Importacao;

public class testeMain {

    public static void main(String[] args) {
        int mes = 2;
        int ano = 2020;
        String nomeApp = "Teste";

        System.out.println(
                Lanza_Importacao.principal(mes, ano, nomeApp).replaceAll("<br>", "\n")
        );
    }
}
