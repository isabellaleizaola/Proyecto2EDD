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
import Interfaces.Menu;
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
//
//        System.out.println(tree.searchRoom(60).getId());
        Menu menu = new Menu();
        menu.setVisible(true);

    }

}
