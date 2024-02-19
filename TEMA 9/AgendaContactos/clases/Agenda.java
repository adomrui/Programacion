package clases;

/** 
 * Aplicación Agenda de Contactos
 * (INCOMPLETA: EN DESARROLLO)
 * 
 * @author Antonio J. Sánchez
 * @author José David Quero
 */

public class Agenda {

    private static final int TOTAL = 3 ;

    private int ultimo ;
    private Contacto[] listado ; // listado de contactos

    /**
     * Constructor de la clase
     */
    public Agenda() {
        this.ultimo = 0 ;
        this.listado = new Contacto[TOTAL] ;        
    }

    /**
     * @param contacto
     */
    public void crear(Contacto contacto) {        
        this.listado[this.ultimo] = contacto ;
        this.ultimo++ ;
    }

    /**
     * Comprueba si la agenda está llena
     * @return
     */
    public boolean esLlena() {
        return this.ultimo >= TOTAL-1 ;
    }

    /**
     * Devuelve el total de contactos que tenemos
     * @return
     */
    public int total() {
        return this.ultimo ;
    }

    /**     
     * @param dni
     */
    public Contacto buscarPorDni(String dni) {

        int i = 0 ;        

        while((i<this.ultimo) && (!listado[i].getDni().equals(dni))) {
            i++ ;
        }

        return (i < this.ultimo)?this.listado[i]:null ; 
    }

    /**     
     * @param id
     */
    public Contacto buscarPorId(int id) {

        int i = 0 ;        

        while(i < (id-1)) {
            i++ ;
        }

        return this.listado[i] ;
    }

    public void buscarPorNombre(String nombre){
        
    }
    /**
     * Muestra un listado de contactos
     */
    public void listar() {

        for (int i=0; i<this.ultimo; i++) {
            System.out.println("Contacto " + (i +1)) ;
            System.out.println(this.listado[i]);
        }
    }

    public void actualizar(Contacto contacto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizar'");
    }
    
}
