/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author Mariana Eduardo Adolfo
 */
public class Avion extends Aereo{
    private String destino,piloto,modelo;

    /**
     * contructor vacio 
     */
    public Avion() {
    }

    /**
     * Constructor lleno
     * @param destino : pais al que va el avion
     * @param piloto : nombre del piloto
     * @param modelo : modelo del avion 
     * @param altitud :Altarua a la que estara el tranporte aereo
     * @param compañia : compañia a la que pertenece el trasnporte aereo
     * @param tipo : Es un vuelo de tipo comercial, privad
     * @param terreno : terreno sobre el que se desplaza el transporte
     * @param distancia : distancia que va a recorrer
     * @param tiempo : cantidad de horas que se tomara 
     */
    public Avion(String destino, String piloto, String modelo, int altitud, String compañia, String tipo, String terreno, int distancia, int tiempo) {
        super(altitud, compañia, tipo, terreno, distancia, tiempo);
        this.destino = destino;
        this.piloto = piloto;
        this.modelo = modelo;
    }

    /**
     * metodo get
     * @return el pais al que va el avion 
     */
    public String getDestino() {
        return destino;
    }

    /**
     * metodo get
     * @return el onmbre del piloto 
     */
    public String getPiloto() {
        return piloto;
    }

    /**
     * metodo get
     * @return el modelo del avion 
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * metodo set
     * @param destino : pais al que va el avion 
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * metodo set
     * @param piloto : nombre del piloto
     */
    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    /**
     * metodo set
     * @param modelo : modelo del avion  
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    /**
     * Metodo para avisar cuantas horas se demoro el vuelo
     * @param horas : horas de retraso
     */
    public void demora(int horas){
        System.out.println("El vuelo se retraso: "+horas+"Horas");
    }
    
    /**
     * metdo que avisa que avisa sobre no olvidar el equipaje 
     */
    public void equipaje(){
        System.out.println("No olvide recoger su equipaje");
    }
    
    /**
     * metodo que aviza que el avion esta aterrizando 
     */
    public void aterrizaje(){
        System.out.println("El avion esta aterrizando");
    }

    /**
     * Metodo toString
     * @return 
     */
    @Override
    public String toString() {
        return "Avion{" + "destino=" + destino + ", piloto=" + piloto + ", modelo=" + modelo + super.toString()+ '}';
    }
    
    
    
    
}
