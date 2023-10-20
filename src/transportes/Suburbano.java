/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author Mariana Eduardo Adolfo
 */
public class Suburbano extends Subterraneo{
    /** 
     * El destino del tren suburbano. 
     */
    private String destino;

    /** 
     * El paradero actual del tren suburbano. 
     */
    private String paradero;

    /** 
     * El número de identificación del tren suburbano. 
     */
    private int numeroID;

    /**
     * Constructor vacio
     */
    public Suburbano() {
    }

    /**
     * 
     * @param destino           El destino del tren suburbano.
     * @param paradero          El paradero actual del tren suburbano.
     * @param numeroID          El número de identificación del tren suburbano.
     * @param linea        La línea del subterráneo.
     * @param numDeLineas   El número de líneas del subterráneo.
     * @param tiempoDeEspera El tiempo de espera del subterráneo.
     * @param tipoDeRuta    El tipo de ruta del subterráneo.
     * @param pasajeros     El número de pasajeros del subterráneo.
     * @param velocidad     La velocidad del subterráneo.
     * @param terreno : terreno sobre el que se desplaza el transporte
     * @param distancia : distancia que va a recorrer
     * @param tiempo : cantidad de horas que se tomara 
     */
    public Suburbano(String destino, String paradero, int numeroID, String linea, int numDeLineas, int tiempoDeEspera, String tipoDeRuta, int pasajeros, int velocidad, String terreno, int distancia, int tiempo) {
        super(linea, numDeLineas, tiempoDeEspera, tipoDeRuta, pasajeros, velocidad, terreno, distancia, tiempo);
        this.destino = destino;
        this.paradero = paradero;
        this.numeroID = numeroID;
    }
    
    /**
     * Obtiene el destino del tren suburbano.
     *
     * @return El destino del tren suburbano.
     */
    public String destino() {
        return destino;
    }

    /**
     * Obtiene el paradero actual del tren suburbano.
     *
     * @return El paradero actual del tren suburbano.
     */
    public String paradero() {
        return paradero;
    }

    /**
     * Obtiene el número de identificación del tren suburbano.
     *
     * @return El número de identificación del tren suburbano.
     */
    public int numeroID() {
        return numeroID;
    }

    /**
     * Simula la llegada del tren suburbano a un paradero.
     */
    public void llegada() {
        System.out.println("El tren suburbano ha llegado al paradero: " + paradero);
    }

    /**
     * Simula un aviso de que el vagón del tren suburbano está lleno.
     */
    public void vagonLleno() {
        System.out.println("Aviso: El vagón del tren suburbano está lleno.");
    }

    /**
     * Simula un problema en las puertas del tren suburbano.
     */
    public void puertaproblema() {
        System.out.println("Aviso: Problema en las puertas del tren suburbano en el paradero: " + paradero);
    }

    /**
     * Obtiene el destino del tren suburbano.
     *
     * @return El destino del tren suburbano.
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Establece el destino del tren suburbano.
     *
     * @param destino El nuevo destino del tren suburbano.
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * Obtiene el paradero actual del tren suburbano.
     *
     * @return El paradero actual del tren suburbano.
     */
    public String getParadero() {
        return paradero;
    }

    /**
     * Establece el paradero actual del tren suburbano.
     *
     * @param paradero El nuevo paradero actual del tren suburbano.
     */
    public void setParadero(String paradero) {
        this.paradero = paradero;
    }

    /**
     * Obtiene el número de identificación del tren suburbano.
     *
     * @return El número de identificación del tren suburbano.
     */
    public int getNumeroID() {
        return numeroID;
    }

    /**
     * Establece el número de identificación del tren suburbano.
     *
     * @param numeroID El nuevo número de identificación del tren suburbano.
     */
    public void setNumeroID(int numeroID) {
        this.numeroID = numeroID;
    }

    @Override
    public String toString() {
        return "Suburbano{" + "destino=" + destino + ", paradero=" + paradero + ", numeroID=" + numeroID + super.toString()+'}';
    }
    
    
    
    
    
    
    
}
