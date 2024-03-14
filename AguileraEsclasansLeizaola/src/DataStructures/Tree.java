/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

import Classes.Reservation;

/**
 *
 * @author Isabella
 */
public class Tree {

    private Node pRoot;

    public Tree(Node pRoot) {
        this.pRoot = pRoot;
    }

    public Tree() {
    }

    // hay que revisarlo. ESTE METODO SOLO SIRVE PARA AGREGAR NODS DE TIPO RESERVACION AL ARBOL
    public void insertReservation(Node pRoot, Reservation newReservation) {
        Node newNode = new Node(newReservation, newReservation.getId());
        if (pRoot == null) {
            // aqui no puedo hacer de una pRoot = newReservation?
            this.pRoot = newNode;
            //pRoot.setData(newReservation);
        } else {
            if (pRoot.getId() > newReservation.getId()) {
                insertReservation(pRoot.getLeftSon(), newReservation);
            } else {
                insertReservation(pRoot.getRigthSon(), newReservation);
            }
        }
    }

    public void printTree(Node node, String prefix, boolean isLeft) {
        
        if (node != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + node.getData());
            printTree(node.getLeftSon(), prefix + (isLeft ? "│   " : "    "), true);
            printTree(node.getRigthSon(), prefix + (isLeft ? "│   " : "    "), false);
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
