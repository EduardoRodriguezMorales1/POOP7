/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author Mariana Eduardo Adolfo
 */
public class Metro extends Subterraneo{
    /** 
     * El nombre de la estación del metro. 
     */
    private String estacion;

    /** 
     * La dirección del metro. 
     */
    private String direccion;

    /** 
     * El número de estaciones en la ruta del metro.
     */
    private int numeroDeEstaciones;

    /**
     * Construtor vacio
     */
    public Metro() {
    }
    
    
    /**
     * 
     * @param estacion           El nombre de la estación del metro.
     * @param direccion          La dirección del metro.
     * @param numeroDeEstaciones El número de estaciones en la ruta del metro.
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
    public Metro(String estacion, String direccion, int numeroDeEstaciones, String linea, int numDeLineas, int tiempoDeEspera, String tipoDeRuta, int pasajeros, int velocidad, String terreno, int distancia, int tiempo) {    
        super(linea, numDeLineas, tiempoDeEspera, tipoDeRuta, pasajeros, velocidad, terreno, distancia, tiempo);
        this.estacion = estacion;
        this.direccion = direccion;
        this.numeroDeEstaciones = numeroDeEstaciones;
    }

    /**
     * Simula una alerta de retraso en el servicio del metro.
     */
    public void alertaDeRetraso() {
        System.out.println("Alerta: Retraso en el servicio del metro en la estación " + estacion);
    }

    /**
     * Simula una alerta de llegada del metro a una estación.
     */
    public void alertaDeLlegada() {
        System.out.println("Alerta: El metro ha llegado a la estación " + estacion);
    }

    /**
     * Simula una alerta de fallo en el servicio del metro.
     */
    public void alertaDeFallo() {
        System.out.println("Alerta: Fallo en el servicio del metro en la estación " + estacion);
    }

    /**
     * Obtiene el nombre de la estación del metro.
     *
     * @return El nombre de la estación.
     */
    public String getEstacion() {
        return estacion;
    }

    /**
     * Establece el nombre de la estación del metro.
     *
     * @param estacion El nuevo nombre de la estación.
     */
    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    /**
     * Obtiene la dirección del metro.
     *
     * @return La dirección del metro.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del metro.
     *
     * @param direccion La nueva dirección del metro.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el número de estaciones en la ruta del metro.
     *
     * @return El número de estaciones.
     */
    public int getNumeroDeEstaciones() {
        return numeroDeEstaciones;
    }

    /**
     * Establece el número de estaciones en la ruta del metro.
     *
     * @param numeroDeEstaciones El nuevo número de estaciones.
     */
    public void setNumeroDeEstaciones(int numeroDeEstaciones) {
        this.numeroDeEstaciones = numeroDeEstaciones;
    }

    @Override
    public String toString() {
        return "Metro{" + "estacion=" + estacion + ", direccion=" + direccion + ", numeroDeEstaciones=" + numeroDeEstaciones + super.toString()+'}';
    }
    
    
    
    
}
