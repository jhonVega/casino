/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casinocreditos1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author jhon
 */
public class CasinoCreditos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
         Dealer d = new Dealer();
        Mesa m = new Mesa(d);
        m.jugar(2);
   
        
        
        /*
        Baraja b = new Baraja();

     //b.barajar(1);
        // b.imprimir();
        // TODO code application logic here
        //dealer
        Dealer d = new Dealer();
        d.revolver(5);
        Carta micarta = d.sacarCarta(false);
        d.pedirCarta(micarta);
        Carta micarta2 = d.sacarCarta(true);
        d.pedirCarta(micarta2);
        //mesa
        Mesa m = new Mesa(d);
        //jugador 1
        Jugador j = new Jugador("jose", 300);
        Carta micarta1 = d.sacarCarta(false);
        j.pedirCarta(micarta1);
        Carta micarta4 = d.sacarCarta(true);
        j.pedirCarta(micarta4);
        m.jugadorNew(j);
        //jugador 2
        Jugador j2 = new Jugador("pedro", 300);
        Carta micarta3 = d.sacarCarta(false);
        j2.pedirCarta(micarta3);
        Carta micarta5 = d.sacarCarta(true);
        j2.pedirCarta(micarta5);
        m.jugadorNew(j2);
        //
        //m.desCart();
        m.imprimir();
        d.pensar();
 */       
        
        //boolean x=j.pensar();
        
        
 
      //  }
        /*   Dealer d= new Dealer();
         Mesa m=new Mesa();
         d.revolver(5);
       
       
         InputStreamReader isr = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader (isr);

    
         int v=0;
         while ( v <=17 ) {
         v=d.pensar();
         System.out.println("jugador nuevo opc 1 \n  pedir cartas  opc 2 \n  mortar jugadores y cartas opc 3  \n   salir opc 4");
         int s1 = Integer.parseInt(br.readLine());
         if (s1==1){
         System.out.println("digite el nombre");
         String n= br.readLine();
         System.out.println("digite la cantida de dinero ");
         int di = Integer.parseInt(br.readLine());
         Jugador j =new Jugador(n,di);
         m.jugadoNew(j);
        
         }
       
         else if(s1==2){
         d.imprimir();
         Carta micarta  =d.sacarCarta();
         d.pedirCarta(micarta);
         Carta carta =d.sacarCarta();
         m.repartirCartas(carta);
                   
         } 
         else if(v <=17 ||s1==3){
         d.imprimir();
         m.imprimir();
         } 
         else if(s1==4){
            
         break; 
         
         } 
         else {
         System.out.println("error");
         }
       
         }*/
    }

}
