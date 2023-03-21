package com.example.tiktactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;int flag = 0;int count = 0;
String b1 = "", b2 = "", b3 = "", b4 = "", b5 = "", b6 = "", b7 = "", b8 = "", b9 = "";
TextView tv_turn_ind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void check(View view){
        Button btn = (Button)view;
        if(btn.getText().toString().equals("")){

            if(flag == 0){
                flag = 1;
                btn.setText("X");
                tv_turn_ind.setText(R.string.player_turn_msg_0);
            }
            else{
                flag = 0;
                btn.setText("0");
                tv_turn_ind.setText(R.string.player_turn_msg_x);
            }
            count++;
            if(count>4){
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();

                // Log all the variables before checking for winner
                Log.d("check", "Variables before checking for winner: count=" + count + ", flag=" + flag); // Log the first two variables
                Log.d("check", "Variables before checking for winner: b1=" + b1 + ", b2=" + b2 + ", b3=" + b3); // Log the next three variables
                Log.d("check", "Variables before checking for winner: b4=" + b4 + ", b5=" + b5 + ", b6=" + b6); // Log the next three variables
                Log.d("check", "Variables before checking for winner: b7=" +b7+ ", b8=" +b8+ ",b9=" +b9); // Log the last three variables
                if(!b1.equals("") && b1.equals(b2) && b1.equals(b3)){
                    restart();
                    Toast.makeText(this,"winner " + b1,Toast.LENGTH_SHORT).show();
                }
                else if(!b4.equals("") && b4.equals(b5) && b4.equals(b6)){
                    restart();
                    Toast.makeText(this,"winner " + b4,Toast.LENGTH_SHORT).show();
                }
                else if(!b7.equals("") && b7.equals(b8) && b7.equals(b9)){
                    restart();
                    Toast.makeText(this,"winner " + b7,Toast.LENGTH_SHORT).show();
                }
                else if(!b1.equals("") && b1.equals(b4) && b1.equals(b7)){
                    restart();
                    Toast.makeText(this,"winner " + b1,Toast.LENGTH_SHORT).show();
                }
                else if(!b2.equals("") && b2.equals(b5) && b2.equals(b8)){
                    restart();
                    Toast.makeText(this,"winner " + b2,Toast.LENGTH_SHORT).show();
                }
                else if(!b3.equals("") && b3.equals(b6) && b3.equals(b9)){
                    restart();
                    Toast.makeText(this,"winner " + b3,Toast.LENGTH_SHORT).show();
                }
                else if(!b1.equals("") && b1.equals(b5) && b1.equals(b9)){
                    restart();
                    Toast.makeText(this,"winner " + b1,Toast.LENGTH_SHORT).show();
                }
                else if(!b7.equals("") && b7.equals(b5) && b7.equals(b3)){
                    restart();
                    Toast.makeText(this,"winner " + b7,Toast.LENGTH_SHORT).show();
                }
                if(count == 9){
                    restart();
                    Toast.makeText(this,"DRAW",Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
    public void restart(){
        count = 0; flag = 0;
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        tv_turn_ind.setText(R.string.player_turn_msg_x);
    }
    public void init(){
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        tv_turn_ind = findViewById(R.id.tv_turn_ind);
       }
}