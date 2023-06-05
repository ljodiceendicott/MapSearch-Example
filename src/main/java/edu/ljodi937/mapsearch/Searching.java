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
import java.util.LinkedList;
import java.util.Queue;

// Created by
public class Searching{
    public static void main(String[] args) {
            Node node0 = new Node(0);
            Node node1 = new Node(1);
            Node node2 = new Node(2);
            Node node3 = new Node(3);
            Node node4 = new Node(4);
            Node node5 = new Node(5);
            Node node6 = new Node(6);

            node0.children.add(node2);
            node0.children.add(node3);
            node0.children.add(node5);
            node1.children.add(node1);
            node2.children.add(node1);
            node2.children.add(node4);
            node3.children.add(node6);
            node4.children.add(node2);
            node4.children.add(node6);

            printBreadthFirst(node0);
            printShortestDistanceBetween(node0,node6);
        }
        public static void printBreadthFirst(Node n) {
            Queue<Node> queue = new LinkedList<>();
            queue.add(n);
            while(!queue.isEmpty()) {
                    Node temp = queue.poll();
                    System.out.println(temp.nodeId);
                        for (int i = 0; i < temp.children.size(); i++) {
                            if(!temp.children.get(i).wasVisited){
                            queue.add(temp.children.get(i));
                               temp.children.get(i).wasVisited=true; }
                            }

                    }
            Searching.clearflags(n);
            }
        public static void printShortestDistanceBetween(Node n, Node n2) {
            
             Queue<Node> queue = new LinkedList<>();
            queue.add(n);
            while(!queue.isEmpty()) {
                    Node temp = queue.poll();
                    if(temp==n2){
                        System.out.println("Found it!");
                    }
                        for (int i = 0; i < temp.children.size(); i++) {
                            if(temp.children.get(i)==n2){
                                System.out.println("Found it");
                            }
                            if(!temp.children.get(i).wasVisited){
                            queue.add(temp.children.get(i));
                               temp.children.get(i).wasVisited=true; }
                            }

                    }
        }
        public static void clearflags(Node n){
            //loop through and make wasvisited false;
             Queue<Node> queue = new LinkedList<>();
            queue.add(n);
            while(!queue.isEmpty()) {
                    Node temp = queue.poll();
                        for (int i = 0; i < temp.children.size(); i++) {
                               temp.children.get(i).wasVisited=false; }
                            }

                    }
        }

