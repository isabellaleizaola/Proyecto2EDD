/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aguileraesclasansleizaola;

import DataStructures.Tree;
import DatasetManagement.ConvertData;
import DatasetManagement.Data;
import static DatasetManagement.Data.obtainData;

/**
 *
 * @author Isabella
 */
public class AguileraEsclasansLeizaola {
    //prueba
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // String info = Data.obtainData("test\\Datasets\\Booking_hotel - reservas.csv");
        
//       String[] info = Data.stringToArray("test\\Datasets\\Booking_hotel - reservas.csv");
       
//        System.out.println(info);
//        for (int i = 0; i < info.length; i++){
//            System.out.println(info[i]);
//        }
        Tree example = ConvertData.ConvertRegisters();
        
       //System.out.println(example.getpRoot().getData().toString());
       
        if (example.getpRoot() != null) {
            System.out.println("bien");

        }

   //     example.printTree(example.getpRoot(), "", true);
//        
//System.out.println(Data.obtainData("test\\Datasets\\Booking_hotel - reservas.csv"));

    

}

    }