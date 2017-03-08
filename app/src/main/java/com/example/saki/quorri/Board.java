package com.example.saki.quorri;

import android.widget.ImageView;

/**
 * Created by padma on 28-01-2017.
 */
public class Board {

    static int[][] board = new int[9][9];
    static int[][] wallboard = new int[9][9];
    static int[][] blackboard = new int[9][9];


    public static void initializeBoard() {


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = 0;
                wallboard[i][j] =0;
                blackboard[i][j]=0;
            }
        }
        //start positions
        blackboard[0][4] = 1;
        board[0][4] = 1;
        board[8][4] =2;
    }



    public static void changeBoard(int position,char colour,int prepos) {


            if(colour == 'W') {
                int wx, wy, owx, owy;
                wx = position % 10 - 1;
                wy = position / 10 - 1;
                board[wx][wy] = 2;
                owx = prepos % 10 - 1;
                owy = prepos / 10 - 1;
                board[owx][owy] = 0;
                //ImageView img  = findViewById

            }
        if(colour == 'B'){
            int bx,by,obx,oby;
            bx = position%10 -1;
            by = position/10 -1;
            board[bx][by] = 1;
            obx = prepos%10 -1;
            oby = prepos/10 -1;
            board[obx][oby] = 0;
        }


    }

    public static int[][] returnCurrentPosition() {

        return board;
    }
    public static int[][] returnwboard()
    {
        return wallboard;
    }
    public static int[][] returnbboard()
    {

        return blackboard;
    }


    public static boolean iswallabove(int position) {

        if(position%10 == 1 ) return true;
        else
        {
            if(wallboard[position%10-1-1 ][position/10 -1] == 1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    public static boolean isawallbelow(int position) {

        if(position%10 == 9) return true;
        else {
            if(wallboard[position%10 -1][position/10 -1] == 1)
            {
                return true;

            }
            else
            {
                return false;
            }
        }
    }


    public static boolean iswallleft(int position) {

        if(position/10 == 1)return true;
        else
        {
            if(wallboard[position%10 -1 ][position/10 -2] == 1)
            {
                return true;

            }
            else {
                return false;
            }
        }


    }

    public static boolean iswallrighgt(int position) {
        if(position/10 == 9)
        {
            return true;
        }
        else {
            if(wallboard[position%10-1][position/10-1] == 1)
            {
                return true;
            }
            else {
                return false;
            }
        }


    }

    public static void addwall(int position) {

        int wallx,wally;
        wallx= (position%10 -1);
        wally =position/10 -1;
        wallboard[wallx][wally] =1;
    }
}

