/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**
 *
 * @author Isabella
 */
public class Client {
    //ci,primer_nombre,apellido,email,genero,llegada,num_hab
    
    //num_hab,primer_nombre,apellido,email,genero,celular,llegada
//157,Chrissy,Abbis,cabbis4c@home.pl,Male,(900) 3961419,01/07/2023
//123,Meade,Abramchik,mabramchik3e@opensource.org,Female,(398) 6399581,07/07/2023
    
    private int roomNumber;
    private String firstName;
    private String LastName;
    private String email;
    private String gender;
    private String phoneNumber;
    private String arrivalDate; 

    public Client(int roomNumber, String firstName, String LastName, String email, String gender, String phoneNumber, String arrival) {
        this.roomNumber = roomNumber;
        this.firstName = firstName;
        this.LastName = LastName;
        this.email = email;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.arrivalDate = arrival;
    }
    

    

    public Client() {
    }

//    /**
//     * @return the id
//     */
//    public int getId() {
//        return id;
//    }
//
//    /**
//     * @param id the id to set
//     */
//    public void setId(int id) {
//        this.id = id;
//    }

    
    
    
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the arrival
     */
 

    /**
     * @return the roomNumber
     */
    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * @param roomNumber the roomNumber to set
     */
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * @return the arrivalDate
     */
    public String getArrivalDate() {
        return arrivalDate;
    }

    /**
     * @param arrivalDate the arrivalDate to set
     */
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
}
