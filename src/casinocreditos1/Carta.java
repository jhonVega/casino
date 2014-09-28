/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package casinocreditos1;

/**
 *
 * @author jhon vega
 */


public class Carta {
   
    private String valor ;
    private String figura;
    private boolean tapDes;

    public Carta(boolean tapDes) {
        this.tapDes = tapDes;
    }

    public boolean isTapDes() {
        return tapDes;
    }

    public void setTapDes(boolean tapDes) {
        this.tapDes = tapDes;
    }
    
    public Carta(int j, int i) {                                                    

        String valor1[] = {"A", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "J", "Q", "k"};
        String figura1[] = {"♥", "♣", "♠", "♦"};                                      
        this.valor = valor1[j];
        this.figura = figura1[i];
    }
    public void tapadaDes(boolean v){
        if (v==true){
             this.tapDes = true;
            
        }
        else
            this.tapDes = false;     
    }
     
public boolean gettapDes(){
    return tapDes;
}
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

}
