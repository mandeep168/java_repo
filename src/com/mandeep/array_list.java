package com.mandeep;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Scanner;

public class array_list {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(1);          // push_back in c++
        list.add(2);          // amortised complexity is O(1).
        list.add(3);
        list.add(4);
        list.add(5);

        list.contains(78);         //checks if the element present or not

        list.set(1,100);        //updates an element at an index, gives indexOutOfBoundsException
        list.remove(2);     //removes element from given index

        System.out.println(list);        //uses toString() internally
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //2D arraylists
        ArrayList<ArrayList<Integer>> list2D = new ArrayList<>();
        for(int i=0;i<2;i++) {
            list2D.add(new ArrayList<>());
            for(int j=0;j<2;j++){
                list2D.get(i).add(input.nextInt());
            }
        }
        System.out.println(list2D);
    }

}
