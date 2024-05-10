/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ag_java_artigo;

/**
 *
 * @author Sander
 */
public class Redes_Neurais_MLP {
    
    private double layers;
    private double acuracia;
    private double qtdIteracoes;

    
    /**
     * @return the layers
     */
    public double getLayers() {
        return layers;
    }

    /**
     * @param layers the layers to set
     */
    public void setLayers(double layers) {
        this.layers = layers;
    }

    /**
     * @return the acuracia
     */
    public double getAcuracia() {
        return acuracia;
    }

    /**
     * @param acuracia the acuracia to set
     */
    public void setAcuracia(double acuracia) {
        this.acuracia = acuracia;
    }
    
    
    /**
     * @return the qtdIteracoes
     */
    public double getQtdIteracoes() {
        return qtdIteracoes;
    }

    /**
     * @param qtdIteracoes the qtdIteracoes to set
     */
    public void setQtdIteracoes(double qtdIteracoes) {
        this.qtdIteracoes = qtdIteracoes;
    }
    
    
    
    @Override
    public String toString(){
        return "Redes Neurais MLP{:"+
                " Nº camadas:"+this.getLayers()+" Quantidade maxima de iteracoes: "+this.qtdIteracoes+
                " Acurácia: "+this.getAcuracia()+" }";
                
    }


}
