package com.sandip.designpattern.structural.adapter;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

    public static void main(String[] args) {
        Integer[] integers = new Integer[]{10, 20, 30, 40};
        List<Integer> list = Arrays.asList(integers);
        System.out.println(integers);
        System.out.println(list);
    }
}
