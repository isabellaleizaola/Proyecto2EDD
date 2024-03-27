/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FunctionalitiesSoftware;

import Classes.Client;
import Classes.HashTable;
import Classes.Reservation;
import Classes.Record;
import Classes.Room;
import DataStructures.List;
import DataStructures.Node;
import DataStructures.Tree;

/**
 *
 * @author user
 */
public class Checkout {
    private HashTable huespedes;
    private Tree habitacion;
    private Tree reservacion;
    private Tree historial;
    
    /**
     * Crea una instancia de Checkout con los objetos HashTable de huéspedes, Tree de habitaciones, Tree de reservaciones y Tree de historial.
     *
     * @param huespedes    El objeto HashTable que contiene los datos de los huéspedes.
     * @param habitacion    El objeto Tree que contiene los datos de las habitaciones.
     * @param reservacion  El objeto Tree que contiene los datos de las reservaciones.
     * @param historial    El objeto Tree que contiene el historial de registros.
     */
    public Checkout(HashTable huespedes,Tree habitacion, Tree reservacion, Tree historial){
        this.huespedes = huespedes;
        this.habitacion = habitacion;
        this.reservacion = reservacion;
        this.historial = historial;
    }
    
    /**
     * Realiza el check-out de un cliente dado su número de cédula y una reserva.
     *
     * @param cedula      El número de cédula del cliente.
     * @param reservacion  El nodo que contiene la reserva del cliente.
     * @return Un mensaje de confirmación o error del check-out.
     */
    public String Checkoutci(int cedula, Node reservacion){
        //Buscas la reserva para obtener todos los datos del cliente
        Reservation aux = (Reservation) reservacion.getData();
        
            //Buscas al cliente en el hashtable de huespedes para obtener si habitacion
            Client cliente = this.huespedes.buscar(aux.getClientFirstName(), aux.getClientLastName());
            if(cliente != null){
                //Buscas la habitacion donde las tengas guardadas
              
               this.habitacion.searchRoomSetS(cliente.getRoomNumber(), true);
               
           
               
               //Marcas la habitacion como disponible
               
               Record nRecord = new Record(aux.getId(), aux.getClientFirstName(), aux.getClientLastName(), aux.getClientEmail(), aux.getClientGender(), aux.getDateOfArrival(), cliente.getRoomNumber());
               if (this.historial.searchRoom(cliente.getRoomNumber()) != null) {
                    Node node = this.historial.searchRoom(cliente.getRoomNumber());
                    List nuevaLista = (List) node.getData();
                    nuevaLista.AddRecordToList(nRecord);
                    node.setData(nuevaLista);
                } else {
                    this.historial.insertRecord(nRecord);
                }
               
           
                //Usando los datos de la reserva en el historial
                
               //Eliminas al cliente del HashTable de Huespedes
                this.huespedes.eliminar(cliente.getFirstName(), cliente.getLastName());
               //Eliminas la reservacion
                this.reservacion.deleteReservation(aux.getId());
            
               return "Nombre: "  + aux.getClientFirstName() + " "+ aux.getClientLastName() + "\n" + "Habitacion: " + cliente.getRoomNumber()+ "\n" +  "Entrada: " + aux.getDateOfArrival() + "Salida: "+ aux.getDateOfDeparture()+ "Email: " + aux.getClientEmail();
            }else{
                return "No se ha encontrado a la persona en la base de datos";
            }
        }
    }
    

