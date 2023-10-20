/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author Mariana Eduardo Adolfo
 */
public class MediosDeTransportes extends Object{
    
    /**
     * terreno: terreno sobre el que se desplaza el transporte
     * distancia: distancia que va a recorrer
     * tiempo: cantidad de horas que se tomara 
     */
    private String terreno;
    private int distancia,tiempo;

    /**
     * Constructor vacio
     */
    public MediosDeTransportes() {
    }

    /**
     * Constructor lleno
     * @param terreno terreno sobre el que se desplaza el transporte
     * @param distancia distancia que va a recorrer
     * @param tiempo cantidad de horas que se tomara
     */
    public MediosDeTransportes(String terreno, int distancia, int tiempo) {
        this.terreno = terreno;
        this.distancia = distancia;
        this.tiempo = tiempo;
    }

    /**
     * metodo get
     * @return el terreno
     */
    public String getTerreno() {
        return terreno;
    }

    /**
     * metodo get
     * @return la distancia a recorrer
     */
    public int getDistancia() {
        return distancia;
    }

    /**
     * metodo get 
     * @return el tiempo transcurrido
     */
    public int getTiempo() {
        return tiempo;
    }

    /**
     * metodo set
     * @param terreno : terreno sobre el cual se desplazara el transporte
     */
    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    /**
     * metodo set
     * @param distancia :distancia a recorrer 
     */
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    /**
     * metodo set
     * @param tiempo : tiempo que se tomora en finalizar el recorrido 
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    /**
     * metodo para avanzar 
     */
    public void avanzar(){
        System.out.println("Avanza");
    }
    
    /**
     * metodo para frenar 
     */
    public void frenar(){
        System.out.println("Frena");
    }
    
    /**
     * metodo para hacer parada 
     */
    public void parada(){
        System.out.println("Hace parada");
    }

    /**
     * metodo toString 
     * @return 
     */
    @Override
    public String toString() {
        return "MediosDeTransportes{" + "terreno=" + terreno + ", distancia=" + distancia + ", tiempo=" + tiempo + '}';
    }
    
    
}
