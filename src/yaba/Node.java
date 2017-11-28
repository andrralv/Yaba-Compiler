/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yaba;

import java.util.ArrayList;

/**
 *
 * @author CQ464UC
 */
public class Node {

    private Token value;
    private Node parent;
    private ArrayList<Node> children;
    int index;

    public Node(Token value) {
        this.value = value;
        children = new ArrayList<>();
        index = 0;
    }

    public Token getValue() {
        return value;
    }

    public void setValue(Token value) {
        this.value = value;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Node> children) {
        this.children = children;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("")
                .append(value.getValue())
                .append("\n");
        for (Node node : children) {
            
                for (int i = 0; i < node.index; i++) {
                    sb.append("\t");
            
                }
                    sb.append(node.toString());
        }
        return sb.toString();
    }
}
