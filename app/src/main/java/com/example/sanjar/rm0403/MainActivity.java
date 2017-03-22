package com.example.sanjar.rm0403;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b00,b01,b02,b03,b04,b10,b11,b12,b13,b14,b20,b21,b22,b23,b24,b30,b31,b32,b33,b34,b40,b41,b42,b43,b44,br;
    TextView tv;
    View.OnClickListener oclBtn;
    int p1=0,p2=0;
    GameGrid grid = new GameGrid();
    GameLogic logic = new GameLogic(grid);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        oclBtn = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (view.getId()){
                    case R.id.b00:
                        update(b00,0,0);
                        break;
                    case R.id.b01:
                        update(b01,0,1);
                        break;
                    case R.id.b02:
                        update(b02,0,2);
                        break;
                    case R.id.b03:
                        update(b03,0,3);
                        break;
                    case R.id.b04:
                        update(b04,0,4);
                        break;
                    case R.id.b10:
                        update(b10,1,0);
                        break;
                    case R.id.b11:
                        update(b11,1,1);
                        break;
                    case R.id.b12:
                        update(b12,1,2);
                        break;
                    case R.id.b13:
                        update(b13,1,3);
                        break;
                    case R.id.b14:
                        update(b14,1,4);
                        break;
                    case R.id.b20:
                        update(b20,2,0);
                        break;
                    case R.id.b21:
                        update(b21,2,1);
                        break;
                    case R.id.b22:
                        update(b22,2,2);
                        break;
                    case R.id.b23:
                        update(b23,2,3);
                        break;
                    case R.id.b24:
                        update(b24,2,4);
                        break;
                    case R.id.b30:
                        update(b30,3,0);
                        break;
                    case R.id.b31:
                        update(b31,3,1);
                        break;
                    case R.id.b32:
                        update(b32,3,2);
                        break;
                    case R.id.b33:
                        update(b33,3,3);
                        break;
                    case R.id.b34:
                        update(b34,3,4);
                        break;
                    case R.id.b40:
                        update(b40,4,0);
                        break;
                    case R.id.b41:
                        update(b41,4,1);
                        break;
                    case R.id.b42:
                        update(b42,4,2);
                        break;
                    case R.id.b43:
                        update(b43,4,3);
                        break;
                    case R.id.b44:
                        update(b44,4,4);
                        break;
                    case R.id.restart:
                        restart();
                        break;

                }

            }
        };


        init();


    }

    public void init(){
        b00 = (Button) findViewById(R.id.b00);
        b01 = (Button) findViewById(R.id.b01);
        b02 = (Button) findViewById(R.id.b02);
        b03 = (Button) findViewById(R.id.b03);
        b04 = (Button) findViewById(R.id.b04);
        b10 = (Button) findViewById(R.id.b10);
        b11 = (Button) findViewById(R.id.b11);
        b12 = (Button) findViewById(R.id.b12);
        b13 = (Button) findViewById(R.id.b13);
        b14 = (Button) findViewById(R.id.b14);
        b20 = (Button) findViewById(R.id.b20);
        b21 = (Button) findViewById(R.id.b21);
        b22 = (Button) findViewById(R.id.b22);
        b23 = (Button) findViewById(R.id.b23);
        b24 = (Button) findViewById(R.id.b24);
        b30 = (Button) findViewById(R.id.b30);
        b31 = (Button) findViewById(R.id.b31);
        b32 = (Button) findViewById(R.id.b32);
        b33 = (Button) findViewById(R.id.b33);
        b34 = (Button) findViewById(R.id.b34);
        b40 = (Button) findViewById(R.id.b40);
        b41 = (Button) findViewById(R.id.b41);
        b42 = (Button) findViewById(R.id.b42);
        b43 = (Button) findViewById(R.id.b43);
        b44 = (Button) findViewById(R.id.b44);
        br = (Button) findViewById(R.id.restart);
        tv=(TextView)findViewById(R.id.textView);
        b00.setOnClickListener(oclBtn);
        b01.setOnClickListener(oclBtn);
        b02.setOnClickListener(oclBtn);
        b03.setOnClickListener(oclBtn);
        b04.setOnClickListener(oclBtn);
        b10.setOnClickListener(oclBtn);
        b11.setOnClickListener(oclBtn);
        b12.setOnClickListener(oclBtn);
        b13.setOnClickListener(oclBtn);
        b14.setOnClickListener(oclBtn);
        b20.setOnClickListener(oclBtn);
        b21.setOnClickListener(oclBtn);
        b22.setOnClickListener(oclBtn);
        b23.setOnClickListener(oclBtn);
        b24.setOnClickListener(oclBtn);
        b30.setOnClickListener(oclBtn);
        b31.setOnClickListener(oclBtn);
        b32.setOnClickListener(oclBtn);
        b33.setOnClickListener(oclBtn);
        b34.setOnClickListener(oclBtn);
        b40.setOnClickListener(oclBtn);
        b41.setOnClickListener(oclBtn);
        b42.setOnClickListener(oclBtn);
        b43.setOnClickListener(oclBtn);
        b44.setOnClickListener(oclBtn);
        br.setOnClickListener(oclBtn);

    }


    public void update(Button b, int x, int y){
        if(logic.isVictory()) {
            if (grid.getTurn() == 'x') {
                if (grid.getContent(x, y) == 'e') {
                    b.setText("O");
                    grid.setTurn('o');
                    grid.setMessage("hodit P2");
                    tv.setText(grid.getMessage());
                } else if (grid.getContent(x,y)=='b'){
                    b.setText("X");
                    grid.setContent(x, y, 'z');
                    grid.setMessage("P1  na b");
                    grid.setTurn('o');
                    tv.setText(grid.getMessage());
                    p1++;
                }
            } else if (grid.getTurn() == 'o') {
                if (grid.getContent(x, y) == 'e') {
                    b.setText("O");
                    grid.setTurn('x');
                    grid.setMessage("hodit P1");
                    tv.setText(grid.getMessage());
                } else if (grid.getContent(x,y)=='b'){
                    b.setText("X");
                    grid.setContent(x, y, 'z');
                    grid.setMessage("P2 na b");
                    tv.setText(grid.getMessage());
                    grid.setTurn('x');
                    p2++;
                }
                if(p1>p2){
                    grid.setP1(p1);
                }
                else if(p1<p2){
                    grid.setP2(p2);
                }
            }
        }
        else {
            tv.setText(grid.getMessage());
        }
    }
    public void restart(){
        logic.restart();
        //grid.fillE();
        fillnull();
        grid.setP1(0);
        grid.setP2(0);
        p1=0;
        p2=0;
        tv.setText("hodit p1");

    }

    public void fillnull(){
        b00.setText(" ");
        b01.setText(" ");
        b02.setText(" ");
        b03.setText(" ");
        b04.setText(" ");
        b10.setText(" ");
        b11.setText(" ");
        b12.setText(" ");
        b13.setText(" ");
        b14.setText(" ");
        b20.setText(" ");
        b21.setText(" ");
        b22.setText(" ");
        b23.setText(" ");
        b24.setText(" ");
        b30.setText(" ");
        b31.setText(" ");
        b32.setText(" ");
        b33.setText(" ");
        b34.setText(" ");
        b40.setText(" ");
        b41.setText(" ");
        b42.setText(" ");
        b43.setText(" ");
        b44.setText(" ");

    }




    }






