package com.gouzhijun.spring.common;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import com.beust.jcommander.internal.Lists;

/**
 * Created by gouzhijun
 * on 2018/5/9
 */
public class Common {
    volatile static List<Long> list = Lists.newArrayList(1L,2L);
//    public static void main(String[] args) throws Exception{
//        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
//        System.out.println("[0] : active thread count : " + executor.getActiveCount());
//
//        for (int i = 0; i < 5; i++) {
//            int m = i;
//            executor.submit(() -> {
//                int j = 0;
//                while(list.size() > 0) {
//                    j++;
////                    System.out.println(" i = " + String.valueOf(m) + " active");
//                }
//            });
//        }
//        System.out.println("[1] : active thread count : " + executor.getActiveCount());
//        for (int i = 0; i < 5; i++) {
//            executor.submit(() -> {
//                int j = 0;
//                while(true) {
//                    j++;
//                }
//            });
//        }
//        System.out.println("[2] : active thread count : " + executor.getActiveCount());
//        list.remove(0);
//        list.remove(0);
//        for (int i = 1; i < 1000; i++) {
//            Thread.sleep(1000);
//            System.out.println("[3] : active thread count : " + executor.getActiveCount());
//        }
//    }

    public static void main(String[] args) {
        String path = "/Users/gouzhijun/Downloads/bathing_friends_unlimited.xls";
        File file = new File(path);
        if (file.exists() && file.isFile()) {
            file.delete();
        }

    }

    private static class Person{
        boolean flag;
    }
}
