/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FunctionalitiesSoftware;

import Classes.HashTable;
import Classes.Client;
import Classes.HashTable;
import DatasetManagement.ConvertData;

/**
 *
 * @author Isabella
 */
public class FindCustomer {
    
    /**
     * Realiza una búsqueda de un cliente en la tabla hash (HashTable) dado su nombre y apellido.
     *
     * @param firstName  El nombre del cliente.
     * @param lastName   El apellido del cliente.
     * @param hashTable  La tabla hash (HashTable) en la que se realizará la búsqueda.
     * @return El objeto Client correspondiente al cliente encontrado, o null si no se encuentra.
     */
    public Client CustomerSearch(String firstName, String LastName, HashTable hashTable) {
        
        Client client = hashTable.buscar(firstName, LastName);
        return client;
    }

}
