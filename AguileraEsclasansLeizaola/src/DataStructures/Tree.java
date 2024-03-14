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
    public void insertReservation(Reservation newReservation) {
        Node newNode = new Node(newReservation, newReservation.getId());

        if (pRoot == null) {
            pRoot = newNode;
        } else {
            Node currentNode = pRoot;
            while (true) {
                int comparison = newReservation.getId() - ((Reservation) currentNode.getData()).getId();
                if (comparison < 0) {
                    if (currentNode.getLeftSon() == null) {
                        currentNode.setLeftSon(newNode);
                        break;
                    } else {
                        currentNode = currentNode.getLeftSon();
                    }
                } else {
                    if (currentNode.getRightSon() == null) {
                        currentNode.setRightSon(newNode);
                        break;
                    } else {
                        currentNode = currentNode.getRightSon();
                    }
                }
            }
        }
    }

    public void printTree() {
    printTree(pRoot, "", true);
}

    private void printTree(Node node, String prefix, boolean isLeft) {
        if (node != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + ((Reservation) node.getData()).getId());
            printTree(node.getLeftSon(), prefix + (isLeft ? "│   " : "    "), true);
            printTree(node.getRightSon(), prefix + (isLeft ? "│   " : "    "), false);
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
    
    
     public void balanceTree() {
        pRoot = balanceSubtree(pRoot);
    }

    private Node balanceSubtree(Node node) {
        if (node == null)
            return null;

        int balance = getBalanceFactor(node);

        if (balance > 1) {
            if (getBalanceFactor(node.getLeftSon()) < 0) {
                node.setLeftSon(leftRotate(node.getLeftSon()));
            }
            return rightRotate(node);
        }
        if (balance < -1) {
            if (getBalanceFactor(node.getRightSon()) > 0) {
                node.setRightSon(rightRotate(node.getRightSon()));
            }
            return leftRotate(node);
        }

        return node;
    }

    private int getHeight(Node node) {
        if (node == null)
            return 0;
        return node.getHeight();
    }

    private int getBalanceFactor(Node node) {
        if (node == null)
            return 0;
        return getHeight(node.getLeftSon()) - getHeight(node.getRightSon());
    }

    private Node rightRotate(Node y) {
        Node x = y.getLeftSon();
        Node T2 = x.getRightSon();

        x.setRightSon(y);
        y.setLeftSon(T2);

        y.setHeight(Math.max(getHeight(y.getLeftSon()), getHeight(y.getRightSon())) + 1);
        x.setHeight(Math.max(getHeight(x.getLeftSon()), getHeight(x.getRightSon())) + 1);

        return x;
    }

    private Node leftRotate(Node x) {
        Node y = x.getRightSon();
        Node T2 = y.getLeftSon();

        y.setLeftSon(x);
        x.setRightSon(T2);

        x.setHeight(Math.max(getHeight(x.getLeftSon()), getHeight(x.getRightSon())) + 1);
        y.setHeight(Math.max(getHeight(y.getLeftSon()), getHeight(y.getRightSon())) + 1);

        return y;
    }

}
