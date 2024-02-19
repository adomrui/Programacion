import java.util.Scanner;

public class Examen {
    private static final int FILS = 6 ;
    private static final int COLS = 8 ;
    private static final char MINA   = '*' ;
    private static final char TESORO = '€' ;
    private static final char VACIO  = ' ' ;
    private static final char TIRADA = 'X' ;
    public static void main(String[] args) {
        int respuesta;
        char[][] tablero= new char[FILS][COLS] ;
        Scanner sc = new Scanner(System.in);
        System.out.println("LA BÚSQUEDA DEL TESORO");
        System.out.println("0.Fácil");
        System.out.println("1.Normal");
        System.out.println("2.Difícil");
        respuesta=sc.nextInt();
        System.out.printf("\033[H\033[2J\n");
        switch (respuesta){
            case 0:
                iniciar(tablero) ;
                jugar(tablero) ;
                
            break;

            case 1:
                /*antes de iniciar especificaría el nº de minas */
                iniciar(tablero) ;
                jugar(tablero) ;
            break;

            case 2:
                iniciar(tablero) ;
                jugar(tablero) ;
            break;
            
        default :
                System.out.println("Opción no válida, por favor elija entre  0 y 2.");
        }
    }


/**
   *Nos va a generar un mínimo y un máximo
   * @param min
   * @param max
   * @return
   */
private static int generarNumero(int min, int max) {

    return (int) (Math.random() * (max - min)) + min  ;
}

/* Dibujamos el tablero con las especificaciones que nos piden */
private static void dibujar(char[][] tablero, boolean ocultar) {

    
    for(int fila=FILS - 1; fila >= 0; fila--) {

        System.out.printf("%d| ", fila) ;

        for(int columna=0; columna < COLS; columna++) {

            if (ocultar && ((tablero[fila][columna] == MINA) || (tablero[fila][columna]== TESORO))) {                    
                System.out.print("  ") ;                
            } else {
                System.out.printf("%c ", tablero[fila][columna]);
            }
        }

        System.out.println();
    }


    System.out.print("  ") ;
    for(int columna=0; columna < COLS; columna++) {
        System.out.printf("--") ;
    }

    
    System.out.print("\n   ") ;
    for(int columna=0; columna < COLS; columna++) {
        System.out.printf("%d ", columna) ;
    }

    System.out.println();
}
/*La función de jugar la haremos  con un bucle hasata que falle o acierte,
*/
private static void jugar(char[][] tablero) {

    int coordx = 0;
    int coordy = 0;
    boolean jugando = true ;

    do {

        // dibujar el tablero ocultando la mina y 
        // el tesoro
        dibujar(tablero, true) ;
      
        // solicitamos las coordenadas del tiro
        try {
          // solicitamos las coordenadas del tiro
            System.out.print("Coordenada x: ") ;
            coordx = Integer.parseInt(System.console().readLine()) ;
            System.out.print("Coordenada y: ") ;
            coordy = Integer.parseInt(System.console().readLine()) ;
        } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Introduce coordenadas válidas.");
        jugando = false;
        }

        if (tablero[coordy][coordx]==MINA) {
             // comprobamos si es una MINA
            System.out.println("¡BOOM! Lo siento, has perdido.") ;
            jugando = false ;
        } else if (tablero[coordy][coordx]==TESORO) {
            System.out.println("¡ENHORABUENA! Has encontrado el tesoro.") ;
            jugando = false ;
        } else if (tablero[coordy][coordx]== tablero[coordy -1][coordx-1]) {
            System.out.println("La mina está cerca");
        /* }else if (tablero[coordy][coordx]== tablero[coordy ][coordx-1]) {
            System.out.println("La mina está cerca");
        }else if (tablero[coordy][coordx]== tablero[coordy +1][coordx-1]) {
            System.out.println("La mina está cerca");
        }else if (tablero[coordy][coordx]== tablero[coordy +1][coordx]) {
            System.out.println("La mina está cerca");
        }else if (tablero[coordy][coordx]== tablero[coordy +1][coordx +1]) {
            System.out.println("La mina está cerca");*/
        }else{
            tablero[coordy][coordx] = TIRADA;
        }
        dibujar(tablero, false) ;
    } while (jugando) ;

    // dibujar el tablero completo
    
}
/* Inicializamos el tablero a vacío y colcamos al azar
* una mina y un tesoro.
* @param tablero
*/
private static void iniciar(char[][] tablero) {

    for(int fila=FILS - 1; fila >= 0; fila--) {
        for(int columna=0; columna < COLS; columna++) {
            tablero[fila][columna] = VACIO ;
        }
    }
    
        /*throw new UnsupportedOperationException("Unimplemented method 'iniciar'");*/
        colocarmina(tablero, MINA) ;
        colocarItem(tablero, TESORO) ;
    }


/**
   * Colocamos un ítem en una posición aleatoria del
   * tablero.
   * @param tablero
   */
private static void colocarItem(char[][] tablero, char item) {

    int fila  ;
    int columna ;

    do {
        fila = generarNumero(0, FILS) ;
        columna = generarNumero(0, COLS) ;
    } while (tablero[fila][columna]!=VACIO) ;

    tablero[fila][columna] = item ;
}


/* 
* Colocamos un ítem en una posición aleatoria del
* tablero.
* @param tablero
*/
private static void colocarmina(char[][] tablero, char item) {
int fila  ;
int columna ;

do {
    fila = generarNumero(0, FILS) ;
    columna = generarNumero(0, COLS) ;
} while (tablero[fila][columna]!=VACIO) ;

tablero[fila][columna] = item ;

}

}

