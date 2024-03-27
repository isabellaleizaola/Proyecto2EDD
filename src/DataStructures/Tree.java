/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

import Classes.Client;
import Classes.Reservation;
import Classes.Room;
import Classes.Record;

/**
 *
 * @author Isabella
 */
public class Tree {

    private Node pRoot;

    /**
     * Crea una nueva instancia de un árbol con una raíz especificada.
     *
     * @param pRoot La raíz del árbol.
     */
    public Tree(Node pRoot) {
        this.pRoot = pRoot;
    }

    /**
     * Crea una nueva instancia de un árbol vacío.
     */
    public Tree() {
    }
    
    /**
     * Inserta una habitación en el árbol.
     *
     * @param newRoom La habitación a insertar.
     */
    public void insertRoom(Room newRoom) {
        pRoot = insertRoom(pRoot, newRoom);

    }
    
    /**
     * Inserta una habitación en el subárbol con la raíz dada.
     *
     * @param node     La raíz del subárbol.
     * @param newRoom  La habitación a insertar.
     * @return La raíz del subárbol actualizada después de la inserción.
     */
    private Node insertRoom(Node node, Room newRoom) {

        if (node == null) {
            return new Node(newRoom, newRoom.getNumber());
        }
        
        int comparison = newRoom.getNumber() - ((Room) node.getData()).getNumber();
        if (comparison < 0) {
            node.setLeftSon(insertRoom(node.getLeftSon(), newRoom));
        } else if (comparison > 0) {
            node.setRightSon(insertRoom(node.getRightSon(), newRoom));
        } else {

        }

        node.setHeight(1 + Math.max(getHeight(node.getLeftSon()), getHeight(node.getRightSon())));

        int balance = getBalance(node);

        if (balance > 1 && newRoom.getNumber() < ((Room) node.getLeftSon().getData()).getNumber()) {
            return rotateRight(node);
        }

        if (balance < -1 && newRoom.getNumber() > ((Room) node.getRightSon().getData()).getNumber()) {
            return rotateLeft(node);
        }

        if (balance > 1 && newRoom.getNumber() > ((Room) node.getLeftSon().getData()).getNumber()) {
            node.setLeftSon(rotateLeft(node.getLeftSon()));
            return rotateRight(node);
        }

        if (balance < -1 && newRoom.getNumber() < ((Room) node.getRightSon().getData()).getNumber()) {
            node.setRightSon(rotateRight(node.getRightSon()));
            return rotateLeft(node);
        }

        return node;
    }

    /**
     * Inserta una reserva en el árbol.
     *
     * @param newReservation La reserva a insertar.
     */
    public void insertReservation(Reservation newReservation) {
        pRoot = insertReservation(pRoot, newReservation);

    }

    /**
     * Inserta una reserva en el subárbol con la raíz dada.
     *
     * @param node           La raíz del subárbol.
     * @param newReservation La reserva a insertar.
     * @return La raíz del subárbol actualizada después de la inserción.
     */
    private Node insertReservation(Node node, Reservation newReservation) {

        if (node == null) {
            return new Node(newReservation, newReservation.getId());
        }

        int comparison = newReservation.getId() - ((Reservation) node.getData()).getId();
        if (comparison < 0) {
            node.setLeftSon(insertReservation(node.getLeftSon(), newReservation));
        } else if (comparison > 0) {
            node.setRightSon(insertReservation(node.getRightSon(), newReservation));
        } else {

        }

        node.setHeight(1 + Math.max(getHeight(node.getLeftSon()), getHeight(node.getRightSon())));

        int balance = getBalance(node);

        if (balance > 1 && newReservation.getId() < ((Reservation) node.getLeftSon().getData()).getId()) {
            return rotateRight(node);
        }

        if (balance < -1 && newReservation.getId() > ((Reservation) node.getRightSon().getData()).getId()) {
            return rotateLeft(node);
        }

        if (balance > 1 && newReservation.getId() > ((Reservation) node.getLeftSon().getData()).getId()) {
            node.setLeftSon(rotateLeft(node.getLeftSon()));
            return rotateRight(node);
        }

        if (balance < -1 && newReservation.getId() < ((Reservation) node.getRightSon().getData()).getId()) {
            node.setRightSon(rotateRight(node.getRightSon()));
            return rotateLeft(node);
        }

        return node;
    }

