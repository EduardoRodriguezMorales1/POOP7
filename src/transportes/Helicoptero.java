/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author Mariana Eduardo Adolfo
 */
public class Helicoptero extends Aereo{
    private int costo, duracion;
    private String recorrido;

    /**
     * constrcutor vacio
     */
    public Helicoptero() {
    }

    /**
     * 
     * @param costo : costo del recorrido 
     * @param duracion : Duracion del recorrido 
     * @param recorrido : de donde a donde va a partir el helicoptero 
     * @param altitud :Altarua a la que estara el tranporte aereo
     * @param compañia : compañia a la que pertenece el trasnporte aereo
     * @param tipo : Es un vuelo de tipo comercial, privad
     * @param terreno : terreno sobre el que se desplaza el transporte
     * @param distancia : distancia que va a recorrer
     * @param tiempo : cantidad de horas que se tomara
     */
    public Helicoptero(int costo, int duracion, String recorrido, int altitud, String compañia, String tipo, String terreno, int distancia, int tiempo) {
        super(altitud, compañia, tipo, terreno, distancia, tiempo);
        this.costo = costo;
        this.duracion = duracion;
        this.recorrido = recorrido;
    }

    /**
     * metodo get
     * @return el costo del recorrido 
     */
    public int getCosto() {
        return costo;
    }

    /**
     * metodo get
     * @return la duracion del recorrido 
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * metodo get
     * @return los luagres que visita
     */
    public String getRecorrido() {
        return recorrido;
    }

    /**
     * metodo Set
     * @param costo : costo del recorrido 
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }

    /**
     * metodo Set
     * @param duracion : dureacion del recorrido 
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * metodo Set
     * @param recorrido lugares por los que pasa  
     */
    public void setRecorrido(String recorrido) {
        this.recorrido = recorrido;
    }
    
    /**
     * metodo para avisar sobre una atraccion
     * @param atraccion : atraccion por la que pasa el helipcoptero 
     */
    public void visitaA(String atraccion){
        System.out.println("Pasaremos por: "+atraccion);
    }
    
    /**
     * metodo para observar el paisaje 
     */
    public void observar(){
        System.out.println("Contemple todo el paisaje");
    }
    
    /**
     * metodo para dar datos subre un lugar por el que pasa el recorrido 
     * @param lugar : lugar por el que pasa 
     */
    public void descripcion(String lugar){
        System.out.println(lugar+"  tiene muchas cosas buenas por ejemplo...");
    }

    /**
     * meteodo toString 
     * @return 
     */
    @Override
    public String toString() {
        return "Helicoptero{" + "costo=" + costo + ", duracion=" + duracion + ", recorrido=" + recorrido + super.toString()+'}';
    }
    
    
    
    
}
