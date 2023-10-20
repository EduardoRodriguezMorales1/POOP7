/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author Mariana Eduardo Adolfo
 */
public class Subterraneo extends Terrestres{
    /**
     * La línea del subterráneo.
     */
    private String linea;

    /**
     * El número de líneas del subterráneo.
     */
    private int numDeLineas;

    /**
     * El tiempo de espera del subterráneo.
     */
    private int tiempoDeEspera;

    /**
     * Crea un nuevo objeto de la clase Subterraneo con los valores predeterminados.
     */
    public Subterraneo() {
    }

    /**
     *Crea un nuevo objeto de la clase Subterraneo con los parámetros especificados.
     *
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
    public Subterraneo(String linea, int numDeLineas, int tiempoDeEspera, String tipoDeRuta, int pasajeros, int velocidad, String terreno, int distancia, int tiempo) {
        super(tipoDeRuta, pasajeros, velocidad, terreno, distancia, tiempo);
        this.linea = linea;
        this.numDeLineas = numDeLineas;
        this.tiempoDeEspera = tiempoDeEspera;
    }
    
    /**
     * Devuelve la línea del subterráneo.
     *
     * @return La línea del subterráneo.
     */
    public String getLinea() {
        return linea;
    }

    /**
     * Establece la línea del subterráneo.
     *
     * @param linea La nueva línea del subterráneo.
     */
    public void setLinea(String linea) {
        this.linea = linea;
    }

    /**
     * Devuelve el número de líneas del subterráneo.
     *
     * @return El número de líneas del subterráneo.
     */
    public int getNumDeLineas() {
        return numDeLineas;
    }

    /**
     * Establece el número de líneas del subterráneo.
     *
     * @param numDeLineas El nuevo número de líneas del subterráneo.
     */
    public void setNumDeLineas(int numDeLineas) {
        this.numDeLineas = numDeLineas;
    }

    /**
     * Devuelve el tiempo de espera del subterráneo.
     *
     * @return El tiempo de espera del subterráneo.
     */
    public int getTiempoDeEspera() {
        return tiempoDeEspera;
    }

    /**
     * Establece el tiempo de espera del subterráneo.
     *
     * @param tiempoDeEspera El nuevo tiempo de espera del subterráneo.
     */
    public void setTiempoDeEspera(int tiempoDeEspera) {
        this.tiempoDeEspera = tiempoDeEspera;
    }

    /**
     * Simula la salida de un pasajero del vagón.
     */
    public void salirDelVagon() {
        System.out.println("Un pasajero sale del vagón.");
    }

    /**
     * Simula la entrada de un pasajero al vagón.
     */
    public void entrarAlVagon() {
        System.out.println("Un pasajero entra al vagón.");
    }

    /**
     * Anuncia la próxima parada del subterráneo.
     */
    public void anunciarParada() {
        System.out.println("La próxima parada es: " + linea);
    }

    @Override
    public String toString() {
        return "Subterraneo{" + "linea=" + linea + ", numDeLineas=" + numDeLineas + ", tiempoDeEspera=" + tiempoDeEspera + super.toString()+'}';
    }
    
}
