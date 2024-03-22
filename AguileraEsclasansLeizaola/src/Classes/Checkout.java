/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

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
    
    public Checkout(HashTable huespedes,Tree habitacion, Tree reservacion){
        this.huespedes = huespedes;
        this.habitacion = habitacion;
        this.reservacion = reservacion;
    }
    public void Checkoutci(int cedula){
        //Buscas la reserva para obtener todos los datos del cliente
        Node reservacion = this.reservacion.Search(cedula, reservacion.root);
        if(reservacion != null){
            //Buscas al cliente en el hashtable de huespedes para obtener si habitacion
            Client cliente = this.huespedes.Search(reservacion.getFirstname(), reservacion.getLastname());
            if(cliente != null){
                //Buscas la habitacion donde las tengas guardadas
               ArbolHabitacion habitacion = this.habitacion.SearchRoom(cedula, habitacion.getRaiz());
               //Marcas la habitacion como disponible
               habitacion.setS(false);
               //Usando los datos de la reserva en el historial
               habitacion.Insert(reservacion.getFirstname(), reservacion.getLastname(), reservacion.getEmail(), reservacion.getGender(), reservacion.getIn(), reservacion.getOut());
                System.out.println("Nombre: "  + reservacion.getFirstname() + " "+ reservacion.getLastname() + "\n" + "Habitacion: " + reservacion.getHabitacion() + "\n" +  "Entrada: " + reservacion.getIn() + "Salida: "+ reservacion.getOut()+ "Email: " + reservacion.getEmail());
               //Eliminas al cliente del HashTable de Huespedes
                this.huespedes.Delete(cliente.getFirstname(), cliente.getLastname(), cliente.getRoom());
               //Eliminas la reservacion
                this.reservaciones.delete(cedula);
               System.out.println("Se confirmo su salida del hotel que tenga un lindo dia");
            }else{
                System.out.println("No se ha encontrado a la persona en la base de datos");
            }
        }else{
            System.out.println("El cliente no se encontro en los huespedes actuales");
        }
    }
    
}
