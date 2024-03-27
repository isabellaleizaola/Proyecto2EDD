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

    /**
     * Obtiene los datos de un archivo y los devuelve como una cadena de texto.
     *
     * @param file La ruta del archivo del cual se obtendrán los datos.
     * @return Una cadena de texto que contiene los datos del archivo.
     */
    public static String obtainData(String file) {
        //String file = "Test Packages\\Datasets\\Booking_hotel - Histórico.csv";
        BufferedReader reader = null;
        String info = "";
        String line = "";
        String[] row = null;

        try {
         //   System.out.println("llegamos aqui");
            reader = new BufferedReader(new FileReader(file));
           // int i = 0;
            while ((line = reader.readLine()) != null) {
                //row[i] = line; //row[i] = line.split("\n");
                if(!line.isEmpty()){
                    
                info += line + "\n"; 
                }
//System.out.println(line);
                //row[i] = line;
                //System.out.println(row[0]);
                //info += row + "\n";
                //System.out.println(info);
//                for (String index : row) {
//                    System.out.printf("%-20s", index);
//                }
//                System.out.println();
                //i++;
            }
            reader.close();

        } catch (Exception e) {

        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {

            }
        }
        return info;
    }

    // Este metodo retorna un array que tiene una linea 
    //String[] o void
    /**
     * Convierte una cadena de texto en un arreglo utilizando saltos de línea como separador.
     *
     * @param file La cadena de texto que se convertirá en un arreglo.
     * @return Un arreglo de cadenas de texto con los elementos separados por saltos de línea.
     */
    public static String[] stringToArray(String file) {
        String data = obtainData(file);
//        return data;
        String[] dataInArray = data.split("\n");
//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i]);
//        }
//        return data;//data.split("\n");
        return dataInArray;
    }
//    
//   

}
