/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_retorno.ejempplos;

import java.util.ArrayList;

/**
 *
 * @author Anthonny
 */
public class Metodos_RetornoEjempplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //Siempre cuando llamamos el metodo lo llamamos con una variable del mismo dato del metodo.
        boolean condicion = pruebaBoolean();
        String frase = pruebaString();
        int tipoCambio = pruebaInteger();
        int sueldoColones = 100000;
        int sueldoDolares = sueldoColones / tipoCambio;
        ////////////////////////////////////////////////////////////////////////////////////////////
        //System.out.println("El sueldo en dólares es: $" + sueldoDolares);
        //System.out.println(frase + sueldoDolares);
        if (condicion)
        {
            System.out.println("La condición es verdadera"); 
            System.out.println("El sueldo en dólares es: $" + sueldoDolares); 
        }     

        ArrayList listaVariada = pruebaListas();
        System.out.println("La lista variada es: " + listaVariada);
    }

    public static int pruebaInteger() {
        int tipoCambio = 580;
        return tipoCambio;
    }

    public static String pruebaString() {
        String frase = "El sueldo en dólares$$$$$ es: $";
        return frase;
    }

    public static boolean pruebaBoolean() {
        boolean condicion = true;
        return condicion;
    }

    
    
    public static ArrayList pruebaListas() {

        ArrayList ListaVariada = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            if ((i == 2) || (i == 6) || (i == 17)) {
                ListaVariada.add("este es string");
            } else if ((i == 5) || (i == 9) || (i == 15)) {
                boolean esBoolean = true;
                ListaVariada.add(esBoolean);
            } else {
                ListaVariada.add(i);
            }
        }

        return ListaVariada;
    }
}

    

