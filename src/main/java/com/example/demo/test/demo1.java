package com.example.demo.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: com.example.demo.test->demo1
 * @description:
 * @author: jiangzihan
 * @create: 2020-08-10 17:32
 **/
public class demo1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.stream().forEach(f-> System.out.print(f));
        list.add(2,2);
        System.out.println();
        list.stream().forEach(f-> System.out.print(f));
    }
}
