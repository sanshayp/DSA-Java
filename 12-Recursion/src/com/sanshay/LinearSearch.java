package com.sanshay;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {1, 8, 3, 5, 8,8, 8,9};
//          System.out.println(find(arr, 5, 0));
//        System.out.println(findIndex(arr, 4, 0));
//        System.out.println(findIndexLast(arr, 4, arr.length-1));
//       findAllIndex(arr, 8, 0);
//        System.out.println(list);
//        ArrayList<Integer> list= new ArrayList<>();
//        ArrayList<Integer>ans = findAllIndex1(arr,8,0,list);
//        System.out.println(list);

        System.out.println(findAllIndex2(arr,8,0));
    }


    static boolean find(int[] arr,int target,int index){
        if(index ==  arr.length) return false;

        return arr[index] == target || find(arr,target,index+1);
    }


    static int findindex(int[] arr,int target,int index){
        if(index == arr.length) return -1;
        if(arr[index] == target) return index;
        else return findindex(arr,target,index+1);
    }


   static ArrayList<Integer> list = new ArrayList<>();
   static void findAllIndex(int[] arr,int target,int index){
        if(index == arr.length) return ;
        if(arr[index] == target) list.add(index);
        findAllIndex(arr,target,index+1);
    }


    static ArrayList<Integer> findAllIndex1(int[] arr,int target,int  index,ArrayList<Integer> list){
        if(index == arr.length) return list;
        if(arr[index] == target) list.add(index);
        return findAllIndex1(arr,target,index+1,list);
   }

    static ArrayList<Integer> findAllIndex2(int[] arr,int target,int  index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length) return list;
        if(arr[index] == target) list.add(index);
        ArrayList<Integer> ansFromBelow = findAllIndex2(arr,target,index+1);
        list.addAll(ansFromBelow);
        return list;
    }

}
