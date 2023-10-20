/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author Mariana Eduardo Adolfo
 */
public class Taxi extends Supraterraneo{
    /** 
     * La plataforma de origen del taxi. 
     */
    private String plataforma;

    /** 
     * La placa del taxi. 
     */
    private String placa;

    /** 
     * La identificación del taxi. 
     */
    private int identificacion;

    /**
     * Constructor vacio
     */
    public Taxi() {
    }

    /**
     * Constructor lleno
     * @param plataforma         La plataforma de origen del taxi.
     * @param placa              La placa del taxi.
     * @param identificacion     La identificación del taxi.
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
    public Taxi(String plataforma, String placa, int identificacion, String calle, int zona, String paradero, String tipoDeRuta, int pasajeros, int velocidad, String terreno, int distancia, int tiempo) {
        super(calle, zona, paradero, tipoDeRuta, pasajeros, velocidad, terreno, distancia, tiempo);
        this.plataforma = plataforma;
        this.placa = placa;
        this.identificacion = identificacion;
    }
    
    /**
     * Simula la tarifa del servicio de taxi.
     */
    public void tarifa() {
        System.out.println("Se ha calculado la tarifa del taxi.");
    }

    /**
     * Simula la comprobación de límite de zona del taxi.
     */
    public void limiteDeZona() {
        System.out.println("El taxi está comprobando el límite de zona.");
    }

    /**
     * Simula la acción de rebasar por parte del taxi.
     */
    public void rebasar() {
        System.out.println("El taxi está rebasando a otro vehículo.");
    }

    /**
     * Obtiene la plataforma de origen del taxi.
     *
     * @return La plataforma de origen del taxi.
     */
    public String getPlataforma() {
        return plataforma;
    }

    /**
     * Establece la plataforma de origen del taxi.
     *
     * @param plataforma La nueva plataforma de origen del taxi.
     */
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    /**
     * Obtiene la placa del taxi.
     *
     * @return La placa del taxi.
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Establece la placa del taxi.
     *
     * @param placa La nueva placa del taxi.
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Obtiene la identificación del taxi.
     *
     * @return La identificación del taxi.
     */
    public int getIdentificacion() {
        return identificacion;
    }

    /**
     * Establece la identificación del taxi.
     *
     * @param identificacion La nueva identificación del taxi.
     */
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "Taxi{" + "plataforma=" + plataforma + ", placa=" + placa + ", identificacion=" + identificacion + super.toString()+'}';
    }
    
    
    
    
    
}
