//2082-03-10 lab 4
//Q5. WAP to give an example og arraylist , hashmaps and hashset .
package javalabcollege;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public class CollectionFramework {
    public static void main(String[] args) {
        ArrayList <Integer> marks = new ArrayList<>();
        HashSet<String> name = new HashSet<>();
        HashMap<Integer,String> table = new HashMap<>();
        marks.add(30);
        marks.add(50);
        marks.add(60);
        marks.add(60);
        name.add("Pradeep");
        name.add("Ram");
        name.add("Abiral");
        name.add("Purnima");
        table.put(1,"Ram");
        table.put(2,"Kritikans");
        table.put(3,"Abiral");
        table.put(4,"Roshan");
        table.put(5,"Purnima");
        System.out.println("The marks in the array list are:");
        for(int a:marks){
            System.out.print(a+"\t");
        }
        System.out.println("\nThe names in the hash set are:");
        for(String a:name){
            System.out.print(a+"\t");
        }
        System.out.println("\nThe data's in the hash map are:");
        for(int key: table.keySet()){
            System.out.println(key+"\t"+table.get(key));
        }
    }
}
