package com.tnsif.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //conventional method
        list.add(11);
        list.add(13);
        list.add(16);
        list.add(112);
        list.add(102);
        list.add(118);
        list.add(147);
        list.add(240);
        list.add(101);

        System.out.println(list);

//        List<Integer> evenList = new ArrayList<>();
//
//        for (Integer num : list) {
//            if (num % 2 == 0) {
//                evenList.add(num);
//            }
//        }
//
//        System.out.println(evenList);
        
        Stream<Integer> stream=list.stream();//stream api
        List<Integer> even=stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(even);
        
        
    }
}
