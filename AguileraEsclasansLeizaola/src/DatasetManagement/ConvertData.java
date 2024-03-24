/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatasetManagement;

import Classes.Client;
import Classes.HashTable;
import Classes.Reservation;
import DataStructures.Node;
import DataStructures.Tree;
import static DatasetManagement.Data.obtainData;
import static DatasetManagement.Data.stringToArray;
import Classes.Record;
import DataStructures.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Isabella
 */
public class ConvertData {

    public static Tree ConvertRegisters() {
        String[] info = stringToArray("test\\Datasets\\Booking_hotel - reservas.csv");

        Tree reservationsTree = new Tree();

        for (int i = 1; i < info.length; i++) {
            String[] person = info[i].split(",");

            int id = Integer.valueOf(person[0].replace(".", "").trim());

            String firstName = person[1].trim();

            String lastName = person[2].trim();
            String email = person[3].trim();
            String gender = person[4].trim();
            String typeOfRoom = person[5].trim();
            String phone = person[6].trim();
            String arrivalDate = person[7].trim();
            String departureDate = person[8].trim();

            Reservation reservationInfo = new Reservation(id, firstName, lastName, email, gender, typeOfRoom, phone, arrivalDate, departureDate);

            if (reservationsTree.getpRoot() == null) {
                Node root = new Node(reservationInfo, reservationInfo.getId());
                reservationsTree.setpRoot(root);
            } else {
                reservationsTree.insertReservation(reservationInfo);
            }

        }
        return reservationsTree;
    }

    public static Tree convertHistory() {

        String[] data = Data.stringToArray("test\\Datasets\\Booking_hotel - Histórico.csv");


        Tree recordsTree = new Tree();

        for (int i = 1; i < data.length; i++) {
            String[] record = data[i].split(",");
            int idClient = Integer.valueOf(record[0].replace(".", "").trim());

            String firstName = record[1].trim();

            String lastName = record[2].trim();
            String email = record[3].trim();
            String gender = record[4].trim();
            String arrivalDate = record[5].trim();
            int roomNumber = Integer.valueOf(record[6].trim());

            Record newRecord = new Record(idClient, firstName, lastName, email, gender, arrivalDate, roomNumber);

            if (recordsTree.getpRoot() == null) {

            }

            if (recordsTree.searchRoom(roomNumber) != null) {
                Node node = recordsTree.searchRoom(roomNumber);
                List nuevaLista = (List) node.getData();
                nuevaLista.AddRecordToList(newRecord);
                node.setData(nuevaLista);
            } else {
                recordsTree.insertRecord(newRecord);
            }

        }

        return recordsTree;
    }

    public static HashTable convertStatus() {

//        String[] data = Data.stringToArray("test\\Datasets\\Booking_hotel - estado.csv");
////        for (int i = 0; i< data.length; i++){
////            System.out.println(data[i]);  
////        }
//
//        //Adriana esto hay que cambiarlo, solo lo puse porque sino, no corre el codigo
//        //Lo que necesito que coloques es la tabla hash que vas a crear
//        HashTable ht = new HashTable(2);
//
////num_hab,primer_nombre,apellido,email,genero,celular,llegada
////157,Chrissy,Abbis,cabbis4c@home.pl,Male,(900) 3961419,01/07/2023
////123,Meade,Abramchik,mabramchik3e@opensource.org,Female,(398) 6399581,07/07/2023
//        for (int i = 1; i < data.length; i++) {
//            String[] record = data[i].split(",");
//            int roomNumber = Integer.valueOf(record[0].replace(".", "").trim());
//
//            String firstName = record[1].trim();
//
//            String lastName = record[2].trim();
//            String email = record[3].trim();
//            String gender = record[4].trim();
//            String celular = record[5].trim();
//            String arrivalDate = record[6].trim();
//
//            Client newClient = new Client(roomNumber, firstName, lastName, email, gender, celular, arrivalDate);
//
//            //Adriana aqui tienes que agregar una linea de codigo donde se agregue newClient a la hash table
//        }
//        return ht;

        HashTable tablaHash = new HashTable(100); // Crear una HashTable con un tamaño adecuado

        String csvFile = "test\\Datasets\\Booking_hotel - estado.csv"; // Ruta del archivo CSV
        String line;
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Leer el archivo línea por línea
            int con = 0;
            while ((line = br.readLine()) != null) {
                if (con == 0) {
                    con++;
                } else {
                    // Separar los campos de cada línea por la coma
                    String[] datos = line.split(csvSplitBy);

                    int id = con - 1;
                    String firstName = datos[1];
                    String lastName = datos[2];
                    String email = datos[3];
                    String gender = datos[4];
                    String phoneNumber = datos[5];
                    String arrival = datos[6];
                    int room;
                    if (datos[0] == "") {
                        room = 0;
                    } else {
                        room = Integer.parseInt(datos[0]);
                    }

                    // Insertar los datos en la HashTable
                    tablaHash.insertar(id, firstName, lastName, email, gender, phoneNumber, arrival, room);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tablaHash;
    }

}
