package Collection_framework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.TreeMap;

public class Data_structures_in_collection_framework{
    public static void main(String[] args) {
        System.out.println("-------- DATA STRUCTURES ---------");
        System.out.println();
        //package
        //Interface
        //class
        //Wrapper class
        //Generics    -> use to apply wraper class on a data structure.
        //Objects
        //Itration
        //Collection
        //Arrays
        //Comparator
 
        //List -> store duplicate values
        List <Integer>list = new ArrayList<Integer>(0);
        list.add(0, 10);
        list.add(1, 20);
        list.add(2, 30);
        list.add(3, 40);
        System.out.println("List items : "+list);
        list.add(2, 60);
        System.out.println("List items : "+list);
        list.remove(0);
        System.out.println("Updated List : "+list);
        System.out.println();
         

        //ArrayList  -> fast non synchronous(work flow parallelly)

        //LinkedList
        List <Integer>linkedList = new LinkedList<Integer>();
        linkedList.add(0, 10);
        linkedList.add(1, 20);
        linkedList.add(2, 50);
        linkedList.add(3, 30);
        System.out.println("Linked List : "+linkedList);
        linkedList.remove(2);
        System.out.println("Updated List : "+linkedList);
        System.out.println();

       

        //Vector  -> slow , synchronys process(no parallelism)
        Vector<String> vector = new Vector<String>();
        vector.add("5");
        vector.add("6");
        vector.add("7");
        vector.add("8"); 
        vector.add("9");
        System.out.println("Vector : "+vector);
        vector.clear();
        System.out.println("clear vector : "+vector);
        System.out.println();


        //Stack  -> folllow LIFO , use to perform only one operation
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(10);
        stack.push(20);
        stack.push(40);
        System.out.println("Stack elements : "+stack);
        System.out.println("Last element : "+stack.peek());
        stack.pop();
        System.out.println("Updated stack : "+stack);
        System.out.println();


        //Queue   front(remove()/poll())    , rear(add()/offer()) , peak(top)
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(10);          // owrking but throw exception or we not use in queue
        queue.offer(20);        // offer fun use to add ele in queue
        queue.offer(30);
        queue.offer(45);
        queue.add(50);
        System.out.println("Queue : "+queue);
        System.out.println("Q remove : "+queue.remove());
        System.out.println("Queue : "+queue);
        System.out.println("Queue remove: "+queue.poll());
        System.out.println("Queue = "+queue);
        System.out.println("Q peak = "+queue.peek());
        System.out.println();



        //PriorityQueue
         PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
         pq.offer(12);
         pq.add(3);
         pq.add(5);
         pq.offer(2);
         System.out.println("PriorityQueue ="+pq.peek());
        System.out.println();

        //DeQueue   (Double ended Queue)
        //ArrayDeque
        Deque<Integer>adq = new ArrayDeque<Integer>();
        adq.offer(10);
        adq.offer(20);
        adq.offerLast(30);
        adq.pollFirst();        
        adq.offerFirst(50);
        System.out.println("Dqueue : "+adq);

        System.out.println();

        //set  -> unordered,hashing(access fast),noduplicate
        Set<Integer> set = new HashSet<Integer>();
        set.add(3);
        set.add(12);
        set.add(5);
        set.add(3);
        set.add(14);
        System.out.println("Hashset : "+set);
        System.out.println();

        //LinkedHashSet  -> return ordered,hashing,noduplicate
        LinkedHashSet<Integer> lhset = new LinkedHashSet<Integer>();
        lhset.add(4);
        lhset.add(5);
        lhset.add(8);
        lhset.add(9);
        lhset.add(5);
        System.out.println("LLset : "+lhset);
        boolean b1 = lhset.contains(8);
        System.out.println("8 present in list : "+b1);
        System.out.println();

        // treeset  -> return unique, sorted value
        TreeSet <Integer> tset = new TreeSet<Integer>();
        tset.add(10);
        tset.add(12);
        tset.add(16);
        tset.add(26);
        tset.add(22);
        tset.add(17);
        tset.add(10);
        System.out.println("Treeset : "+tset);
        System.out.println();


        //HashMap
        HashMap<String ,Integer> map = new HashMap<String , Integer>();
        map.put("Second",20);
        map.put("First",5);
        System.out.println("HashMap = "+map);
        System.out.println();

        //TreeMap
        TreeMap<String , Integer> tmap = new TreeMap<String, Integer>();
        tmap.put("Second",20);
        tmap.put("First",5);
        tmap.put("Third",50);
        System.out.println("TreeMap = "+tmap);
        System.out.println("Value = "+tmap.get("First"));
        System.out.println("Keylist = "+tmap.keySet());
        System.out.println("values = "+tmap.values());
        System.out.println();
        


        //Array
        int arr[] = {1,20,3,40,5,6,7,8,7};
        System.out.println("Array before sort : ");
        for(int e : arr)
        System.out.print(e+",");
        Arrays.sort(arr);
        System.out.println();
        System.out.println("Array after sort : ");
        for(int e : arr)
        System.out.print(e+",");
        System.out.println("Position of key : "+Arrays.binarySearch(arr,40));
        System.out.println();

        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Second");
        myList.add("First");
        myList.add("Third");
        System.out.println("List before sorted :"+myList);
        Collections.sort(myList);
        System.out.println("After sorting :"+myList);

    }
}
