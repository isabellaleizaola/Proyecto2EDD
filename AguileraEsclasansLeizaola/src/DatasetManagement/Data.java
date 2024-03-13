/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatasetManagement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Isabella
 */
public class Data {

    public static String obtainData(String file) {
        //String file = "Test Packages\\Datasets\\Booking_hotel - Histórico.csv";
        BufferedReader reader = null;
        String info = "";
        String line = "";
        String[] row = null;
        
        try {
            reader = new BufferedReader(new FileReader(file));
            int i = 0;
            while ((line = reader.readLine()) != null) {
                //row[i] = line; //row[i] = line.split("\n");
                row = line.split("\n");
                
                info += row + "\n";
                System.out.println(info);
//                for (String index : row) {
//                    System.out.printf("%-20s", index);
//                }
//                System.out.println();
//                i++;
            }
            reader.close();
            
        } catch (Exception e) {

        } finally {
            try {
                if (reader != null){
                reader.close();  
                }
            } catch (IOException e) {

            }
        }
        return info;
    }
    
    // Este metodo retorna un array que tiene una linea 
    public static String[] stringToArray(String file){
        String data = obtainData(file);
        return data.split("\n");
    }
    
   
    
}