/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;



/**
 *
 * @author Mariana Eduardo Adolfo
 */
public class Aereo extends MediosDeTransportes{
    private int altitud;
    private String compañia,tipo;

    /**
     * constructor vacio
     */
    
    public Aereo() {
    }

    /**
     * Constrctor lleno 
     * @param altitud :Altarua a la que estara el tranporte aereo
     * @param compañia : compañia a la que pertenece el trasnporte aereo
     * @param tipo : Es un vuelo de tipo comercial, privad
     * @param terreno : terreno sobre el que se desplaza el transporte
     * @param distancia : distancia que va a recorrer
     * @param tiempo : cantidad de horas que se tomara
     */
    public Aereo(int altitud, String compañia, String tipo, String terreno, int distancia, int tiempo) {
        super(terreno, distancia, tiempo);
        this.altitud = altitud;
        this.compañia = compañia;
        this.tipo = tipo;
    }

    /**
     * Metodo get
     * @return la altitud del vuelo
     */
    public int getAltitud() {
        return altitud;
    }

    /**
     * Metodo get
     * @return la compañia del transporte aereo
     */
    public String getCompañia() {
        return compañia;
    }

    /**
     * Metodo get
     * @return si el vuelo es compercial o privado
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Metodo set
     * @param altitud : altitud del vuelo
     */
    public void setAltitud(int altitud) {
        this.altitud = altitud;
    }

    /**
     * Metodo set
     * @param compañia : compañia de la neve
     */
    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    /**
     * Metodo set
     * @param tipo : si es vuelo comercial o privado 
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    /**
     * metodo que hace despegar el transporte 
     */
    public void despegar(){
        System.out.println("El Transporte despego");
    }
    
    /**
     * metodo que avisa que ha estado muchas horas en el aire 
     */
    public void horasEnElAire(){
        System.out.println("Ha estado muchas horas en el aire ");
    }
    
    /**
     * metodo que alerta de turbulencia 
     */
    public void alertaDeTurbulencia(){
        System.out.println("Mantenga la calma, solo es turbulencia");
    }


    /**
     * metodo toString
     * @return 
     */
    @Override
    public String toString() {
        return "Aereo{" + "altitud=" + altitud + ", compañia=" + compañia + ", tipo=" + tipo + super.toString()+'}';
    }
    

    
    

    
    
    
    
}
