package lanza_importacao;

import Entity.Executavel;
import Robo.AppRobo;
import TemplateContabil.Control.ControleTemplates;
import java.util.ArrayList;
import java.util.List;

public class Lanza_Importacao {

    public static void main(String[] args) {
        String nomeApp = "Lanza Engenharia Importação ";
        AppRobo robo = new AppRobo(nomeApp);

        robo.definirParametros();
        int mes = robo.getParametro("mes").getMes();
        int ano = robo.getParametro("ano").getInteger();

        nomeApp += mes + "/" + ano;
        robo.setNome(nomeApp);
        robo.executar(principal(mes, ano, nomeApp));
    }

    public static String principal(int mes, int ano, String nomeApp) {
        try {
            String r = "";

            System.out.println("Definindo controle...");
            ControleTemplates controle = new ControleTemplates(mes, ano, 19, "Lanza Engenharia Ltda");
            controle.definirFilesAndPaths();

            List<Executavel> executaveis = new ArrayList<>();
            executaveis.add(controle.new definirFileTemplatePadrao());
            executaveis.add(controle.new importacaoBancoExtratoExcel("Banco do Brasil", mes + ".;" + ano + ";.xlsx", 7,"A","J", "B", "D", "O","-M"));
            
            return AppRobo.rodarExecutaveis(nomeApp, executaveis);
        } catch (Exception e) {
            e.printStackTrace();
            return "Ocorreu um erro inesperado no Java: " + e;
        }
    }

}
