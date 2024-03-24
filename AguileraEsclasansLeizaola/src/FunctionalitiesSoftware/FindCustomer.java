/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FunctionalitiesSoftware;

import Classes.Client;
import Classes.HashTable;
import DatasetManagement.ConvertData;

/**
 *
 * @author Isabella
 */
public class FindCustomer {

    public Client CustomerSearch(String firstName, String LastName) {
        HashTable hashTable = ConvertData.convertStatus();
        Client client = hashTable.buscar(firstName, LastName);
        return client;
    }

}
