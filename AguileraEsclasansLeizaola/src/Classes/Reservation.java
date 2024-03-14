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
public class Reservation {
    //ci,primer_nombre,segundo_nombre,email,genero,tipo_hab,celular,llegada,salida
    //ci,primer_nombre,apellido,email,genero,llegada,num_hab
//    private Client client;
//    private String typeRoom;
//    private Date salida;
//    ci,primer_nombre,apellido,email,genero,llegada,num_hab
    
    
//    ci,primer_nombre,segundo_nombre,email,genero,tipo_hab,celular,llegada,salida
//13.502.927,Evered,Ralestone,eralestone0@ask.com,Male,doble,(648) 8757440,14/10/2023,20/10/2023
//13.369.274,Berna,Lawly,blawly1@privacy.gov.au,Female,doble,(984) 2395498,15/08/2023,24/08/2023
//17.614.312,Marti,Meconi,mmeconi2@mozilla.org,Female,suite,(581) 7713030,12/08/2023,22/08/2023
//18.383.175,Jennifer,Allworthy,jallworthy3@squidoo.com,Female,doble,(647) 9910223,02/10/2023,03/10/2023
//12.902.463,Kalli,Rickhuss,krickhuss4@nyu.edu,Female,doble,(161) 8724477,02/07/2023,03/07/2023
//14.597.844,Julianna,Gauld,jgauld5@dailymotion.com,Female,simple,(214) 5216557,05/07/2023,24/07/2023
//17.347.235,Debera,Cohen,dcohen6@scientificamerican.com,Female,triple,(277) 7802138,26/09/2023,01/10/20
    private int id;
    private String clientFirstName;
    private String clientLastName;
    private String clientEmail;
    private String clientGender;
    private String typeOfRoom;
    private String clientPhone;
    private String dateOfArrival;
    private String dateOfDeparture;

    public Reservation(int id, String clientFirstName, String clientLastName, String clientEmail, String clientGender, String typeOfRoom, String clientPhone, String dateOfArrival, String dateOfDeparture) {
        this.id = id;
        this.clientFirstName = clientFirstName;
        this.clientLastName = clientLastName;
        this.clientEmail = clientEmail;
        this.clientGender = clientGender;
        this.typeOfRoom = typeOfRoom;
        this.clientPhone = clientPhone;
        this.dateOfArrival = dateOfArrival;
        this.dateOfDeparture = dateOfDeparture;
    }

    public Reservation() {
    }


//    public void sout(){
//        String toString = "id: " + Integer.toString(getId())
//        + "Nombre: " + this.getClientFirstName())
//        + "Apellido: " + this.getClientLastName()
//        +  "Email: " + this.getClientEmail()
//        + "Genero: " + this;
//    }

    @Override
    public String toString() {
        return "Reservation{" + "id=" + id + ", clientFirstName=" + clientFirstName + ", clientLastName=" + clientLastName + ", clientEmail=" + clientEmail + ", clientGender=" + clientGender + ", typeOfRoom=" + typeOfRoom + ", clientPhone=" + clientPhone + ", dateOfArrival=" + dateOfArrival + ", dateOfDeparture=" + dateOfDeparture + '}';
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
     * @return the clientFirstName
     */
    public String getClientFirstName() {
        return clientFirstName;
    }

    /**
     * @param clientFirstName the clientFirstName to set
     */
    public void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    /**
     * @return the clientLastName
     */
    public String getClientLastName() {
        return clientLastName;
    }

    /**
     * @param clientLastName the clientLastName to set
     */
    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    /**
     * @return the clientEmail
     */
    public String getClientEmail() {
        return clientEmail;
    }

    /**
     * @param clientEmail the clientEmail to set
     */
    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    /**
     * @return the clientGender
     */
    public String getClientGender() {
        return clientGender;
    }

    /**
     * @param clientGender the clientGender to set
     */
    public void setClientGender(String clientGender) {
        this.clientGender = clientGender;
    }

    /**
     * @return the typeOfRoom
     */
    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    /**
     * @param typeOfRoom the typeOfRoom to set
     */
    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    /**
     * @return the clientPhone
     */
    public String getClientPhone() {
        return clientPhone;
    }

    /**
     * @param clientPhone the clientPhone to set
     */
    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    /**
     * @return the dateOfArrival
     */
    public String getDateOfArrival() {
        return dateOfArrival;
    }

    /**
     * @param dateOfArrival the dateOfArrival to set
     */
    public void setDateOfArrival(String dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    /**
     * @return the dateOfDeparture
     */
    public String getDateOfDeparture() {
        return dateOfDeparture;
    }

    /**
     * @param dateOfDeparture the dateOfDeparture to set
     */
    public void setDateOfDeparture(String dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }
    
   
    
}
