/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author Mariana Eduardo Adolfo
 */
public class Terrestres extends MediosDeTransportes{
    private String tipoDeRuta;
    private int pasajeros;
    private int velocidad;

    /**
     * Constructor vacio
     */
    public Terrestres() {
    }

    /**
     * Constructor lleno
     * @param tipoDeRuta para donde va el transporte 
     * @param pasajeros cantidad de pasajeros que puede llevar 
     * @param velocidad
     * @param terreno : terreno sobre el que se desplaza el transporte
     * @param distancia : distancia que va a recorrer
     * @param tiempo : cantidad de horas que se tomara 
     */
    public Terrestres(String tipoDeRuta, int pasajeros, int velocidad, String terreno, int distancia, int tiempo) {
        super(terreno, distancia, tiempo);
        this.tipoDeRuta = tipoDeRuta;
        this.pasajeros = pasajeros;
        this.velocidad = velocidad;
    }

    
    

    
    /**
     * Devuelve el tipo de ruta del transporte.
     *
     * @return El tipo de ruta del transporte.
     */
    public String getTipoDeRuta() {
        return tipoDeRuta;
    }

    /**
     * Establece el tipo de ruta del transporte.
     *
     * @param tipoDeRuta El nuevo tipo de ruta del transporte.
     */
    public void setTipoDeRuta(String tipoDeRuta) {
        this.tipoDeRuta = tipoDeRuta;
    }

    /**
     * Devuelve el número de pasajeros del transporte.
     *
     * @return El número de pasajeros del transporte.
     */
    public int getPasajeros() {
        return pasajeros;
    }

    /**
     * Establece el número de pasajeros del transporte.
     *
     * @param pasajeros El nuevo número de pasajeros del transporte.
     */
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    /**
     * Devuelve la velocidad máxima del transporte.
     *
     * @return La velocidad máxima del transporte.
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * Establece la velocidad máxima del transporte.
     *
     * @param velocidad La nueva velocidad máxima del transporte.
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * Abre las puertas del transporte.
     */
    public void abrirPuertas() {
        System.out.println("Abriendo puertas...");
    }

    /**
     * Cierra las puertas del transporte.
     */
    public void cerrarPuertas() {
        System.out.println("Cerrando puertas...");
    }

    /**
     * Calcula el costo del transporte.
     *
     * @param costo El costo por pasajero.
     *
     * @return El costo total del transporte.
     */
    public int costo(int costo) {
        return costo * pasajeros;
    }

    /**
     * Devuelve una representación en cadena del transporte.
     *
     * @return Una representación en cadena del transporte.
     */
    @Override
    public String toString() {
        return "Terrestres{" + "tipoDeRuta='" + tipoDeRuta + '\'' + ", pasajeros=" + pasajeros + ", velocidad='" + velocidad + '\'' + '}';
    }
    
    
}
