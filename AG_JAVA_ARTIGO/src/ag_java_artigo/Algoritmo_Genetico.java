/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ag_java_artigo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Sander
 */
public class Algoritmo_Genetico {

    private int tamPopulacao;
    private int tamCromossomo;
    private double capacidade;
    private int grupo = 0;
    private ArrayList<Arvores> arvores_decisao = new ArrayList<>();
    private ArrayList<Redes_Neurais_MLP> redes_MLP = new ArrayList<>();
    private ArrayList<ArrayList> populacao = new ArrayList<>();
    private ArrayList<ArrayList> amostraSelecionada = new ArrayList<>();

    public Algoritmo_Genetico(int tamanhoPopulacao, int capacidadeMochila) {

        this.tamPopulacao = tamanhoPopulacao;
        this.capacidade = capacidadeMochila;
        
    }

    public void executar(int grupo) {

        criarPopulacao();
        System.out.println("\n--------------\n");
        System.out.println("\nPopulacao: ");
        for (int i = 0; i < this.tamPopulacao; i++) {

          System.out.println("Cromossomo " + i + ":" + populacao.get(i)+" => Avaliação da acurácia:" + fitness(populacao.get(i), grupo));
          
        }
        
        System.out.println("\n--------------\n"); 
        System.out.println("A amostra será composta por cromossomos com acuracia >= "+this.capacidade);
        System.out.println("Amostra Selecionada:\n" + this.amostraSelecionada); 
        
       
    }

    public void carregaArquivo(String fileName, int controlador) {
        String csvFile = fileName;
        String line = "";

        if (controlador == 1) {
            String[] arvores = null;
            try ( BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
                while ((line = br.readLine()) != null) {
                    arvores = line.split(";");
                    Arvores novaArvore = new Arvores();
                    novaArvore.setLevels(Double.parseDouble(arvores[0]));
                    novaArvore.setQtdNos(Double.parseDouble(arvores[1]));
                    novaArvore.setAcuracia(Double.parseDouble(arvores[2]));

                    arvores_decisao.add(novaArvore);
                    System.out.println(novaArvore);
                    this.tamCromossomo++;
                }// fim percurso no arquivo

                System.out.println("\nTamanho do cromossomo de arvores decisão: " + this.tamCromossomo);
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            String[] redesMLP = null;
            try ( BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
                while ((line = br.readLine()) != null) {
                    redesMLP = line.split(";");
                    Redes_Neurais_MLP novaRedeMLP = new Redes_Neurais_MLP();
                    novaRedeMLP.setLayers(Double.parseDouble(redesMLP[0]));
                    novaRedeMLP.setQtdIteracoes(Double.parseDouble(redesMLP[1]));
                    novaRedeMLP.setAcuracia(Double.parseDouble(redesMLP[2]));

                    redes_MLP.add(novaRedeMLP);
                    System.out.println(novaRedeMLP);
                    this.tamCromossomo++;
                }// fim percurso no arquivo

                System.out.println("\nTamanho do cromossomo redes MLP: " + this.tamCromossomo);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private ArrayList criarCromossomo() {

        ArrayList<Integer> novoCromossomo = new ArrayList<>(Collections.nCopies(this.tamCromossomo, 0));
        int posicaoAleatoria = (int) (Math.random() * this.tamCromossomo);
        novoCromossomo.set(posicaoAleatoria, 1);

        for (ArrayList<Integer> cromossomo : populacao) {
            if (cromossomo.equals(novoCromossomo)) {
                
                return criarCromossomo();
            }
        }

        return novoCromossomo;

    }

    private void criarPopulacao() {

        for (int i = 0; i < this.tamPopulacao; i++) {
            this.populacao.add(criarCromossomo());
        
        }
    }
    
    //----
    private double fitness(ArrayList<Integer> cromossomo, int grupo) {

        double acuracia = 0;

        for (int i = 0; i < this.tamCromossomo; i++) {

            if (cromossomo.get(i) == 1) {
                
                if(grupo==1){
                   acuracia = arvores_decisao.get(i).getAcuracia();
                }else if(grupo==2){
                   acuracia = redes_MLP.get(i).getAcuracia();
                }
            }

        }

        if (acuracia >= this.capacidade) {
            this.amostraSelecionada.add(cromossomo);
            return acuracia;
        } else {
            return 0;
        }

    }

}