    /**
     * Realiza una rotación hacia la izquierda en el subárbol con la raíz dada.
     *
     * @param node La raíz del subárbol.
     * @return La nueva raíz del subárbol después de la rotación.
     */
    private Node rotateLeft(Node node) {
        Node rightChild = node.getRightSon();
        Node leftGrandchild = rightChild.getLeftSon();

        rightChild.setLeftSon(node);
        node.setRightSon(leftGrandchild);

        // Actualiza heights
        node.setHeight(1 + Math.max(getHeight(node.getLeftSon()), getHeight(node.getRightSon())));
        rightChild.setHeight(1 + Math.max(getHeight(rightChild.getLeftSon()), getHeight(rightChild.getRightSon())));

        return rightChild;
    }

    /**
     * Realiza una rotación hacia la derecha en el subárbol con la raíz dada.
     *
     * @param node La raíz del subárbol.
     * @return La nueva raíz del subárbol después de la rotación.
     */
    private Node rotateRight(Node node) {
        Node leftChild = node.getLeftSon();
        Node rightGrandchild = leftChild.getRightSon();

        leftChild.setRightSon(node);
        node.setLeftSon(rightGrandchild);

        node.setHeight(1 + Math.max(getHeight(node.getLeftSon()), getHeight(node.getRightSon())));
        leftChild.setHeight(1 + Math.max(getHeight(leftChild.getLeftSon()), getHeight(leftChild.getRightSon())));

        return leftChild;
    }
    
    /**
     * Elimina una reserva del árbol dado su ID de reserva.
     *
     * @param reservationId El ID de reserva a eliminar.
     */
    public void deleteReservation(int reservationId) {
        pRoot = deleteReservation(pRoot, reservationId);
    }

    /**
     * Elimina una reserva del subárbol con la raíz dada, dado su ID de reserva.
     *
     * @param node          La raíz del subárbol.
     * @param reservationId El ID de reserva a eliminar.
     * @return La raíz del subárbol actualizada después de la eliminación.
     */
    private Node deleteReservation(Node node, int reservationId) {
        if (node == null) {
            return null; // Reservation not found
        }

        int comparison = reservationId - ((Reservation) node.getData()).getId();

        if (comparison < 0) {
            node.setLeftSon(deleteReservation(node.getLeftSon(), reservationId));
        } else if (comparison > 0) {
            node.setRightSon(deleteReservation(node.getRightSon(), reservationId));
        } else {
            // Reservation found, perform deletion
            if (node.getLeftSon() == null && node.getRightSon() == null) {
                // Case 1: Node is a leaf (no children)
                return null;
            } else if (node.getLeftSon() == null) {
                // Case 2: Node has only a right child
                return node.getRightSon();
            } else if (node.getRightSon() == null) {
                // Case 3: Node has only a left child
                return node.getLeftSon();
            } else {
                // Case 4: Node has both left and right children
                Node successor = findMinNode(node.getRightSon());
                node.setData(successor.getData());
                node.setRightSon(deleteReservation(node.getRightSon(), ((Reservation) successor.getData()).getId()));
            }
        }

        node.setHeight(1 + Math.max(getHeight(node.getLeftSon()), getHeight(node.getRightSon())));
        int balance = getBalance(node);

        if (balance > 1 && getBalance(node.getLeftSon()) >= 0) {
            return rotateRight(node);
        }

        if (balance > 1 && getBalance(node.getLeftSon()) < 0) {
            node.setLeftSon(rotateLeft(node.getLeftSon()));
            return rotateRight(node);
        }

        if (balance < -1 && getBalance(node.getRightSon()) <= 0) {
            return rotateLeft(node);
        }

        if (balance < -1 && getBalance(node.getRightSon()) > 0) {
            node.setRightSon(rotateRight(node.getRightSon()));
            return rotateLeft(node);
        }

        return node;
    }

