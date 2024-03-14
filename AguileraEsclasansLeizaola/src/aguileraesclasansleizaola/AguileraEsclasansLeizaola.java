/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aguileraesclasansleizaola;

import Classes.Reservation;
import DataStructures.Tree;
import DatasetManagement.ConvertData;
import DatasetManagement.Data;
import static DatasetManagement.Data.obtainData;

/**
 *
 * @author Isabella
 */
public class AguileraEsclasansLeizaola {
    //Cambio
    //prueba
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String[] info = Data.stringToArray("test\\Datasets\\Booking_hotel - reservas.csv");
        
        //for (int i = 0; i < info.length; i++){
            //System.out.println(info[i]);
        //}
//        Tree example = ConvertData.ConvertRegisters();
//        
//       System.out.println(example.getpRoot());
//        if (example.getpRoot() != null) {
//            System.out.println("bien");
//
//        }
//
//        example.printTree(example.getpRoot(), "", true);
//        
//System.out.println(Data.obtainData("test\\Datasets\\Booking_hotel - reservas.csv"));




    //Prueba d balancear
        Tree tree = new Tree();
        Reservation resevacion = new Reservation(1,"s","s","s","s","s","S","s","s");
        Reservation resevacion1 = new Reservation(2,"s","s","s","s","s","S","s","s");
        Reservation resevacion2 = new Reservation(3,"s","s","s","s","s","S","s","s");
        Reservation resevacion3 = new Reservation(4,"s","s","s","s","s","S","s","s");
        Reservation resevacion4 = new Reservation(8,"s","s","s","s","s","S","s","s");

        // Insert nodes into the tree
        tree.insertReservation(resevacion4);
        tree.insertReservation(resevacion1);
        tree.insertReservation(resevacion2);
        tree.insertReservation(resevacion3);
        tree.insertReservation(resevacion);

        // Balance the tree
     

        // Print the tree
        tree.printTree();

    }

}
