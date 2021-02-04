package bingo;/*
bingo
Created by: Diego Granda
Date: 04/02/2021
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class BingoFinal {
    Random random = new Random();
    int[] jugador1;
    int[] jugador2;
    int[] descartenumeros;
    int contador;
    public static void main(String[] args) {

        int[] jugador1 = new int[10];
        int[] jugador2 = new int[10];
        int[] descartenumeros = new int[100];
        int contador = 0;
    boolean victoria = false;
    MetodosBingo pato= new MetodosBingo();
    pato.rellenar(jugador1,jugador2);

    pato.bombo(descartenumeros);


//while (!victoria){



    /*if ( contador<jugador1.length) {
        for (int i = 0; i < 10; i++) {
            System.out.println(jugador1.length);

        }
        
    }*/
        
    //}



        }
    }

