package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {

    public static void main(String[] args) {

        SinglyLinkedList<Integer> s = new SinglyLinkedList<Integer>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(3);
        s.add(15);

//        s.remove(2);
//
//        System.out.println(s.size());

//        for (int i = 0; i < s.size(); i++) {
//            System.out.println(s.get(i));
//        }
//
//        System.out.println("Does s contain 20: " + s.contains(20));
//
//        System.out.println("Where is data 20: " + s.find(20));
//
//        SinglyLinkedList<Integer> copy = s.copy(s);
//
//
//        for (int i = 0; i < copy.size(); i++) {
//            System.out.println(copy.get(i));
//        }

        s.sort();
        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i));
        }


    }



    // new linked list (copy) = deep copy || link up data, not address
    // create new linked list
    // iterate through original grabbing data, new nodes in the new list, adding data in order
    // maybe easier to do it reverse order
}
