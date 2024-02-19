/*El juego «Busca el tesoro» coloca inicialmente, y de forma aleatoria, una mina y un tesoro sobre un tablero de 4 filas por 5 columnas.
    Hecho esto, el jugador debe averiguar dónde está el tesoro indicando las coordenadas (x, y). 
    Si se encuentra el tesoro el programa debe terminar con el mensaje «¡Enhorabuena! ¡Has encontrado el tesoro!». 
    Sin embargo, si se encuentra la mina el jugador pierde la partida y el programa acaba. 
    Al finalizar, se muestra el tablero completo, mostrando los disparos realizados por el jugador, la mina y el tesoro. 
    Para ayudar al jugador debemos crear una clase Tesoro que permita establecer sus coordenadas x e y.  
    Además, tenemos que implementar un método toString() en esta clase para poder mostrarlas por pantalla.*/
//Creamos la clase Tesoro con los atributos x e y//

public class Ej29t07 {
    
  private static final int FILS = 8 ;
  private static final int COLS = 8 ;

  private static final char MINA   = '*' ;
  private static final char TESORO = '€' ;
  private static final char VACIO  = ' ' ;
  private static final char TIRADA = 'X' ;

  public static void main(String[] args) {
      
      char[][] tablero = new char[FILS][COLS] ;
      //char[][] tablero = { {'P', 'Q', 'R', 'S', 'T'}, {'K', 'L', 'M', 'N', 'O'}, {'F', 'G', 'H', 'I', 'J'}, {'A', 'B', 'C', 'D', 'E'} } ;

      // inicializamos el tablero
      iniciar(tablero) ;

      // iniciar el juego
      jugar(tablero) ;
  }
    
  /**     
   * @param tablero
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
               // comprobamos si es un TESORO
               System.out.println("¡ENHORABUENA! Has encontrado el tesoro.") ;
              jugando = false ;
          } else if (tablero[coordy][coordx]== MINA -1) {
            System.out.println("La mina está cerca");
               
          }else{
             tablero[coordy][coordx] = TIRADA;
          }

      } while (jugando) ;

      // dibujar el tablero completo
      dibujar(tablero, false) ;
  }

  /**
   * Genera un número entero aleatorio entre el mínimo y
   * el máximo indicado.
   * @param min
   * @param max
   * @return
   */
  private static int generarNumero(int min, int max) {

      // [0, 1)               --- Math.random()
      // [0, max)             --- Math.random() * max
      // [min, max + min)     --- Math.random() * max + min
      // [min, max)           --- Math.random() * (max - min) +  min

      return (int) (Math.random() * (max - min)) + min  ;
  }

  /**
   * Inicializamos el tablero a vacío y colcamos al azar
   * una mina y un tesoro.
   * @param tablero
   */
  private static void iniciar(char[][] tablero) {

      for(int fil=FILS - 1; fil >= 0; fil--) {
          for(int col=0; col < COLS; col++) {
              tablero[fil][col] = VACIO ;
          }
      }

      colocarItem(tablero, MINA) ;
      colocarItem(tablero, TESORO) ;
  }

  /**
   * Colocamos un ítem en una posición aleatoria del
   * tablero.
   * @param tablero
   */
  private static void colocarItem(char[][] tablero, char item) {

      int fil  ;
      int col ;

      do {
          fil = generarNumero(0, FILS) ;
          col = generarNumero(0, COLS) ;
      } while (tablero[fil][col]!=VACIO) ;

      tablero[fil][col] = item ;
  }


  /**
   * Dibuja el tablero completo en pantalla
   * @param tablero
   * @param ocultar
   */
  private static void dibujar(char[][] tablero, boolean ocultar) {

      // Dibujamos el cuerpo del tablero
      for(int fil=FILS - 1; fil >= 0; fil--) {

          System.out.printf("%d| ", fil) ;

          for(int col=0; col < COLS; col++) {

              if (ocultar && ((tablero[fil][col] == MINA) || (tablero[fil][col]== TESORO))) {                    
                  System.out.print("  ") ;                
              } else {
                  System.out.printf("%c ", tablero[fil][col]);
              }
          }

          System.out.println();
      }

      // Dibujamos el pie del tablero
      // SEPARADOR
      System.out.print("  ") ;
      for(int col=0; col < COLS; col++) {
          System.out.printf("--") ;
      }

      // NÚMEROS
      System.out.print("\n   ") ;
      for(int col=0; col < COLS; col++) {
          System.out.printf("%d ", col) ;
      }

      System.out.println();
  }


}