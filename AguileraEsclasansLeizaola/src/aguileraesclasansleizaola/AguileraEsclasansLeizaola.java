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
        Reservation resevacion = new Reservation(4,"s","s","s","s","s","S","s","s");
        Reservation resevacion1 = new Reservation(2,"s","s","s","s","s","S","s","s");
        Reservation resevacion2 = new Reservation(3,"s","s","s","s","s","S","s","s");
        Reservation resevacion3 = new Reservation(5,"s","s","s","s","s","S","s","s");
        Reservation resevacion4 = new Reservation(6,"s","s","s","s","s","S","s","s");
        Reservation resevacion5 = new Reservation(7,"s","s","s","s","s","S","s","s");
        Reservation resevacion6 = new Reservation(1,"s","s","s","s","s","S","s","s");
        Reservation resevacion7 = new Reservation(85,"s","s","s","s","s","S","s","s");
        Reservation resevacion8 = new Reservation(90,"s","s","s","s","s","S","s","s");
        Reservation resevacion9 = new Reservation(13,"s","s","s","s","s","S","s","s");
        

        tree.insertReservation(resevacion);
        tree.insertReservation(resevacion1);
        tree.insertReservation(resevacion2);
        tree.insertReservation(resevacion6);
        tree.insertReservation(resevacion3);
        tree.insertReservation(resevacion5);
        tree.insertReservation(resevacion7);
        tree.insertReservation(resevacion8);
       
      
      
        
        
        tree.printInorder();
        System.out.println("");
        tree.printPostorder();
        System.out.println("");
        tree.printPreorder();

    
        System.out.println("");
        tree.printTree();
        
        
        tree.printTree();
        
   

    }

}
