package com.example.saki.quorri;

/**
 * Created by padma on 28-01-2017.
 */
public class ValdiateMove {


    static int[][] board = new int[9][9];
    static int[][] wboard = new int[9][9];
    static int[][] bboard = new int[9][9];
    static int wx;
    static int wy;
    static int bx;
    static int by;

    static boolean Validate(int position) {
        board = Board.returnCurrentPosition();
        //bboard = Board.returnwboard();

        int i, j;
        boolean iswhite, isblack;
        int wpos, bpos;
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                if (board[i][j] == 1) {
                    bx = i;
                    by = j;
                }
                if (board[i][j] == 2) {
                    wx = i;
                    wy = j;
                }
            }
        }
        iswhite = Game.getturn();
        // System.out.println("something");
        wpos = (wy + 1) * 10 + (wx + 1);
        bpos = (by + 1) * 10 + (bx + 1);
        boolean iswallup = Board.iswallabove(position);
        boolean iswalldown = Board.isawallbelow(position-1);
        boolean iswleft = Board.iswallleft(position-10);
        boolean iswright = Board.iswallrighgt(position);

        if (iswhite == true) {
            if ((position == wpos - 1) || (position == wpos + 1) || position == (wpos + 10) || (position == wpos - 10)) {

                if ((position == wpos - 1) && (iswallup == false)) {
                    Board.changeBoard(position, 'W', wpos);

                    return true;
                } else if ((position == wpos + 1) && (iswalldown == false)) {
                    Board.changeBoard(position, 'W', wpos);
                    return true;
                } else if ((position == wpos + 10) && (iswright == false)) {
                    Board.changeBoard(position, 'W', wpos);
                    ;
                    return true;
                } else if ((position == wpos - 10) && (iswleft == false)) {
                    Board.changeBoard(position, 'W', wpos);
                    return true;
                }
                else return false;
            }

            else {
                //  System.out.println("something");
                return false;
            }
        }

        else {
            if ((position == bpos - 1) || (position == bpos + 1) || (position == bpos + 10) || (position == bpos - 10)) {
                Board.changeBoard(position, 'B', bpos);
                return true;
            }
            else
                return false;
        }
    }

    public static boolean validatewall(int position) {
        wboard = Board.returnwboard();
        int i,j;
        int []wx = new int[9];
        int []wy = new int [9];
        for(i=0;i<9;i++)
        {
            for(j=0;j<9;j++)
            {
                if(wboard[i][j] == 1)
                {
                    if((position%10 -1 ) == i && (position/10-1) == j)
                    {
                        return false;
                    }
                }
            }
        }

        Board.addwall(position);
        return true;




    }
}
