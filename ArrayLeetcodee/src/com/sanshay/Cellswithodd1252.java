package com.sanshay;

import java.util.Arrays;
//
//public class Cellswithodd1252 {
//    public static void main(String[] args) {
//
//
//    }
//    public int oddCells(int m, int n, int[][] indices){
//        int [][] matrix = increment(m,n,indices);
//        int odd =0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                if(matrix[i][j]%2 !=0){
//                    odd++;
//                }
//            }
//
//        }return odd;
//    }
////    static int[][] increment(int m, int n, int[][] indices){
////        int[][] matrix = new int[m][n];
////        for(int i = 0; i < indices.length; i++){
////
////            // fix 1: increment entire row, not just column 0
////            for(int j = 0; j < n; j++){
////                matrix[indices[i][0]][j]++;
////            }
////
////            // fix 2: increment entire column properly
////            for (int j = 0; j < m; j++) {
////                matrix[j][indices[i][1]]++;
////            }
////        }
////        return matrix;
//    }
//
//    static int[][] increment(int m, int n, int[][] indices){
//        int[][] matrix = new int[m][n];
//
//        for(int i = 0; i < indices.length; i++){
//            int r = indices[i][0];
//            int c = indices[i][1];
//
//            // increment entire row r
//            for(int j = 0; j < n; j++){
//                matrix[r][j]++;
//            }
//
//            // increment entire column c
//            for(int j = 0; j < m; j++){
//                matrix[j][c]++;
//            }
//        }
//        return matrix;
//    }
//}
