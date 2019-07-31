/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;
import java.io.*; 
import java.util.*;
/**
 *
 * @author GoD
 */
public class JList {

    public static void main(String[] args) throws IOException {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        List<Integer> vector = new Vector<>();
        List<String> stack = new Stack<>();
        List<Integer> synList = Collections.synchronizedList(new ArrayList<>());
        arrayList.add("A"); 
        arrayList.add("B"); 
        arrayList.add("C"); 
        /////////////////modify when iterate 
        /*for(int i = 0;i<arrayList.size();i++){ 
        System.out.println(arrayList.get(i)); 
        arrayList.remove(i); 
        }*/
        /////////////////Sort 
        /*arrayList.add(new Student(1)); 
        arrayList.add(new Student(3)); 
        arrayList.add(new Student(2)); 
        for(Student s : arrayList){ 
        System.out.println(s.id); 
        } 
        Collections.sort(arrayList); 
        for(Student s: arrayList){ 
        System.out.println(s.id); 
        }*/
        /////////////////////Binary Searching 
        /*Collections.sort(arrayList); 
        System.out.println(arrayList.get(Collections.binarySearch(arrayList,"C")));*/
        /////////////////////To array and back 
        /*String [] strings = new String[arrayList.size()]; 
        strings = arrayList.toArray(strings); 
        System.out.println(Arrays.toString(strings)); 
        List<String> stringList = Arrays.asList(strings); 
        System.out.println(stringList.get(0)); 
        System.out.println(stringList.get(1)); 
        System.out.println(stringList.get(2));*/
        //////////////////////List equals 
        /*System.out.println(stringList.equals(arrayList));*/
        //////////////////////To String 
        /*System.out.println(arrayList);*/
        //////////////////////Vector vs Syn 
        /*List <Integer> test = new ArrayList<>(); 
        long start = System.currentTimeMillis(); 
        for(int i =0; i<1000000;i++){ 
        synList.add(i); 
        } 
        System.out.println(System.currentTimeMillis()-start); 

        long start2 = System.currentTimeMillis(); 
        for (int j =0; j<1000000;j++){ 
        vector.add(j); 
        } 
        System.out.println(System.currentTimeMillis()-start2); 

        long start3 = System.currentTimeMillis(); 
        for (int k =0; k<1000000;k++){ 
        test.add(k); 
        } 
        System.out.println(System.currentTimeMillis()-start3); 
         */
        //////////////////////////////add lot of elements 
        /*for (int i = 0; i < 2_000_000_000; i++) {
            arrayList.add(i);
        }*/

    }
}

class Student implements Comparable {

    int id;
    String name;

    public Student(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        return id - ((Student) o).id;
    }
}
