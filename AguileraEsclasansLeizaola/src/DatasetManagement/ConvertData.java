/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatasetManagement;

import Classes.Reservation;
import DataStructures.Node;
import DataStructures.Tree;
import static DatasetManagement.Data.obtainData;
import static DatasetManagement.Data.stringToArray;

/**
 *
 * @author Isabella
 */
public class ConvertData {

    public static Tree ConvertRegisters() {
        String[] info = stringToArray("test\\Datasets\\Booking_hotel - reservas.csv");
//        for (int i = 0; i<info.length; i ++){
//            System.out.println(info[i]);
//        }
        Tree reservationsTree = new Tree();

//ci,primer_nombre,segundo_nombre,email,genero,tipo_hab,celular,llegada,salida
//13.502.927,Evered,Ralestone,eralestone0@ask.com,Male,doble,(648) 8757440,14/10/2023,20/10/2023
//13.369.274,Berna,Lawly,blawly1@privacy.gov.au,Female,doble,(984) 2395498,15/08/2023,24/08/2023
//17.614.312,Marti,Meconi,mmeconi2@mozilla.org,Female,suite,(581) 7713030,12/08/2023,22/08/2023
//18.383.175,Jennifer,Allworthy,jallworthy3@squidoo.com,Female,doble,(647) 9910223,02/10/2023,03/10/2023
//12.902.463,Kalli,Rickhuss,krickhuss4@nyu.edu,Female,doble,(161) 8724477,02/07/2023,03/07/2023
//14.597.844,Julianna,Gauld,jgauld5@dailymotion.com,Female,simple,(214) 5216557,05/07/2023,24/07/2023
//17.347.235,Debera,Cohen,dcohen6@scientificamerican.com,Female,triple,(277) 7802138,26/09/2023,01/10/20um_hab
//
        for (int i = 1; i < info.length; i++) {
            String[] person = info[i].split(",");
            person.toString();
            int id = Integer.valueOf(person[0].replace(".", "").trim());
            String firstName = person[1].trim();
            System.out.println(firstName);
            String lastName = person[2].trim();
            String email = person[3].trim();
            String gender = person[4].trim();
            String typeOfRoom = person[5].trim();
            String phone = person[6].trim();
            String arrivalDate = person[7].trim();
            String departureDate = person[8].trim();

            Reservation reservationInfo = new Reservation(id, firstName, lastName, email, gender, typeOfRoom, phone, arrivalDate, departureDate);
        
            System.out.println("hasta aqui estamos bien");
            
            reservationInfo.toString();
//            if (reservationsTree.getpRoot() == null) {
//                Node root = new Node(reservationInfo, reservationInfo.getId());
//                reservationsTree.setpRoot(root);
//            } else {
                reservationsTree.insertReservation(reservationsTree.getpRoot(), reservationInfo);
//            }
        }
        return reservationsTree;
    }
}
