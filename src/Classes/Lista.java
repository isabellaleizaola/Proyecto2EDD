/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**
 *
 * @author user
 * 
 * Clase que representa una lista de clientes.
 *
 */
public class Lista {
    Client primero;
    int tamaño;
    
    /**
     * Crea una nueva instancia de la lista de clientes.
     * La lista se inicializa sin ningún cliente.
     */
    public Lista(){
        primero= null;
        tamaño = 0;
    }

//    public void insertar(int id, String firstName, String LastName, String email, String gender, String phoneNumber, String arrival, int room){
//        Client client = new Client (room, firstName, LastName, email, gender, phoneNumber, arrival);

    /**
    * Inserta un nuevo cliente al principio de la lista.
    *
    * @param roomNumber  El número de habitación del cliente.
    * @param firstName   El nombre del cliente.
    * @param lastName    El apellido del cliente.
    * @param email       El correo electrónico del cliente.
    * @param gender      El género del cliente.
    * @param phoneNumber El número de teléfono del cliente.
    * @param arrival     La fecha de llegada del cliente.
    */
    public void insertar(int roomNumber, String firstName, String LastName, String email, String gender, String phoneNumber, String arrival){
        Client client = new Client (roomNumber, firstName, LastName, email, gender, phoneNumber, arrival);
        
        client.setSiguiente(this.primero);
        primero = client;
        tamaño ++;
    }
    
    /**
    * Elimina un cliente de la lista según los nombres (firstName y LastName) especificados.
    *
    * @param firstName El nombre del cliente a eliminar.
    * @param lastName  El apellido del cliente a eliminar.
    */
    public void eliminar(String firstName, String LastName){
        Client aux = this.primero;
        if(aux.getFirstName().equals(firstName) && aux.getLastName().equals(LastName)){
            this.primero = this.primero.getSiguiente();
        }
        while(aux.getSiguiente() !=null && !aux.getSiguiente().getFirstName().equals(firstName) && !aux.getSiguiente().getLastName().equals(LastName)){
            aux = aux.getSiguiente();
        }
        if(aux.getSiguiente() !=null){
        aux.setSiguiente(aux.getSiguiente().getSiguiente());
    }
        tamaño --;
    }
    
    /**
    * Busca un cliente en la lista según los nombres (firstName y LastName) especificados.
    *
    * @param firstName El nombre del cliente a buscar.
    * @param lastName  El apellido del cliente a buscar.
    * @return El cliente encontrado o null si no se encuentra.
    */
    public Client buscar(String firstName, String LastName){
        Client aux = this.primero;
        while (aux !=null && !aux.getFirstName().equals(firstName) && !aux.getLastName().equals(LastName)){
            aux =aux.getSiguiente();
        }
        return aux;
    }
    
    /**
    * Busca un cliente en la lista según el número de habitación especificado.
    *
    * @param roomNumber El número de habitación del cliente a buscar.
    * @return El cliente encontrado o null si no se encuentra.
    */
    public Client buscarRoom(int roomNumber) {
        
        Client aux = this.primero;
        while (aux != null ) {
            if(aux.getRoomNumber() == roomNumber){
                return aux;
            }
            aux = aux.getSiguiente();
        }
        
        return null; // Si no se encuentra el cliente con el número de habitación dado
    }
    
    /**
    * Imprime por consola la información de todos los clientes en la lista.
    * La información incluye el nombre, apellido y número de habitación de cada cliente.
    */
    public void imprimir(){
        Client aux = this.primero;
        while(aux !=null){
            System.out.println(aux.getFirstName()+ aux.getLastName()+ " "+aux.getRoomNumber());
            aux = aux.getSiguiente();
        }
    }
    
   
}
