/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Isabella
 */
public class Room {
    //num_hab,tipo_hab,piso
    private int number;
    private String type;
    private int floor;
    private boolean status;

     /**
     * Crea una nueva instancia de una habitación en un hotel.
     *
     * @param number El número de la habitación.
     * @param type   El tipo de habitación.
     * @param floor  El piso en el que se encuentra la habitación.
     * @param status El estado de la habitación (ocupada o disponible).
     */
    public Room(int number, String type, int floor, boolean status) {
        this.status = status;
        this.number = number;
        this.type = type;
        this.floor = floor;
        this.status = status;
    }

    public Room() {
    }
    
    public boolean isStatus() {
        return status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the floor
     */
    public int getFloor() {
        return floor;
    }

    /**
     * @param floor the floor to set
     */
    public void setFloor(int floor) {
        this.floor = floor;
    }
    
    
}
