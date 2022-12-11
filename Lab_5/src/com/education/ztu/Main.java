package com.education.ztu;

import java.security.KeyPair;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random rnd = new Random();

        ArrayList<Product> arrayList = new ArrayList<Product>();
        ArrayDeque<Product> arrayDeque = new ArrayDeque<Product>();
        TreeSet<Product> treeSet = new TreeSet<Product>();
        HashMap<String, Product> map = new HashMap<String, Product>();

        Product product = null;

        for (int index = 0 ; index < 10 ; ++index){
            Product p = new Product("Product " + index, rnd.nextInt(10000) + rnd.nextDouble());
            arrayList.add(p);
            arrayDeque.add(p);
            treeSet.add(p);
            map.put(p.getName(), p);
            product = p;
        }

        PrintList(arrayList, "arrayList");
        System.out.println();
        System.out.println("methods");
        System.out.println("get 0 " + arrayList.get(0));
        System.out.println("indexOf " + arrayList.indexOf(product));
        System.out.println("lastIndexOf " + arrayList.lastIndexOf(product));
        System.out.println("contains " + arrayList.contains(product));
        System.out.println("isEmpty " + arrayList.isEmpty());
        System.out.println("size " + arrayList.size());
        System.out.println("remove " + arrayList.remove(arrayList.indexOf(product)));
        System.out.println("set 0 " + arrayList.set(0, product));
        System.out.println("subList " + arrayList.subList(0, 3));
        System.out.println();

        PrintList(arrayDeque, "arrayDeque");
        System.out.println();
        System.out.println("methods");
        System.out.println("getFirst " + arrayDeque.getFirst());
        System.out.println("peekLast " + arrayDeque.peekLast());
        System.out.println("pop " + arrayDeque.pop());
        System.out.println("removeLast " + arrayDeque.removeLast());
        arrayDeque.push(product);
        System.out.println("push " + arrayDeque);
        arrayDeque.offerLast(product);
        System.out.println("offerLast " + arrayDeque);

        System.out.println();

        PrintList(treeSet, "treeSet");
        System.out.println();
        System.out.println("methods");
        System.out.println("first " + treeSet.first());
        System.out.println("last " + treeSet.last());
        System.out.println("headSet " + treeSet.headSet(product));
        System.out.println("pollLast " + treeSet.pollLast());
        System.out.println("ceiling " + treeSet.ceiling(product));
        System.out.println("floor " + treeSet.floor(product));
        System.out.println("tailSet " + treeSet.tailSet(product));

        System.out.println();


        PrintMap(map, "map");
        System.out.println();
        System.out.println("methods");
        System.out.println("get Product 3 " + map.get("Product 3"));
        System.out.println("put Product 2 " + map.put("Product 2", product));
        System.out.println("containsKey Product 3 " + map.containsKey("Product 3"));
        System.out.println("containsValue "+ product + " : " + map.containsValue(product));
        System.out.println("size " + map.size());
        System.out.println("remove Product 3 " + map.remove("Product 3"));
        System.out.println("size " + map.size());

        System.out.println();


        List<Product> ls = Arrays.asList(
                new Product("Product 2", 15),
                new Product("Product 6", 4),
                new Product("Product 1", 27),
                new Product("Product 3", 99));

        PrintList(ls, "List");
        Collections.sort(ls);
        PrintList(ls, "List sort");

        int res = Collections.binarySearch(ls, new Product("Product 2", 15));
        System.out.println("Binary search " + new Product("Product 2", 15) + " res = " + res);

        res = Collections.binarySearch(ls, product);
        System.out.println("Binary search " + product + " res = " + res);

        System.out.println("max " +Collections.max(ls));
        System.out.println("min " +Collections.min(ls));
        Collections.reverse(ls);
        System.out.println("reverse " + ls);
        Collections.rotate(ls, 2);
        System.out.println("rotate " + ls);

    }

    public static void PrintList(Collection<Product> list, String name){
        System.out.println(name);
        for (Product p :
                list) {
            System.out.println(p);
        }
    }

    public static void PrintMap(Map<String, Product> map, String name){
        System.out.println(name);
        map.forEach((key, value) ->{
            System.out.println("Key : " + key + " Value : " + value);
        });
    }

}