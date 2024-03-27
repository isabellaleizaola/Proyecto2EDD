/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

import Classes.Client;
import Classes.Reservation;
import Classes.Room;


/**
 *
 * @author Isabella
 */
public class Node {
    private Object data;
    private int id;
    private int height;
    private Node leftSon;

    private Node rightSon;

    
    /**
     * Crea una nueva instancia de un nodo con datos y nodos hijos especificados.
     *
     * @param data     Los datos almacenados en el nodo.
     * @param leftSon  El nodo hijo izquierdo.
     * @param rightSon El nodo hijo derecho.
     */
    public Node(Object data, Node leftSon, Node rigthSon) {
        this.data = data;
        this.leftSon = leftSon;
        this.rightSon = rigthSon;
    }

    /**
     * Crea una nueva instancia de un nodo con una lista de datos y un ID especificados.
     *
     * @param data La lista de datos almacenados en el nodo.
     * @param id   El ID del nodo.
     */
    public Node(List data, int id) {
        this.data = data;

        this.id = id;

        this.height = 1;

        this.leftSon = null;
        this.rightSon =  null;
    }
    

    /**
     * Crea una nueva instancia de un nodo vacío.
     */
    public Node() {
    }

    
    /**
     * Crea una nueva instancia de un nodo con un registro especificado.
     *
     * @param record El registro almacenado en el nodo.
     */
    public Node (Record record){
        this.data =  record;
    }

    
    /**
     * Crea una nueva instancia de un nodo con una reserva y un ID especificados.
     *
     * @param newReservation La reserva almacenada en el nodo.
     * @param id             El ID del nodo.
     */
    public Node(Reservation newReservation, int id){
        this.data = newReservation;
        this.id = id;
        this.rightSon = null;
        this.leftSon = null;
    }
    
    /**
     * Crea una nueva instancia de un nodo con una habitación y un ID especificados.
     *
     * @param newRoom La habitación almacenada en el nodo.
     * @param id      El ID del nodo.
     */
     public Node(Room newRoom, int id){
        this.data = newRoom;
        this.id = id;
        this.rightSon = null;
        this.leftSon = null;
    }
    
    /**
     * Crea una nueva instancia de un nodo con un cliente y un ID especificados.
     *
     * @param nClient El cliente almacenado en el nodo.
     * @param id      El ID del nodo.
     */
    public Node(Client nClient, int id){
        this.data = nClient;
        this.id = id;
        this.rightSon = null;
        this.leftSon = null;
    }
    


    
    
    
    
    
    /**
     * @return the data
     */
    public Object getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * @return the leftSon
     */
    public Node getLeftSon() {
        return leftSon;
    }

    /**
     * @param leftSon the leftSon to set
     */
    public void setLeftSon(Node leftSon) {
        this.leftSon = leftSon;
    }

    /**
     * @return the rightSon
     */
    public Node getRightSon() {
        return rightSon;
    }

    /**
     * @param rightSon the rightSon to set
     */
    public void setRightSon(Node rightSon) {
        this.rightSon = rightSon;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }
    
    
    
    
    

}
