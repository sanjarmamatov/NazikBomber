package com.example.sanjar.rm0403;

import java.util.Arrays;

/**
 * Created by Sanjar on 19.03.2017.
 */

public class GameGrid {

    private char[][] gridArray;
    private char turn;
    private String message;
    private int p1;
    private int p2;



    public GameGrid(){
        gridArray = new char[5][5];
        fillE();
    }

    public void fillE(){
        Arrays.fill(gridArray[0], 'e');
        Arrays.fill(gridArray[1], 'e');
        Arrays.fill(gridArray[2], 'e');
        Arrays.fill(gridArray[3], 'e');
        Arrays.fill(gridArray[4], 'e');
        gridArray[1][1] = 'b';
        gridArray[2][4] = 'b';
        gridArray[4][2] = 'b';
        turn = 'x';
        message = "hodit p1";
    }


    public char getTurn(){
        return turn;
    }
    public void setTurn(char symbol){
        turn = symbol;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public char getContent(int x, int y){
        return gridArray[x][y];
    }

    public void setContent(int x, int y, char symbol){
        gridArray[x][y]=symbol;
    }
    public int getP1(){
        return p1;
    }
    public int getP2(){
        return p2;
    }
    public void setP1(int p1){
        this.p1 = p1;
    }
    public void setP2(int p2){
        this.p2 = p2;
    }















}
