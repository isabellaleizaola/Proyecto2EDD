/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aguileraesclasansleizaola;

import Classes.HashTable;
import Classes.Reservation;
import DataStructures.Node;
import DataStructures.Tree;
import DatasetManagement.ConvertData;
import DatasetManagement.Data;
import static DatasetManagement.Data.obtainData;
import FunctionalitiesSoftware.FindReservation;
import FunctionalitiesSoftware.RoomRecords;
import java.util.Date;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;



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
//        Tree recordsTree = ConvertData.convertHistory();
        //recordsTree.printTreeRec();
        
//        
//        RoomRecords newRR = new RoomRecords();
//        newRR.returnRecordsRoom(120).printList();
        
//        Tree reservationsTree = ConvertData.ConvertRegisters();
//        reservationsTree.printTree();






    HashTable tablaHash = ConvertData.convertStatus();
        
        FindReservation fr = new FindReservation();
        Node nodeWithReservation = fr.getReservationByClientId(1);
        if(nodeWithReservation != null){
            
        System.out.println(nodeWithReservation.getData().toString());
        } else{
            System.out.println(tablaHash.imprimir("Milt","Brent"));
        }
        

        Tree example = ConvertData.ConvertRegisters();
        
//       System.out.println(example.getpRoot().getData().toString());
//       
//        if (example.getpRoot() != null) {
//            System.out.println("bien");
//
//        }

   //     example.printTree(example.getpRoot(), "", true);
//        


//    //Prueba d balancear
//        Tree tree = new Tree();
//        Reservation resevacion = new Reservation(15,"s","s","s","s","s","S","s","s");
//        Reservation resevacion1 = new Reservation(15,"s","s","s","s","s","S","s","s");
//        Reservation resevacion2 = new Reservation(20,"s","s","s","s","s","S","s","s");
//        Reservation resevacion3 = new Reservation(10,"s","s","s","s","s","S","s","s");
//        Reservation resevacion4 = new Reservation(60,"s","s","s","s","s","S","s","s");
//        Reservation resevacion5 = new Reservation(50,"s","s","s","s","s","S","s","s");
//        Reservation resevacion6 = new Reservation(45,"s","s","s","s","s","S","s","s");
//        Reservation resevacion7 = new Reservation(30,"s","s","s","s","s","S","s","s");
//        Reservation resevacion8 = new Reservation(25,"s","s","s","s","s","S","s","s");
//        Reservation resevacion9 = new Reservation(35,"s","s","s","s","s","S","s","s");
//        Reservation resevacion10 = new Reservation(40,"s","s","s","s","s","S","s","s");
//
//        tree.insertReservation(resevacion);
//        tree.insertReservation(resevacion1);
//        tree.insertReservation(resevacion2);
//        tree.insertReservation(resevacion6);
//        tree.insertReservation(resevacion3);
//        tree.insertReservation(resevacion5);
//        tree.insertReservation(resevacion7);
//        tree.insertReservation(resevacion9);
//        tree.insertReservation(resevacion4);
//        tree.insertReservation(resevacion10);
//        tree.insertReservation(resevacion8);
//       
//      
//      
//        
//        
//        tree.printInorder();
//        System.out.println("");
//        tree.printPostorder();
//        System.out.println("");
//        tree.printPreorder();
//
//    
//        System.out.println("");
//        tree.printTree();
//        
//        
//        tree.printTree();
        

   
//        System.out.println(tree.searchRoom(60).getId());

        

    }
    
    


}

    