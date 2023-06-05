/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ljodi937.mapsearch;

/**
 *
 * @author jodic
 */
import java.util.ArrayList;

public class Node {
    int nodeId;
    ArrayList<Node> children;
    boolean wasVisited;

    public Node(int nodeId) {
        this.nodeId = nodeId;
        this.children = new ArrayList<Node>();
    }
}

