/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author Mariana Eduardo Adolfo
 */
public class Acuaticos extends MediosDeTransportes{
    private String tamaño;
    private String tipo;
    private String cuerpoDeAgua;

    /**
     * Constructor vacio
     */
    public Acuaticos() {
    }
    
    /**
     * Constrctor lleno 
     * @param tamaño       El tamaño del medio de transporte acuático.
     * @param tipo         El tipo del medio de transporte acuático.
     * @param cuerpoDeAgua El cuerpo de agua en el que se desplaza el medio de transporte acuático.
     * @param terreno : terreno sobre el que se desplaza el transporte
     * @param distancia : distancia que va a recorrer
     * @param tiempo : cantidad de horas que se tomara 
     */
    public Acuaticos(String tamaño, String tipo, String cuerpoDeAgua, String terreno, int distancia, int tiempo) {    
        super(terreno, distancia, tiempo);
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.cuerpoDeAgua = cuerpoDeAgua;
    }

    /**
     * Devuelve el tamaño del medio de transporte acuático.
     *
     * @return El tamaño del medio de transporte acuático.
     */
    public String getTamaño() {
        return tamaño;
    }
    /**
     * Establece el tamaño del medio de transporte acuático.
     *
     * @param tamaño El nuevo tamaño del medio de transporte acuático.
     */
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    /**
     * Devuelve el tipo del medio de transporte acuático.
     *
     * @return El tipo del medio de transporte acuático.
     */
    public String getTipo() {
        return tipo;
    }
     /**
     * Establece el tipo del medio de transporte acuático.
     *
     * @param tipo El nuevo tipo del medio de transporte acuático.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
     /**
     * Devuelve el cuerpo de agua en el que se desplaza el medio de transporte acuático.
     *
     * @return El cuerpo de agua en el que se desplaza el medio de transporte acuático.
     */
    public String getCuerpoDeAgua() {
        return cuerpoDeAgua;
    }
    /**
     * Establece el cuerpo de agua en el que se desplaza el medio de transporte acuático.
     *
     * @param cuerpoDeAgua El nuevo cuerpo de agua en el que se desplaza el medio de transporte acuático.
     */

    public void setCuerpoDeAgua(String cuerpoDeAgua) {
        this.cuerpoDeAgua = cuerpoDeAgua;
    }
    /**
     * Advierte a los pasajeros que no se avienten al agua.
     */
    public void noAventarse() {
        System.out.println("¡No te avientes al agua!");
    }
    /**
     * Proporciona un protocolo para los pasajeros que sienten mareos.
     */
    public void protocoloPorMareos() {
        System.out.println("Si sientes mareos, quédate quieto y descansa.");
    }

    @Override
    public String toString() {
        return "Acuaticos{" + "tama\u00f1o=" + tamaño + ", tipo=" + tipo + ", cuerpoDeAgua=" + cuerpoDeAgua + super.toString()+ '}';
    }
    
    
}
