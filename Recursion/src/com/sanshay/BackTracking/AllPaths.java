package com.sanshay.BackTracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {

        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[board.length][board[0].length];
        allpath("",board,0,0);
        allpathPrint("",board,0,0,path,1);
    }
    static void allpath (String p, boolean[][] maze,int r , int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }


        // i am consideering this path
        maze[r][c] = false;


        if(r < maze.length-1) {
            allpath(p+'D',maze,r+1,c);
        }

        if(c < maze[0].length - 1) {
            allpath(p+'R',maze,r,c+1);
        }
        if(r>0) {
            allpath(p+'U',maze,r-1,c);
        }
        if(c >0) {
            allpath(p+'L',maze,r,c-1);
        }

        // yaha function khatam so before this remove the changes that were  made by the function
        maze[r][c] = true;

    }


    //backtracking - make a change then when work is done reverse the change


    static void allpathPrint (String p, boolean[][] maze,int r , int c,int[][] path,int step){
        if(r == maze.length-1 && c == maze[0].length-1){
            path[r][c] = step;

            for(int[] num: path){
                System.out.println(Arrays.toString(num));

            }
            System.out.println(p);

            return;
        }
        if(!maze[r][c]){
            return;
        }


        // i am consideering this path
        maze[r][c] = false;
        path[r][c] = step;


        if(r < maze.length-1) {
            allpathPrint(p+'D',maze,r+1,c,path, step+1);
        }

        if(c < maze[0].length - 1) {
            allpathPrint(p+'R',maze,r,c+1,path, step+1);
        }
        if(r>0) {
            allpathPrint(p+'U',maze,r-1,c,path, step+1);
        }
        if(c >0) {
            allpathPrint(p+'L',maze,r,c-1,path, step+1);
        }

        // yaha function khatam so before this remove the changes that were  made by the function
        maze[r][c] = true;
        path[r][c] = 0;

    }




}
