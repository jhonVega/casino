/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casinocreditos1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author jhon
 */
public class Jugador {

    private String Nombre;
    private int dinero;
    private List<Carta> cartas;

    public Jugador(String Nombre, int dinero) {
        this.Nombre = Nombre;
        this.dinero = dinero;

        cartas = new ArrayList<>();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public void pedirCarta(Carta micarta) {
        this.cartas.add(micarta);
    }

    public void Cartas() {
        Iterator<Carta> cartasIterator = cartas.iterator();                                 // usamos iterator para q me imprima todas las cartas de la lista
        while (cartasIterator.hasNext()) {
            Carta elemento = cartasIterator.next();
            System.out.print(elemento.getValor() + " de " + elemento.getFigura() + "\n");
        }

    }

    public void imprimir() {                                                         //me imprime la baraja

        Iterator<Carta> cartasIterator = cartas.iterator();                                 // usamos iterator para q me imprima todas las cartas de la lista
        while (cartasIterator.hasNext()) {
            Carta elemento = cartasIterator.next();

            if (elemento.gettapDes() == true) {
                System.out.print("(" + elemento.getValor() + elemento.getFigura() + ")");
            } else {
                System.out.print(elemento.getValor() + elemento.getFigura() );
            }

        }

    }
// 7 cartas y 5 cartas, arreglos  de cartas en mesa para destaparlas 
    public boolean pensar(int v2) {
        boolean b = true ;
        int v = 0;
        int as = 0;
        Iterator<Carta> cartasIterator = cartas.iterator();   
        // usamos iterator para q me imprima todas las cartas de la lista
        int c= cartas.size();
        while (cartasIterator.hasNext()) {
            Carta elemento = cartasIterator.next();
            String a = elemento.getValor();

            if (a.matches("[A-Za-z]")) {
                if (a.matches("A")) {
                    v = v + 11;
                    as = 1+as;

                } else {
                    v = v + 10;
                }
            } else {
                v = v + Integer.parseInt(elemento.getValor());
               
            }
        }
        if ((v >21 )&&(as>=1) ) {
            as=as-1;
           int  v1=v;
            v=v-10;
        } 
        if ((v2<=21) && (v2 >=17 )&&(v>v2)|| (v2==21)){
            b=false;
            
        }
        
        if ((v >=19)||(c >=5 && v<=21 && v>=18) ) {
           
            b=false;
        } 
        else if (v>21){
          b=false;
    }
        else {
            b=true;

        }
        return b;

    }

}
