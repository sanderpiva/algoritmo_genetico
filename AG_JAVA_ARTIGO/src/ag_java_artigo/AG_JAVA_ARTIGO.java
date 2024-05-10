/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ag_java_artigo;

/**
 *
 * @author Sander
 */
public class AG_JAVA_ARTIGO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int populacao = 10;
        int acuraciaArvores = 90;
        int acuraciaRedesMLP = 85;
        int grupoArvoresDecisao = 1;
        int grupoRedesMLP = 2;

        System.out.println("\n--------------");
        System.out.println("\nBem vindo ao Sistema Algoritmo Genético");
        System.out.println("\n--------------");
       
        Algoritmo_Genetico meuAg1 = new Algoritmo_Genetico(populacao, acuraciaArvores);
        System.out.println("\nGrupo dos algoritmos arvores de decisão: \n");
        meuAg1.carregaArquivo("dados_arvores_decisao.csv", grupoArvoresDecisao);
        meuAg1.executar(grupoArvoresDecisao);
        Algoritmo_Genetico meuAg2 = new Algoritmo_Genetico(populacao, acuraciaRedesMLP);
        System.out.println("\nGrupo dos algoritmos redes neurais MLP: \n");
        meuAg2.carregaArquivo("dados_redes_neurais.csv", grupoRedesMLP);
        meuAg2.executar(grupoRedesMLP);
    }

}
