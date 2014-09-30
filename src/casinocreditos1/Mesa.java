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
public class Mesa {

    private List<Jugador> jugadores;
    private List<Carta> cartas;
    private Dealer dealer;

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public Mesa(Dealer de) {
        dealer = de;
        jugadores = new ArrayList<>();
        cartas = new ArrayList<>();
    }

    public void jugadorNew(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    public void imprimir() {
//me imprime la baraja
        Iterator<Jugador> jugadoresIterator = jugadores.iterator();
// usamos iterator para q me imprima todas las cartas de la lista
        dealer.imprimir();
        while (jugadoresIterator.hasNext()) {
            Jugador elemento = jugadoresIterator.next();
            System.out.print("\n" + "nombre: " + elemento.getNombre() + "  dinero: " + elemento.getDinero() + "\n");
            elemento.imprimir();
        }
    }

    public void desCart() {
        cartas = dealer.getCartas();
        Iterator<Carta> cartasIterator = cartas.iterator();                                 // usamos iterator para q me imprima todas las cartas de la lista
        while (cartasIterator.hasNext()) {
            Carta elemento = cartasIterator.next();
            elemento.setTapDes(false);
        }
        dealer.setCartas(cartas);
    }

    public void penJugador(Dealer d, int v2) {
        for (Jugador jugador : jugadores) {
            boolean x = jugador.pensar(v2);
            while (x == true) {
                Carta micarta5 = d.sacarCarta(true);
                jugador.pedirCarta(micarta5);
                x = jugador.pensar(v2);
            }
        }
    }

    public void jugar(int v) {
        Baraja b = new Baraja();
        Dealer d = new Dealer();
        Mesa m = new Mesa(d);
        d.revolver(5);
        Carta micarta = d.sacarCarta(false);
        d.pedirCarta(micarta);
        Carta micarta1 = d.sacarCarta(true);
        d.pedirCarta(micarta1);
        int v2 = 0;
        List<Carta> car = d.getCartas();
        for (Carta cart : car) {
            String a = cart.getValor();
            if (a.matches("[A-Za-z]")) {
                if (a.matches("A")) {
                    v2 = v2 + 11;
                } else {
                    v2 = v2 + 10;
                }
            } else {
                v2 = v2 + Integer.parseInt(cart.getValor());
            }
        }
        for (int i = 0; i < v; i++) {
            Jugador j = new Jugador("jugador" + i, 300);
            Carta micarta2 = d.sacarCarta(false);
            j.pedirCarta(micarta1);
            Carta micarta3 = d.sacarCarta(true);
            j.pedirCarta(micarta2);
            m.jugadorNew(j);
        }
        m.penJugador(d, v2);
        boolean xd = d.pensar();

        while (xd == false) {

            Carta micarta6 = d.sacarCarta(true);
            d.pedirCarta(micarta6);
            xd = d.pensar();
        }
        m.imprimir();
    }
}
