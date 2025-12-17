package collections;

import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
       // Indexed Access: Elements can be accessed using their index, just like arrays.
       // Allows Duplicates: Duplicate elements are allowed.
       // Maintains Insertion Order: Elements are stored in the order they are inserted.
       // Not Synchronized: ArrayList is not thread-safe
        Integer[] arr = {1,2,0,9,8};
        System.out.println(arr);
        ArrayList<Integer> list = new ArrayList<>(100);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.contains(8));
        System.out.println(list.indexOf(3));
        System.out.println(list.lastIndexOf(4));
        System.out.println(list.get(3));
        System.out.println(list.isEmpty());
        list.set(1,8);
        System.out.println(list);
        Object[] al =  list.toArray();
        for( Object ob : al){
            System.out.print(ob + " ");
        }
//        list.clear();
//        System.out.println(list.removeAll(list));
//        List<Integer> newList = Arrays.asList(arr);
//        newList.addAll(list);
//        Create an ArrayList and add 5 integers. Print the list.
//        Add elements at specific index positions.
//         Find the size of a list.
//         Access the first and last element of a list.
//        Remove an element using: index
//        Check if an element exists in the list.
//        Clear all elements from a list.
//        Copy one list into another list.
//        Convert an array into a list.
        // for traverse -> for loop , for each, iterator
        for (int i=0; i<list.size();i++){
//            System.out.println(list.get(i));
        }
        for(Integer value : list ){
//            System.out.println(value);
        }
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(list.reversed());
        System.out.println("After Reversed used "+list);
        Collections.reverse(list);
        System.out.println("After collection Reverse used "+list);

        //1. Print all elements in reverse order.
//    2.    Count total odd even numbers in a list.
        int odd=0,even =0;
        for(Integer value: list)
            if(value%2==0) even++;
            else odd++;

        System.out.println("Count of even no: "+ even);
        System.out.println("Count of odd no: "+ odd);

//        Find the average of elements.
        int average = 0;
        for(Integer value : list){
            average+=value;
        }
        System.out.println("sum is: "+ average);
        average /= list.size();
        System.out.println(average);

        //Find the largest and smallest element
        // list (-1,4,-30,0,45)
        Collections.sort(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
//        Find frequency of each element
        //[1,1,1,1,2,2,3,3,4]
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(4);

        ArrayList<Integer> count = new ArrayList<>(100);
        for(int i = 0;i<=100;i++) count.add(0);
        for(Integer value : list){
            int currentValue = count.get(value)+1;
            count.set(value, currentValue);
        }
        System.out.println(count);
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(Integer value : list){
            hm.put(value,hm.getOrDefault(value,0)+1);
        }
        System.out.println(hm);
        //hm.forEach((k,v) -> System.out.println(k + " Iterates: "+ v +" Times"));
//        Create an HashMap and add value -> String,key ->: integers. Print the hashmap.
//        Add elements at specific key .
//         Find the size of a map.
//        Print all keys of a HashMap.
        for( int key : hm.keySet()){
            System.out.println(key);
        }

//        Print all values of a HashMap.
        for( int value : hm.values()){
            System.out.println(value);
        }
    }
}
