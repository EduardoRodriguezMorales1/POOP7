/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author Mariana Eduardo Adolfo
 */
public class Combi extends Supraterraneo{
    /** 
     * La cantidad de pasajeros en la combi. 
     */
    private int cantidad;

    /** 
     * El destino de la combi. 
     */
    private String destino;

    /** 
     * El nivel de tráfico en la ruta de la combi. 
     */
    private String trafico;

    /**
     * Constructor Vacio
     */
    public Combi() {
    }

    /**
     *  Constructor lleno
     * @param cantidad           La cantidad de pasajeros en la combi.
     * @param destino            El destino de la combi.
     * @param trafico            El nivel de tráfico en la ruta de la combi.
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
    public Combi(int cantidad, String destino, String trafico, String calle, int zona, String paradero, String tipoDeRuta, int pasajeros, int velocidad, String terreno, int distancia, int tiempo) {
        super(calle, zona, paradero, tipoDeRuta, pasajeros, velocidad, terreno, distancia, tiempo);
        this.cantidad = cantidad;
        this.destino = destino;
        this.trafico = trafico;
    }
    
    /**
     * Simula el recorrido de la combi.
     */
    public void recorrase() {
        System.out.println("La combi está recorriéndose.");
    }

    /**
     * Comprueba si hay lugares disponibles en la combi.
     */
    public void subaleHayLugares() {
        if (cantidad < 30) {
            System.out.println("Puedes subir, aún hay lugares disponibles en la combi.");
        } else {
            System.out.println("La combi está llena, espera la siguiente.");
        }
    }

    /**
     * Simula la acción de recoger pasajeros en la combi.
     */
    public void recogerPasaje() {
        System.out.println("La combi está recogiendo pasajeros.");
    }

    /**
     * Obtiene la cantidad de pasajeros en la combi.
     *
     * @return La cantidad de pasajeros en la combi.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad de pasajeros en la combi.
     *
     * @param cantidad La nueva cantidad de pasajeros en la combi.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el destino de la combi.
     *
     * @return El destino de la combi.
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Establece el destino de la combi.
     *
     * @param destino El nuevo destino de la combi.
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * Obtiene el nivel de tráfico en la ruta de la combi.
     *
     * @return El nivel de tráfico en la ruta de la combi.
     */
    public String getTrafico() {
        return trafico;
    }

    /**
     * Establece el nivel de tráfico en la ruta de la combi.
     *
     * @param trafico El nuevo nivel de tráfico en la ruta de la combi.
     */
    public void setTrafico(String trafico) {
        this.trafico = trafico;
    }

    /**
     * Metodo toString
     * @return 
     */
    @Override
    public String toString() {
        return "Combi{" + "cantidad=" + cantidad + ", destino=" + destino + ", trafico=" + trafico + super.toString()+'}';
    }
    
    
}
