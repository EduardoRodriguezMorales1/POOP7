/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author eduar
 */
public class Barco extends Acuaticos {
    /** 
     * El número de días en el mar. 
     */
    private int dias;
    
    /** 
     * El nombre del mar en el que navega el barco. 
     */
    private String mar;
    
    /** 
     * La actividad actual del barco. 
     */
    private String actividad;

    /**
     * Constructorvacio
     */
    public Barco() {
    }

    /**
     * Constructor lleno
     * @param dias              El número de días en el mar.
     * @param mar               El nombre del mar en el que navega el barco.
     * @param actividad         La actividad actual del barco.
     * @param tamaño       El tamaño del medio de transporte acuático.
     * @param tipo         El tipo del medio de transporte acuático.
     * @param cuerpoDeAgua El cuerpo de agua en el que se desplaza el medio de transporte acuático.
     * @param terreno : terreno sobre el que se desplaza el transporte
     * @param distancia : distancia que va a recorrer
     * @param tiempo : cantidad de horas que se tomara 
     */
    public Barco(int dias, String mar, String actividad, String tamaño, String tipo, String cuerpoDeAgua, String terreno, int distancia, int tiempo) {
        super(tamaño, tipo, cuerpoDeAgua, terreno, distancia, tiempo);
        this.dias = dias;
        this.mar = mar;
        this.actividad = actividad;
    }
    
    /**
     * Simula la acción de avistar tierra mientras se navega en el barco.
     */
    public void tierraALaVista() {
        System.out.println("¡Tierra a la vista!");
    }

    /**
     * Simula la acción de elevar las anclas del barco.
     */
    public void elevarAnclas() {
        System.out.println("Se están elevando las anclas del barco.");
    }

    /**
     * Simula un encuentro con piratas en alta mar.
     */
    public void piratas() {
        System.out.println("¡Piratas a la vista! Preparad las defensas.");
    }

    /**
     * Obtiene el número de días en el mar.
     *
     * @return El número de días en el mar.
     */
    public int getDias() {
        return dias;
    }

    /**
     * Establece el número de días en el mar.
     *
     * @param dias El nuevo número de días en el mar.
     */
    public void setDias(int dias) {
        this.dias = dias;
    }

    /**
     * Obtiene el nombre del mar en el que navega el barco.
     *
     * @return El nombre del mar.
     */
    public String getMar() {
        return mar;
    }

    /**
     * Establece el nombre del mar en el que navega el barco.
     *
     * @param mar El nuevo nombre del mar.
     */
    public void setMar(String mar) {
        this.mar = mar;
    }

    /**
     * Obtiene la actividad actual del barco.
     *
     * @return La actividad actual del barco.
     */
    public String getActividad() {
        return actividad;
    }

    /**
     * Establece la actividad actual del barco.
     *
     * @param actividad La nueva actividad actual del barco.
     */
    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    @Override
    public String toString() {
        return "Barco{" + "dias=" + dias + ", mar=" + mar + ", actividad=" + actividad + super.toString()+'}';
    }
    
    
    
    
}
