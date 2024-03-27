/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Isabella
 */
public class HashTable {
     Lista[] clientes;
    int tamano;

    /**
    * Crea una nueva tabla hash con el tamaño especificado.
    *
    * @param tamano El tamaño deseado de la tabla hash.
    */
    public HashTable(int tamano) {
        clientes = new Lista[tamano];
        this.tamano = tamano;
        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = new Lista();
        }
    }

    /**
    * Calcula el valor hash para un par de nombres (firstName y LastName).
    * El valor hash se utiliza para determinar la posición en la tabla hash.
    *
    * @param firstName El primer nombre.
    * @param LastName  El apellido.
    * @return El valor hash calculado.
    */
    public int Hash(String firstName, String LastName) {
        int hash = 0;

        for (int i = 0; i < firstName.length(); i++) {
            char c = firstName.charAt(i);
            hash += (int) c;
        }
        for (int j = 0; j < LastName.length(); j++) {
            char e = LastName.charAt(j);
            hash += (int) e;
        }
        return hash % tamano;

    }
    
    /**
    * Calcula el valor hash para un número de habitación.
    * El valor hash se utiliza para determinar la posición en la tabla hash.
    *
    * @param room El número de habitación.
    * @return El valor hash calculado.
    */
    public int HashR(int room) {
        int hash = 0;
        String Sroom = String.valueOf(room); 
        
        for (int i = 0; i < Sroom.length(); i++) {
            char c = Sroom.charAt(i);
            hash += (int) c;
        }
      
        return hash % tamano;

    }

    /**
    * Inserta un nuevo cliente en la tabla hash utilizando los detalles proporcionados.
    * El cliente se coloca en la posición determinada por el valor hash de los nombres (firstName y LastName).
    *
    * @param room        El número de habitación del cliente.
    * @param firstName   El nombre del cliente.
    * @param LastName    El apellido del cliente.
    * @param email       El correo electrónico del cliente.
    * @param gender      El género del cliente.
    * @param phoneNumber El número de teléfono del cliente.
    * @param arrival     La fecha de llegada del cliente.
    */
    public void insertar(int room, String firstName, String LastName, String email, String gender, String phoneNumber, String arrival){
        
        int posicion = this.Hash(firstName, LastName);
        
            this.clientes[posicion].insertar(room, firstName, LastName, email, gender, phoneNumber, arrival);
           
        }

    /**
    * Busca un cliente en la tabla hash utilizando los nombres (firstName y LastName) como clave de búsqueda.
    * Retorna el cliente encontrado o null si no se encuentra.
    *
    * @param firstName El nombre del cliente a buscar.
    * @param LastName  El apellido del cliente a buscar.
    * @return El cliente encontrado o null si no se encuentra.
    */
    public Client buscar(String firstName, String LastName) {
        int posicion = this.Hash(firstName, LastName);
        
        return this.clientes[posicion].buscar(firstName, LastName);
        
    }  
    
    /**
    * Busca un cliente en la tabla hash utilizando el número de habitación como clave de búsqueda.
    * Retorna el cliente encontrado o null si no se encuentra.
    *
    * @param roomNumber El número de habitación del cliente a buscar.
    * @return El cliente encontrado o null si no se encuentra.
    */
    public Client buscarRoom(int roomNumber) {
        //int posicion = this.HashR(roomNumber);
      
        
        Client aux; 
        for (int i = 0; i < clientes.length; i++) {
            aux = clientes[i].buscarRoom(roomNumber);
    
            if (aux != null){
                return aux;
            }
        }
        return null;
    }
    
    /**
    * Elimina un cliente de la tabla hash utilizando los nombres (firstName y LastName) como clave de búsqueda.
    *
    * @param firstName El nombre del cliente a eliminar.
    * @param LastName  El apellido del cliente a eliminar.
    */
    public void eliminar(String firstName, String LastName) {
        int posicion = this.Hash(firstName, LastName);
        this.clientes[posicion].eliminar(firstName, LastName);
    }

    /**
    * Busca un cliente en la tabla hash utilizando los nombres (firstName y LastName) como clave de búsqueda
    * y devuelve una representación en forma de cadena de texto del cliente encontrado.
    *
    * @param firstName El nombre del cliente a buscar e imprimir.
    * @param LastName  El apellido del cliente a buscar e imprimir.
    * @return Una representación en forma de cadena de texto del cliente encontrado,
    *         o "El usuario no existe" si no se encuentra el cliente.
    */
    public String imprimir(String firstName, String LastName) {
        Client c = this.buscar(firstName, LastName);
        if (c != null) {
            return "Nombre: " + c.getFirstName() + "  " + c.getLastName() + " Habitacion:  " + c.getRoomNumber();
        } else {
            return "El usuario no existe";
        }

    }
    
       
}
