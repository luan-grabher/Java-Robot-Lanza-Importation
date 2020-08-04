package packTeste;

import lanza_importacao.LanzaImportacao;

public class testeMain {

    public static void main(String[] args) {
        int mes = 2;
        int ano = 2020;
        String nomeApp = "Teste";

        System.out.println(LanzaImportacao.principal(mes, ano, nomeApp).replaceAll("<br>", "\n")
        );
    }
}
