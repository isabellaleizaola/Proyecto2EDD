/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FunctionalitiesSoftware;

import Classes.Client;
import Classes.HashTable;
import Classes.Reservation;
import DataStructures.Node;
import DataStructures.Tree;

/**
 *
 * @author user
 */
public class Checkin {
    private HashTable huespedes;
    private Tree habitacion;
    private Tree reservacion;
    
    /**
     * Crea una instancia de Checkin con los objetos HashTable de huéspedes, Tree de habitaciones y Tree de reservaciones.
     *
     * @param huespedes    El objeto HashTable que contiene los datos de los huéspedes.
     * @param habitacion    El objeto Tree que contiene los datos de las habitaciones.
     * @param reservacion  El objeto Tree que contiene los datos de las reservaciones.
     */
    public Checkin(HashTable huespedes,Tree habitacion, Tree reservacion){
        this.huespedes = huespedes;
        this.habitacion = habitacion;
        this.reservacion = reservacion;
    }
    
    /**
     * Realiza el check-in de un cliente dado su número de cédula y una reserva.
     *
     * @param cedula      El número de cédula del cliente.
     * @param reservation1  El nodo que contiene la reserva del cliente.
     * @return Un mensaje de confirmación o error del check-in.
     */
    public String ChekInCi(int cedula, Node reservation1){
        //Buscas la reservation1 que tenga esa cedula       
        Reservation aux = (Reservation) reservation1.getData();
        Client aux1 = this.huespedes.buscar(aux.getClientFirstName(), aux.getClientLastName());
        
            if(aux1 != null){
          
                return "El cliente ya se encuentra en la habitacion: " + aux1.getRoomNumber();
      
            }
            int room = this.habitacion.searchAvailableRoom(aux.getTypeOfRoom());
          
            //Deberia haber una funcion que busque una Habitacion del tipo que reservó el cilente y que esté vacía
//            recordsTree f = this.habitacion.SearchEmpty(found.get, habitacion.getRaiz());

            if(room != 0){
                //Guardas al cliente en el HashTable de huesdes, con el numero de la habitacion que conseguiste
                this.huespedes.insertar(room, aux.getClientFirstName(), aux.getClientLastName(), aux.getClientEmail(), aux.getClientGender(), aux.getClientPhone(), aux.getDateOfArrival());
                //Marcas la habitacion como visitada 
           
                
                return "Cliente: " + aux.getClientFirstName() + " " + aux.getClientLastName() + "\n" + "Habitacion "+ room;
               
            }else{
                
                return "La habitacion que se habia pedido sigue ocupada";
            }
       
    }
    
    
   
            
            
}
