/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author eduar
 */
public class Animal extends Object {
    /**
     * nombre: el nombre del animal, lugarOrigen: lugar de origen del animal, color: color del animal
     */
    private String nombre, lugarOrigen, color;
    /**
     * Constructor vacio
     */
    public Animal() {
    }
    /**
     * 
     * @param nombre : nombre del animal
     * @param lugarOrigen : lugar de origen del animal
     * @param color : color del animal
     */
    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }
    /**
     * 
     * @return el nombre del animal
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * metdo set
     * @param nombre : nombre del animal
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * metdo get
     * @return : lugarOrigen : el lugar de origen del animal
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }
    /**
     * metdo set
     * @param lugarOrigen : el lugar del origen del animal
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }
    /**
     * metdo get
     * @return color : Color del animal
     */
    public String getColor() {
        return color;
    }
    /**
     * metdo set
     * @param color : color del animal
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * metodos hacer sonidos
     * @param sonido : sonido del animal
     */
    public void hacerSonido(String sonido){
        System.out.println("Sonido: " + sonido);
    }
    /**
     * metodo comer
     */
    public void comer(){
        System.out.println("Estoy comiendo...");
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }
    
    
}
