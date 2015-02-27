/*
 * Clase Jugador Creda el 02/10/2012
 * esta clase tiene dos atributos 
 * un (nombre, puntos) que representan los
 * 2 atributos de los jugadores de triki
 * cada atributo posee un metodo get y set
 * y la clse posee 2 constructores
 */

/**
 *
 * @author Carlos Mario Montaño lopera
 */
public class Jugador {
    private String nombre;
    private int puntos;
    
    
    /**
     * Constructor vacio
     */
    public Jugador(){
    }
    
    /**
     * Constructor lleno
     * @param nombre: nombre del jugador
     */
    public Jugador(String nombre){
        this.nombre = nombre;
        this.puntos = 0;
    }

    
    
    //----Bloque de encapsulamiento----\\
    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