    /**
     * Encuentra el nodo con el valor mínimo en el subárbol con la raíz dada.
     *
     * @param node La raíz del subárbol.
     * @return El nodo con el valor mínimo en el subárbol.
     */
    private Node findMinNode(Node node) {
        Node current = node;
        while (current.getLeftSon() != null) {
            current = current.getLeftSon();
        }
        return current;
    }

    //METODOS PARA AGREGAR RECORDS AL ARBOL DE RECORDS
    /**
     * Inserta un nuevo registro en el árbol.
     *
     * @param newRecord El nuevo registro a insertar.
     */
    public void insertRecord(Record newRecord) {
        pRoot = insertRecord(pRoot, newRecord);

    }

    /**
     * Inserta un nuevo registro en el subárbol con la raíz dada.
     *
     * @param node      La raíz del subárbol.
     * @param newRecord El nuevo registro a insertar.
     * @return La raíz del subárbol actualizada después de la inserción.
     */
    private Node insertRecord(Node node, Record newRecord) {

        if (node == null) {
            List newList = new List();
            newList.AddRecordToList(newRecord);
            return new Node(newList, newRecord.getRoomNumber());
        }

        int comparison = newRecord.getRoomNumber() - node.getId();
        if (comparison < 0) {
            node.setLeftSon(insertRecord(node.getLeftSon(), newRecord));
        } else if (comparison > 0) {
            node.setRightSon(insertRecord(node.getRightSon(), newRecord));
        } else {
            // node.getData().
        }

        node.setHeight(1 + Math.max(getHeight(node.getLeftSon()), getHeight(node.getRightSon())));

        int balance = getBalance(node);

        if (balance > 1 && newRecord.getRoomNumber() < node.getLeftSon().getId()) {
            return rotateRight(node);
        }

        if (balance < -1 && newRecord.getId() > node.getRightSon().getId()) {
            return rotateLeft(node);
        }

        if (balance > 1 && newRecord.getRoomNumber() > node.getLeftSon().getId()) {
            node.setLeftSon(rotateLeft(node.getLeftSon()));
            return rotateRight(node);
        }

        if (balance < -1 && newRecord.getId() < node.getRightSon().getId()) {
            node.setRightSon(rotateRight(node.getRightSon()));
            return rotateLeft(node);
        }

        return node;
    }

    /**
     * Busca una reserva por su identificador en el árbol.
     *
     * @param id El identificador de la reserva a buscar.
     * @return El nodo correspondiente a la reserva encontrada, o null si no se encontró.
     */
    public Node searchReservation(int id) {
        Node pointer = this.pRoot;
        if (pointer == null) {
            return null;
        }
        while (pointer.getId() != id) {
            if (id < pointer.getId() && pointer.getLeftSon() != null) {
                pointer = pointer.getLeftSon();
            } else if (id > pointer.getId() && pointer.getRightSon() != null) {
                pointer = pointer.getRightSon();
            } else if (id == pointer.getId()) {
                System.out.println("hasta aca");
                break;
            } else {
                return null;
            }
        }
        return pointer;
    }

    /**
     * Busca una habitación por su número en el árbol.
     *
     * @param roomNum El número de habitación a buscar.
     * @return El nodo correspondiente a la habitación encontrada, o null si no se encontró.
     */
    public Node searchRoom(int roomNum) {
        Node pointer = this.pRoot;
        if (pointer == null) {
            return null;
        }
        while (pointer.getId() != roomNum) {
            if (roomNum < pointer.getId() && pointer.getLeftSon() != null) {
                pointer = pointer.getLeftSon();
            } else if (roomNum > pointer.getId() && pointer.getRightSon() != null) {
                pointer = pointer.getRightSon();
            } else {
                return null;
            }
        }
        return pointer;
    }
    
