/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Set;
import java.io.*; 
import java.util.*; 
/**
 *
 * @author GoD
 */
public class JSet {

    public static void main(String[] args) throws IOException {
        Set<Student> hashSet = new HashSet<>();
        Set<Student> linkedHashSet = new LinkedHashSet<>();
        Set<Student> treeSet = new TreeSet<>();
/////////////Can't contains the same objects 

        hashSet.add(new Student(1));
        hashSet.add(new Student(3));
        hashSet.add(new Student(2));
        for (Student stud1 : hashSet) {
            System.out.println(stud1.id);
        }
/////////////Print objects in the correct queue 
        System.out.println("////////////////////////////");
        linkedHashSet.add(new Student(4));
        linkedHashSet.add(new Student(1));
        linkedHashSet.add(new Student(3));
        linkedHashSet.add(new Student(2));
        for (Student stud2 : linkedHashSet) {
            System.out.println(stud2.id);
        }
//////////////Print the sorted objects 
        System.out.println("////////////////////////////");
        treeSet.add(new Student(1));
        treeSet.add(new Student(3));
        treeSet.add(new Student(4));
        treeSet.add(new Student(2));
        for (Student stud3 : treeSet) {
            System.out.println(stud3.id);
        }
/////////////// 
    }
}

class Student implements Comparable {

    int id;

    public Student(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Student)) {
            return false;
        }
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Object o) {
        return id - ((Student) o).id;
    }
}
