package com.example.sanjar.rm0403;

/**
 * Created by Sanjar on 19.03.2017.
 */

public class GameLogic {
GameGrid grid;

    private boolean active;


    public GameLogic(GameGrid grid){
this.grid=grid;
        restart();
    }

    public void restart(){
        grid.fillE();

    }


    public boolean isVictory(){
        active = true;
            if(grid.getP1()>grid.getP2()&&grid.getP1()!=1){
            grid.setMessage("Player2 won");
            active = false;
            }
            else if(grid.getP1()<grid.getP2()&&grid.getP2()!=1){
                grid.setMessage("Player1 won");
                active = false;
        }

        return active;
    }

}