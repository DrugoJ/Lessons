/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;
import java.io.*;
import java.util.*;
/**
 *
 * @author GoD
 */
public class JQueue {

    public static void main(String[] args) throws IOException {
        Queue<String> linkedList = new LinkedList<>();
        Deque<String> linkedDeque = new LinkedList<>();
        Deque<String> arrayDeque = new ArrayDeque<>();
        Queue<String> priorityQueue = new PriorityQueue<>();

        arrayDeque.add("A");
        arrayDeque.add("B");
        arrayDeque.add("C");
        for (String s : arrayDeque) {
            System.out.println(s);
        }

        priorityQueue.add("A");
        priorityQueue.add("C");
        priorityQueue.add("B");
        while (priorityQueue.size() != 0) {
            System.out.println(priorityQueue.remove());
        }
    }
}
