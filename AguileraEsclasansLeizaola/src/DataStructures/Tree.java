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
        printTree(pRoot, "");
    }

    private void printTree(Node node, String indent) {
        if (node != null) {
            System.out.println(indent + "!--- " + ((Reservation) node.getData()).getId());
            printTree(node.getLeftSon(), indent + "L   ");
            printTree(node.getRightSon(), indent + "R   ");
        }
    }
    
    public void printPreorder() {
        printPreorder(pRoot);
    }

    private void printPreorder(Node node) {
        if (node != null) {
            System.out.println(((Reservation) node.getData()).getId());
            printPreorder(node.getLeftSon());
            printPreorder(node.getRightSon());
        }
    }

    public void printInorder() {
        printInorder(pRoot);
    }

    private void printInorder(Node node) {
        if (node != null) {
            printInorder(node.getLeftSon());
            System.out.println(((Reservation) node.getData()).getId());
            printInorder(node.getRightSon());
        }
    }

    public void printPostorder() {
        printPostorder(pRoot);
    }

    private void printPostorder(Node node) {
        if (node != null) {
            printPostorder(node.getLeftSon());
            printPostorder(node.getRightSon());
            System.out.println(((Reservation) node.getData()).getId());
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
        if (node == null) {
            return null;
        }

        int balanceFactor = getBalanceFactor(node);

        if (balanceFactor > 1) {
            if (getBalanceFactor(node.getLeftSon()) >= 0) {
                // Left-Left case
                return rotateRight(node);
            } else {
                // Left-Right case
                node.setLeftSon(rotateLeft(node.getLeftSon()));
                return rotateRight(node);
            }
        } else if (balanceFactor < -1) {
            if (getBalanceFactor(node.getRightSon()) <= 0) {
                // Right-Right case
                return rotateLeft(node);
            } else {
                // Right-Left case
                node.setRightSon(rotateRight(node.getRightSon()));
                return rotateLeft(node);
            }
        }

        return node;
    }

    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return node.getHeight();
    }

    private int getBalanceFactor(Node node) {
        return getHeight(node.getLeftSon()) - getHeight(node.getRightSon());
    }

    private Node rotateRight(Node node) {
        Node newRoot = node.getLeftSon();
        node.setLeftSon(newRoot.getRightSon());
        newRoot.setRightSon(node);

        updateHeight(node);
        updateHeight(newRoot);

        return newRoot;
    }

    private Node rotateLeft(Node node) {
        Node newRoot = node.getRightSon();
        node.setRightSon(newRoot.getLeftSon());
        newRoot.setLeftSon(node);

        updateHeight(node);
        updateHeight(newRoot);

        return newRoot;
    }

    private void updateHeight(Node node) {
        int leftHeight = getHeight(node.getLeftSon());
        int rightHeight = getHeight(node.getRightSon());
        node.setHeight(Math.max(leftHeight, rightHeight) + 1);
    }
}
