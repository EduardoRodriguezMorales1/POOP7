/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;
import transportes.Acuaticos;
import transportes.Avion;
import transportes.Combi;
import transportes.Helicoptero;
import transportes.MediosDeTransportes;
import transportes.Metro;
import transportes.Subterraneo;
import transportes.Suburbano;
import transportes.Supraterraneo;
import transportes.Taxi;
import transportes.Terrestres;
import transportes.Trajinera;

/**
 *
 * @author Mariana Eduardo Adolfo 
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setNombre("Max");
        animal.setLugarOrigen("CDMX");
        animal.setColor("Cafe");
        
        System.out.println(animal.toString());
        AnimalAcuatico animalAcuatico = new AnimalAcuatico();
        animalAcuatico.setNombre("Leo");
        animalAcuatico.setLugarOrigen("Africa");
        animalAcuatico.setColor("Rojo");
        animalAcuatico.setNumeroAletas(4);
        
        System.out.println(animalAcuatico);
        
        Ballena ballena = new Ballena(30,2,"Wilson","Canada","Gris");
        System.out.println(ballena);
        MediosDeTransportes mdt = new MediosDeTransportes();
        
        mdt.setTerreno("Tierra");
        mdt.setDistancia(100);
        mdt.setTiempo(60);
        System.out.println(mdt.toString());
        
        MediosDeTransportes transporte = new MediosDeTransportes("Asfalto", 1000, 60);
        System.out.println(transporte.toString()); 
        
        Terrestres terreste = new Terrestres("Ruta 70", 25, 45, "Asfalto", 100, 60);
        terreste.abrirPuertas();
        terreste.cerrarPuertas();

        int costo = terreste.costo(10);
        System.out.println("El costo del transporte es de " + costo + " pesos.");
        
        
        Acuaticos acuaticos = new Acuaticos("Grande", "Grande", "Mar", "agua", 100, 12);
        acuaticos.noAventarse();
        acuaticos.protocoloPorMareos();
        System.out.println("El tamaño del medio de transporte acuático es " + acuaticos.getTamaño());
        System.out.println("El tipo del medio de transporte acuático es " + acuaticos.getTipo());
        System.out.println("El cuerpo de agua en el que se desplaza el medio de transporte acuático es " + acuaticos.getCuerpoDeAgua());
        
        Subterraneo subterraneo = new Subterraneo("Liena 12", 12, 5, "Indios Verdes", 107, 95, "Vias", 15, 20);
        System.out.println(subterraneo.toString());

        Supraterraneo supraterraneo = new Supraterraneo("Pri,avera", 3, "Ciudad univercitaria", "Ruta directa", 45, 65, "vias", 23, 15);
        System.out.println(supraterraneo.toString());
        
        Metro metro = new Metro("Universidad","Universidad-Indios verdes", 21, "Linea 3",21, 5, "Publica", 107, 25, "vias", 15, 3);
        System.out.println(metro.toString());
        
        Taxi taxi = new Taxi("Uber", "ABC-123", 12345, "Calle Universidad", 12, "Paradero la joya","Ruta privada",4,20,"Asfalto",19,20);
        System.out.println(taxi.toString());
        
        Combi combi = new Combi(13, "Destino ajusco", "mucho trafico", "Calle 12", 1, "Paradero 3", "ruta 3",15, 20, "Asfalto", 43, 13);
        System.out.println(combi.toString());


        Trajinera trajinera = new Trajinera("Juan", "Xochimilco", "Fiesta de juan", "Tamaño chico", "Privado", "Rio", "agua",30, 45);

        trajinera.pedirMariachi(2);
        trajinera.atraccion();
        trajinera.vuelta();

        System.out.println(trajinera);
        
        
        
        Avion avion = new Avion("Alemania","juan","Boing707",2500,"AereoMexico","comercial","Aire",10000,3);
        System.out.println(avion);
        
        Helicoptero helicoptero = new Helicoptero(1500,27,"Coyoacan-C.U",500,"volaris","Privado","Aire",10000,1);
        System.out.println(helicoptero);
    }
    
}
