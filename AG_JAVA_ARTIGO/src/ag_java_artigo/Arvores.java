/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ag_java_artigo;

/**
 *
 * @author Sander
 */
public class Arvores {
   
    private double levels;
    private double acuracia;
    private double qtdNos;

    
    /**
     * @return the levels
     */
    public double getLevels() {
        return levels;
    }

    /**
     * @param levels the levels to set
     */
    public void setLevels(double levels) {
        this.levels = levels;
    }
   
    /**
     * @return the acurarica
     */
    public double getAcuracia() {
        return acuracia;
    }

    /**
     * @param acuracia
     * 
     */
    public void setAcuracia(double acuracia) {
        this.acuracia = acuracia;
    }

    /**
     * @return the qtdNos
     */
    public double getQtdNos() {
        return qtdNos;
    }

    /**
     * @param qtdNos the qtdNos to set
     */
    public void setQtdNos(double qtdNos) {
        this.qtdNos = qtdNos;
    }
    
    @Override
    public String toString(){
        return "Arvores decisao{:"+
                " Niveis:"+this.getLevels()+" Quantidade nós: "+this.qtdNos+
                " Acurácia: "+this.acuracia+" }";
                
    }

}