    /**
     * Verifica si una habitación existe en el árbol.
     *
     * @param roomNum El número de habitación a buscar.
     * @return true si la habitación existe en el árbol, false de lo contrario.
     */
    public boolean searchRoomB(int roomNum) {
        Node pointer = this.pRoot;
        if (pointer == null) {
            return false;
        }
        while (pointer.getId() != roomNum) {
            if (roomNum < pointer.getId() && pointer.getLeftSon() != null) {
                pointer = pointer.getLeftSon();
            } else if (roomNum > pointer.getId() && pointer.getRightSon() != null) {
                pointer = pointer.getRightSon();
            } else {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Establece el estado de una habitación en el árbol.
     *
     * @param roomNum El número de habitación a buscar y actualizar.
     * @param status  El nuevo estado de la habitación.
     * @return true si se encontró y actualizó la habitación, false si no se encontró.
     */
    public boolean searchRoomSetS(int roomNum, boolean status) {
        Node pointer = this.pRoot;
        Room aux = (Room) pointer.getData();
        if (pointer == null) {
            return false;
        }
        while (pointer.getId() != roomNum) {
            if (roomNum < pointer.getId() && pointer.getLeftSon() != null) {
                pointer = pointer.getLeftSon();
            } else if (roomNum > pointer.getId() && pointer.getRightSon() != null) {
                pointer = pointer.getRightSon();
            } else {
                return false;
            }
        }
        aux.setStatus(status);
        
        pointer.setData(aux);
        return true;
    }
    
    /**
     * Busca una habitación disponible por su tipo en el árbol.
     *
     * @param type El tipo de habitación a buscar.
     * @return El número de habitación disponible encontrado, o 0 si no hay habitaciones disponibles.
     */
    public int searchAvailableRoom(String type) {
        return searchAvailableRoom(pRoot, type);
    }
    
    /**
     * Busca una habitación disponible por su tipo en el subárbol especificado.
     *
     * @param node El nodo raíz del subárbol a buscar.
     * @param type El tipo de habitación a buscar.
     * @return El número de habitación disponible encontrado, o 0 si no hay habitaciones disponibles.
     */
    private int searchAvailableRoom(Node node, String type) {
        if (node == null) {
            return 0;
        }

        int result = 0;

        result = searchAvailableRoom(node.getLeftSon(), type); // Recorrer subárbol izquierdo

        Room room = (Room) node.getData();
        if (room.getType().equals(type) && room.isStatus()) {
            result = room.getNumber();
            room.setStatus(false);
        }

        if (result == 0) {
            result = searchAvailableRoom(node.getRightSon(), type); // Recorrer subárbol derecho
        }

        return result;
    } 

     /**
     * Obtiene el balance de un nodo en el árbol.
     *
     * @param node El nodo para el cual se desea obtener el balance.
     * @return El balance del nodo.
     */
    private int getBalance(Node node) {
        if (node == null) {
            return 0;
        }
        return getHeight(node.getLeftSon()) - getHeight(node.getRightSon());
    }

    /**
     * Obtiene la altura de un nodo en el árbol.
     *
     * @param node El nodo para el cual se desea obtener la altura.
     * @return La altura del nodo.
     */
    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return node.getHeight();
    }

    /**
     * Imprime el árbol en la consola.
     */
    public void printTree() {
        printTree(pRoot, "");
    }

    /**
     * Imprime un subárbol en la consola.
     *
     * @param node   El nodo raíz del subárbol a imprimir.
     * @param indent La cadena de indentación para una representación visual adecuada del árbol.
     */
    private void printTree(Node node, String indent) {
        if (node != null) {
            System.out.println(indent + "!--- " + ((Reservation) node.getData()).getId());
            printTree(node.getLeftSon(), indent + "L   ");
            printTree(node.getRightSon(), indent + "R   ");
        }
    }

    

    /**
     * @return the pRoot
     */
    public Node getpRoot() {
        return pRoot;
    }

    /**
     * @param pRoot the pRoot to set
     */
    public void setpRoot(Node pRoot) {
        this.pRoot = pRoot;
    }

}
