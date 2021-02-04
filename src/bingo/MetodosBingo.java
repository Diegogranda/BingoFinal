package bingo;

public class MetodosBingo {
    public void rellenar(int[]jugador1,int[]jugador2){
        System.out.println("\nTabla jugador 1");
        for (int i = 0; i < jugador1.length; i++) {
            int nRandom = (int) (Math.random()*100);
            System.out.print( nRandom + " ");
            jugador1[i]=nRandom;


        }
        System.out.println("\nTabla jugador 2");
        for (int i = 0; i < jugador2.length; i++) {
            int nRandom = (int) (Math.random()*100);
            System.out.print(nRandom + " ");
            jugador2[i]=nRandom;



        }
    }


    public void bombo(int[]descartenumeros) {
        boolean repetido = false;
        System.out.println("\n Números del bingo");
        for (int i = 0; i < descartenumeros.length; i++) {
            int nRandom = (int) (Math.random() * 100);
            if (descartenumeros[i] == nRandom) {// si el valor generado aleatoriamente esta
                // dentro del array le marcamos como true y
                // por lo tanto no lo metera en el array
                repetido = true;
            } else if (descartenumeros[i] != nRandom) {

                repetido = false;
            }
            if (repetido) {
                repetido = false;
            } else {
                descartenumeros[i] = nRandom;
            }

            System.out.print(descartenumeros[i] + " ");
        }

    }
}






