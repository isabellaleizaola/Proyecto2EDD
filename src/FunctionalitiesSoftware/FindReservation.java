/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FunctionalitiesSoftware;

import DataStructures.Node;
import DataStructures.Tree;
import DatasetManagement.ConvertData;

/**
 *
 * @author Isabella
 */
public class FindReservation {
    
    
    // Este metodo retorna un nodo null si no existe una reservacion con esa cedula, por lo que hay que manejar eso con cuidado
    // cuando se lleve a la interfaz
    /**
     * Busca una reservación en un árbol de reservaciones dado un ID de cliente.
     *
     * @param id                El ID del cliente.
     * @param reservationsTree  El árbol de reservaciones en el que se realizará la búsqueda.
     * @return El nodo correspondiente a la reservación encontrada, o null si no se encuentra.
     */
    public Node getReservationByClientId(int id, Tree reservationsTree){
        
        return reservationsTree.searchReservation(id);
    
    }
    
}
