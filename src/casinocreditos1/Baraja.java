/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casinocreditos1;

/**
 *
 * @author jhon
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Baraja {                                                           //

    int nCartas = 52;
    private List<Carta> baraja;

    public Baraja() {
        //me crea las 52 carta en una lista
        baraja = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                //adiciona las cartas nuevas
                baraja.add(new Carta(j, i));
            }
        }
    }

    public void imprimir() {
        //imprime la baraja
        Iterator<Carta> barajaIterator = baraja.iterator();
        // usamos iterator para q me imprima todas las cartas de la lista
        while (barajaIterator.hasNext()) {
            Carta elemento = barajaIterator.next();
            System.out.print(elemento.getValor() + " de " + elemento.getFigura() + "\n");
        }
        System.out.print(baraja.size() + " cartas");
    }

    public void barajar(int nBarajadas) {
        //barajamos el paquete de carta
        for (int i = 0; i < nBarajadas; i++) {
            List<Carta> estadoActual = this.baraja;
            List<Carta> nuevoEstado = new ArrayList<>();
            //creamos dos listas nuevas para barajar
            while (estadoActual.size() > 0) {
                int longi = estadoActual.size();
                Random ran = new Random();
                //hace numeros aleatorios segun la loguito de la lista
                int ran1 = ran.nextInt(longi);
                Carta n = estadoActual.get(ran1);
                estadoActual.remove(n);
                nuevoEstado.add(n);
            }
            this.baraja = nuevoEstado;
            //a baraja le damos el estadonuevo de la baraja
        }
    }

    public Carta sacarCarta() {
        Carta carta = this.baraja.get(0);
        this.baraja.remove(carta);
        return carta;
    }
}
