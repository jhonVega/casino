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
public class Dealer {

    private Baraja baraja;
    private List<Carta> cartas;

    public Baraja getBaraja() {
        return baraja;
    }

    public void setBaraja(Baraja baraja) {
        this.baraja = baraja;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public Dealer() {

        cartas = new ArrayList<>();
        baraja = new Baraja();

    }

    public void revolver(int nBarajadas) {
        //utiliza el metodo de bajajar de la clase baraja
        baraja.barajar(nBarajadas);
    }

    public Carta sacarCarta(boolean v) {

        Carta carta = this.baraja.sacarCarta();
        carta.tapadaDes(v);
        return carta;

    }

    public void pedirCarta(Carta micarta) {

        this.cartas.add(micarta);
    }

    public boolean pensar() {
        //en ete metodo retorna boolean 
        boolean b = false;
        //contate del valor de las cartas
        int v = 0;
        //as = cantidad de A q tiene
        int as = 0;
        Iterator<Carta> cartasIterator = cartas.iterator();
         // usamos iterator para q me imprima todas las cartas de la lista
        while (cartasIterator.hasNext()) {
            Carta elemento = cartasIterator.next();
            String a = elemento.getValor();
            // toma todas las figuras como 10 y el A como 11 
            if (a.matches("[A-Za-z]")) {
                if (a.matches("A")) {
                    v = v + 11;
                    as = 1 + as;

                } else {
                    v = v + 10;
                }

            } else {
                v = v + Integer.parseInt(elemento.getValor());
            }
        }
        //toma el A como 1 si se paso de 21
        if ((v > 21) && (as >= 1)) {
            as = as - 1;
            int v1 = v;
            v = v - 10;
        }
        if (v >= 17) {

            b = true;

        } else {
            b = false;

        }
        return b;
    }

    public void imprimir() {
      //me imprime la baraja
        Iterator<Carta> cartasIterator = cartas.iterator();
        System.out.print("Dealer \n");
        // usamos iterator para q me imprima todas las cartas de la lista
        while (cartasIterator.hasNext()) {
            Carta elemento = cartasIterator.next();
            if (elemento.gettapDes() == true) {
                System.out.print("(" + elemento.getValor() + elemento.getFigura() + ")");
            } else {
                System.out.print(elemento.getValor() + elemento.getFigura() + " ");
            }

        }
    }

}
