/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author eduar
 */
public class Trajinera extends Acuaticos{
    /** 
     * El nombre de la traijnera. 
     */
    private String nombre;

    /** 
     * El lugar donde opera la traijnera. 
     */
    private String lugar;

    /** 
     * El tipo de fiesta que se celebra en la traijnera. 
     */
    private String fiesta;

    /**
     * Constructor vacio
     */
    public Trajinera() {
    }

    /**
     * Constructor lleno
     * @param nombre            El nombre de la traijnera.
     * @param lugar             El lugar donde opera la traijnera.
     * @param fiesta            El tipo de fiesta que se celebra en la traijnera.
     * @param tamaño       El tamaño del medio de transporte acuático.
     * @param tipo         El tipo del medio de transporte acuático.
     * @param cuerpoDeAgua El cuerpo de agua en el que se desplaza el medio de transporte acuático.
     * @param terreno : terreno sobre el que se desplaza el transporte
     * @param distancia : distancia que va a recorrer
     * @param tiempo : cantidad de horas que se tomara  
     */
    public Trajinera(String nombre, String lugar, String fiesta, String tamaño, String tipo, String cuerpoDeAgua, String terreno, int distancia, int tiempo) {
        super(tamaño, tipo, cuerpoDeAgua, terreno, distancia, tiempo);
        this.nombre = nombre;
        this.lugar = lugar;
        this.fiesta = fiesta;
    }
    
    /**
     * Simula la acción de pedir un mariachi en la traijnera para amenizar la fiesta.
     *
     * @param horas La cantidad de horas durante las cuales se contratará al mariachi.
     */
    public void pedirMariachi(int horas) {
        System.out.println("Hemos pedido un mariachi para " + horas + " horas. ¡Que comience la fiesta!");
    }

    /**
     * Simula una atracción o actividad especial que se lleva a cabo en la traijnera.
     */
    public void atraccion() {
        System.out.println("¡Disfruten de la atracción especial de la traijnera!");
    }

    /**
     * Simula la acción de dar una vuelta en la traijnera.
     */
    public void vuelta() {
        System.out.println("Estamos dando una vuelta en la traijnera. ¡Disfruten del paseo!");
    }

    /**
     * Obtiene el nombre de la traijnera.
     *
     * @return El nombre de la traijnera.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la traijnera.
     *
     * @param nombre El nuevo nombre de la traijnera.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el lugar donde opera la traijnera.
     *
     * @return El lugar de operación de la traijnera.
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * Establece el lugar donde opera la traijnera.
     *
     * @param lugar El nuevo lugar de operación de la traijnera.
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * Obtiene el tipo de fiesta que se celebra en la traijnera.
     *
     * @return El tipo de fiesta de la traijnera.
     */
    public String getFiesta() {
        return fiesta;
    }

    /**
     * Establece el tipo de fiesta que se celebra en la traijnera.
     *
     * @param fiesta El nuevo tipo de fiesta de la traijnera.
     */
    public void setFiesta(String fiesta) {
        this.fiesta = fiesta;
    }

    /**
     * Metodo toString
     * @return 
     */
    @Override
    public String toString() {
        return "Trajinera{" + "nombre=" + nombre + ", lugar=" + lugar + ", fiesta=" + fiesta + super.toString()+'}';
    }
    
    
    
    
}
