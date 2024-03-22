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
public class Checkin {
    private HashTable huespedes;
    private Tree habitacion;
    private Tree reservacion;
    
    public Checkin(HashTable huespedes,Tree habitacion, Tree reservacion){
        this.huespedes = huespedes;
        this.habitacion = habitacion;
        this.reservacion = reservacion;
    }
    
    
//    public void checkin(int id){
//        Reservation reserva = reservacion.buscar(id);
//        if(reserva != null){
//            Room hab = habitacion.buscarVacia(reserva.getTypeOfRoom());
//            huespedes.insertar(reserva.getId(), reserva.getClientFirstName(), reserva.getClientLastName(),reserva.getClientEmail(),reserva.getClientGender(),reserva.getClientPhone(),reserva.getDateOfArrival(),hab.getNumber());
//        }
//        
//    }
    public void ChekInCi(int cedula){
        //Buscas la reserva que tenga esa cedula
        Node reserva = this.reservacion.searchReservation(cedula);
        
        if(reserva != null){
            //Deberia haber una funcion que busque una Habitacion del tipo que reservó el cilente y que esté vacía
//            recordsTree f = this.habitacion.SearchEmpty(found.get, habitacion.getRaiz());
        Node habitacion = null;
            if(habitacion != null){
                //Guardas al cliente en el HashTable de huesdes, con el numero de la habitacion que conseguiste
                this.huespedes.Insert(reserva.getData(),reserva.getLastname(), habitacion.getH());
                //Marcas la habitacion como visitada 
                habitacion.ocupada = true;
                System.out.println("Cliente: " + reserva.getFirstname() + " " + reserva.getLastname() + "\n" + "Habitacion "+ reserva.getHabitacion());
                System.out.println("Se ha realizado los cambios perfectamente");
            }else{
                System.out.println("popopopopopop");
                System.out.println("La habitacion que se habia pedido sigue ocupada");
            }
        }else{
            System.out.println("Por la cedula ingresada " + cedula + " no se encontro reservaciones");
        }
    }
}
