/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FunctionalitiesSoftware;

import DataStructures.List;
import DataStructures.Node;
import DataStructures.Tree;
import DatasetManagement.ConvertData;

/**
 *
 * @author Isabella
 */
public class RoomRecords {
    
    //private Tree recordsTree;
    
    
    //Este metodo retorna una lista de NodeForList que tienen como data un objeto del tipo Record.
    //Retorna una lista de registros de una habitacion buscada
    /**
     * Retorna una lista de registros de una habitación buscada.
     *
     * @param roomNumber    El número de habitación.
     * @param recordsTree   El árbol de registros en el que se realizará la búsqueda.
     * @return Una lista de nodos (NodeForList) con registros (Record) de la habitación buscada.
     */
    public List returnRecordsRoom(int roomNumber, Tree recordsTree){
       
        Node node = recordsTree.searchRoom(roomNumber);
        List recordsList = (List) node.getData();
        return recordsList;
    }
    
}
