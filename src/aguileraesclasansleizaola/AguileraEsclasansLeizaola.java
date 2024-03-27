/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aguileraesclasansleizaola;

import Classes.HashTable;
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
    public static Tree reservationsTree = ConvertData.ConvertRegisters();
    public static Tree historyTree = ConvertData.convertHistory();
    public static HashTable hashTable = ConvertData.convertStatus();
    public static Tree roomsTree = ConvertData.ConvertRooms(hashTable);
    

    /**
     * Método principal para ejecutar el programa.
     *
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Menu menu = new Menu( reservationsTree,  roomsTree,  historyTree,  hashTable);
        menu.setVisible(true);

    }

}
