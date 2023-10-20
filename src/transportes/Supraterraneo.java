/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author Mariana Eduardo Adolfo
 */
public class Supraterraneo extends Terrestres{
    /** 
     * El nombre de la calle donde opera el Supraterraneo. 
     */
    private String calle;
    
    /** 
     * La zona geográfica donde opera el Supraterraneo. 
     */
    private int zona;
    
    /** El paradero actual del Supraterraneo. */
    private String paradero;

    /**
     * Constructor vacio
     */
    public Supraterraneo() {
    }

    /**
     * 
    * @param calle     El nombre de la calle donde opera el Supraterraneo.
     * @param zona      La zona geográfica donde opera el Supraterraneo.
     * @param paradero  El paradero actual del Supraterraneo.
     * @param tipoDeRuta    El tipo de ruta del transporte.
     * @param pasajeros     El número de pasajeros del transporte.
     * @param velocidad     La velocidad del transporte.
     * @param terreno : terreno sobre el que se desplaza el transporte
     * @param distancia : distancia que va a recorrer
     * @param tiempo : cantidad de horas que se tomara 
     */
    public Supraterraneo(String calle, int zona, String paradero, String tipoDeRuta, int pasajeros, int velocidad, String terreno, int distancia, int tiempo) {
        super(tipoDeRuta, pasajeros, velocidad, terreno, distancia, tiempo);
        this.calle = calle;
        this.zona = zona;
        this.paradero = paradero;
    }


    
    /**
     * Metodo 
     * Simula la salida del Supraterraneo desde su ubicación actual.
     */
    public void salida() {
        System.out.println("El Supraterraneo ha salido.");
    }

    /**
     * Simula la solicitud de una parada por parte del Supraterraneo.
     */
    public void pedirParada() {
        System.out.println("El Supraterraneo ha pedido una parada.");
    }

    /**
     * Simula la solicitud de bajarse en una ubicación específica por parte del Supraterraneo.
     *
     * @param lugar El lugar donde el Supraterraneo desea bajarse.
     */
    public void pedirBajada(String lugar) {
        System.out.println("El Supraterraneo ha pedido bajarse en " + lugar);
    }

    /**
     * Obtiene el nombre de la calle donde opera el Supraterraneo.
     *
     * @return El nombre de la calle.
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Establece el nombre de la calle donde opera el Supraterraneo.
     *
     * @param calle El nuevo nombre de la calle.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene la zona geográfica donde opera el Supraterraneo.
     *
     * @return La zona geográfica.
     */
    public int getZona() {
        return zona;
    }

    /**
     * Establece la zona geográfica donde opera el Supraterraneo.
     *
     * @param zona La nueva zona geográfica.
     */
    public void setZona(int zona) {
        this.zona = zona;
    }


    /**
     * Obtiene el paradero actual del Supraterraneo.
     *
     * @return El paradero actual.
     */
    public String getParadero() {
        return paradero;
    }

    /**
     * Establece el paradero actual del Supraterraneo.
     *
     * @param paradero El nuevo paradero actual.
     */
    public void setParadero(String paradero) {
        this.paradero = paradero;
    }

    @Override
    public String toString() {
        return "Supraterraneo{" + "calle=" + calle + ", zona=" + zona + ", paradero=" + paradero +super.toString()+ '}';
    }
    

    

    
    
}
